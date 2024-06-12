package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.EconomicoEstado;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EconomicoEstadoDao {
    public List<EconomicoEstado> findAll(){
        List<EconomicoEstado> listaEconomicoEstado = new ArrayList<>();
        String query = "select * from EconomicoEstado";
        try (Connection con= DatabaseConnectionManager.getConnection()){
            try (Statement stmt = con.createStatement()){
                try (ResultSet res = stmt.executeQuery(query)){
                    while (res.next()){
                        EconomicoEstado estadoEconomico = new EconomicoEstado();
                        estadoEconomico.setId_estado(res.getInt("id_estado"));
                        estadoEconomico.setId_economico(res.getString("id_economico"));
                        estadoEconomico.setFecha_de_evaluacion(res.getDate("fecha_de_evaluacion"));
                        listaEconomicoEstado.add(estadoEconomico);
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return listaEconomicoEstado;
    }

    public Object findOne(int idEstado, int idEconomico){
        EconomicoEstado estadoEconomico = new EconomicoEstado();
        String query="selec * from EconomicoEstado where id_estado = ? and id_economico = ?";
        try (Connection con=DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setInt(1, idEstado);
                stmt.setInt(2, idEconomico);
                try (ResultSet res = stmt.executeQuery()) {
                    if (res.next()) {
                        estadoEconomico.setId_estado(res.getInt("id_estado"));
                        estadoEconomico.setId_economico(res.getString("id_economico"));
                        estadoEconomico.setFecha_de_evaluacion(res.getDate("fecha_de_evaluacion"));
                    }

                }
            }
        }catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return estadoEconomico;
        }


    }


