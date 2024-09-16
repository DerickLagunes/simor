package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.Dictamen;
import com.simor.cocaapp.model.Economico;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DictamenDao {

    //Llamar solo si se registran ambos semestres
    public int insert(Dictamen dictamen, Economico economico) {
        int id_dictamen = 0;
        String query_check = "select * from dictamen " +
                "join dictamen_economico on dictamen_economico.id_dictamen = dictamen.id_dictamen " +
                "where dictamen_economico.id_economico = ?";
        try (Connection con= DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query_check)) {
                stmt.setString(1, economico.getId_economico());
                System.out.println(stmt.toString());
                try (ResultSet res = stmt.executeQuery()) {
                    if (res.next()) {
                        dictamen.setId_dictamen(res.getInt("dictamen.id_dictamen"));
                        insert_second_semester(dictamen);
                    }else{
                        dictamen.setId_dictamen(insert_first_semester(dictamen));
                    }
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return dictamen.getId_dictamen();
    }

    //Llamar solo si se registra el primer semestre
    public int insert_first_semester(Dictamen dictamen) {
        int id_dictamen = 0;
        String query = "INSERT INTO dictamen " +
                "(folio_humo_1, folio_fisico_1, archivo_humo_1, archivo_fisico_1) " +
                "VALUES (?, ?, ?, ?);";
        try (Connection con= DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, dictamen.getFolio_humo_1());
                stmt.setString(2, dictamen.getFolio_fisico_1());
                stmt.setString(3, dictamen.getArchivo_humo_1());
                stmt.setString(4, dictamen.getArchivo_fisico_1());
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

    //Llamar solo si se registra el segundo semestre
    public int insert_second_semester(Dictamen dictamen) {
        int id_dictamen = 0;
        String query = "UPDATE dictamen SET folio_humo_2 = ?, folio_fisico_2 = ?, " +
                "archivo_humo_2 = ?, archivo_fisico_2 = ? WHERE id_dictamen = ?";
        try (Connection con= DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setString(1, dictamen.getFolio_humo_2());
                stmt.setString(2, dictamen.getFolio_fisico_2());
                stmt.setString(3, dictamen.getArchivo_humo_2());
                stmt.setString(4, dictamen.getArchivo_fisico_2());
                stmt.setInt(5, dictamen.getId_dictamen());
                if(stmt.executeUpdate()>0){
                    id_dictamen = 1;
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return dictamen.getId_dictamen();
    }

    public boolean insertRelation(Dictamen dictamen, Economico economico) {
        boolean flag = false;
        String query = "INSERT INTO dictamen_economico (id_economico, id_dictamen) VALUES (?, ?);";
        try (Connection con= DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setString(1, economico.getId_economico());
                stmt.setInt(2, dictamen.getId_dictamen());
                System.out.println(stmt.toString());
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
                        d.setFolio_humo_1(res.getString("folio_humo_1"));
                        d.setFolio_fisico_1(res.getString("folio_fisico_1"));
                        d.setArchivo_humo_1(res.getString("archivo_humo_1"));
                        d.setArchivo_fisico_1(res.getString("archivo_fisico_1"));
                        d.setFolio_humo_2(res.getString("folio_humo_2"));
                        d.setFolio_fisico_2(res.getString("folio_fisico_2"));
                        d.setArchivo_humo_2(res.getString("archivo_humo_2"));
                        d.setArchivo_fisico_2(res.getString("archivo_fisico_2"));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return d;
    }
}
