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
        String query = "select * from Economico";
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

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaEconomico;
    }

    public Object findOne(String id_economico, int id_cedis) {
        Economico economico = new Economico();
        String query = "select * from Economico where id_economico = ? and id_cedis = ?";
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
}
