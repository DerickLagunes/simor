package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.Economico;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EconomicoDao {
    public List<Economico> findAll() {
        List<Economico> listaEconomico = new ArrayList<>();
        String query = "select * from economicos";
        try (Connection con = DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                try (ResultSet res = stmt.executeQuery()) {
                    while (res.next()) {
                        Economico economico = new Economico();
                        economico.setId_economico(res.getString("id_economico"));
                        economico.setId_cedis(res.getInt("id_cedis"));
                        listaEconomico.add(economico);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaEconomico;
    }

    public List<Economico> findAllByCedis(int id_cedis) {
        List<Economico> listaEconomico = new ArrayList<>();
        String query = "select * from economicos where id_cedis = ?";
        try (Connection con = DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setInt(1,id_cedis);
                try (ResultSet res = stmt.executeQuery()) {
                    while (res.next()) {
                        Economico economico = new Economico();
                        economico.setId_economico(res.getString("id_economico"));
                        economico.setId_cedis(res.getInt("id_cedis"));
                        economico.setPlaca(res.getString("placa"));
                        economico.setId_usuario(res.getInt("id_usuario"));
                        listaEconomico.add(economico);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaEconomico;
    }

    public Object findOne(String id_economico, int id_cedis) {
        Economico economico = new Economico();
        String query = "select * from economicos where id_economico = ? and id_cedis = ?";
        try (Connection con=DatabaseConnectionManager.getConnection()){
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setString(1, id_economico);
                stmt.setInt(2, id_cedis);
                try (ResultSet res = stmt.executeQuery()) {
                    if (res.next()) {
                        economico.setId_economico(res.getString("id_economico"));
                        economico.setId_cedis(res.getInt("id_cedis"));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return economico;
    }

    public boolean insert(Economico economico) {
        boolean flag = false;
        String query = "insert into economicos(id_economico, id_cedis, placa, id_usuario) values(?,?,?,?)";
        try (Connection con=DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setString(1, economico.getId_economico());
                stmt.setInt(2, economico.getId_cedis());
                stmt.setString(3, economico.getPlaca());
                stmt.setInt(4, economico.getId_usuario());
                if(stmt.executeUpdate()>0){
                    flag = true;
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    public String insertWKey(Economico economico) {
        String id_economico = "";
        String query = "insert into economicos(id_economico, id_cedis, placa, id_usuario) values(?,?,?,?)";
        try (Connection con=DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                stmt.setString(1, economico.getId_economico());
                stmt.setInt(2, economico.getId_cedis());
                stmt.setString(3, economico.getPlaca());
                stmt.setInt(4, economico.getId_usuario());
                if(stmt.executeUpdate()>0) {
                    // Obtiene las claves generadas
                    ResultSet generatedKeys = stmt.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        id_economico = generatedKeys.getString(1);
                    }
                    generatedKeys.close();
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return id_economico;
    }
}
