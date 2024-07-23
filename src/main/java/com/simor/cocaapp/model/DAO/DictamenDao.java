package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.Dictamen;
import com.simor.cocaapp.model.Economico;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DictamenDao {
    public int insert(Dictamen dictamen) {
        int id_dictamen = 0;
        String query = "INSERT INTO dictamen (folio_humo, folio_fisico, archivo_humo, archivo_fisico) VALUES (?, ?, ?, ?);";
        try (Connection con= DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, dictamen.getFolio1());
                stmt.setString(2, dictamen.getFolio2());
                stmt.setString(3, dictamen.getArchivo1());
                stmt.setString(4, dictamen.getArchivo2());
                if(stmt.executeUpdate()>0){
                    // Obtiene las claves generadas
                    ResultSet generatedKeys = stmt.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        id_dictamen = generatedKeys.getInt(1);
                    }
                    generatedKeys.close();
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return id_dictamen;
    }

    public boolean insertRelation(Dictamen dictamen, Economico economico) {
        boolean flag = false;
        String query = "INSERT INTO dictamen_economico (id_economico, id_dictamen) VALUES (?, ?);";
        try (Connection con= DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setString(1, economico.getId_economico());
                stmt.setInt(2, dictamen.getId_dictamen());
                if(stmt.executeUpdate()>0){
                    flag = true;
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    public Dictamen getOne(int idDictamen) {
        Dictamen d = new Dictamen();
        String query="select * from dictamen where id_dictamen = ?";
        try (Connection con=DatabaseConnectionManager.getConnection()){
            try (PreparedStatement stmt=con.prepareStatement(query)) {
                stmt.setInt(1, idDictamen);
                try (ResultSet res = stmt.executeQuery()) {
                    if (res.next()) {
                        d.setId_dictamen(res.getInt("id_dictamen"));
                        d.setFolio1(res.getString("folio_humo"));
                        d.setFolio2(res.getString("folio_fisico"));
                        d.setArchivo1(res.getString("archivo_humo"));
                        d.setArchivo2(res.getString("archivo_fisico"));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return d;
    }
}
