package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.Evaluacion;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstadoVehiculoDao  {
    public List<Evaluacion> findAll(){
        List<Evaluacion> listaEvaluacion = new ArrayList<>();
        String query = "select * from estado_vehiculo";
        try (Connection con= DatabaseConnectionManager.getConnection()){
            try (PreparedStatement ps = con.prepareStatement(query)){
                try (ResultSet res = ps.executeQuery()) {
                    while (res.next()) {
                        Evaluacion evaluacion = new Evaluacion();
                        evaluacion.setId_evaluacion(res.getInt("id_evaluacion"));
                        evaluacion.setLuces_galibo(res.getInt("luces_galibo"));
                        evaluacion.setLuces_altas(res.getInt("luces_altas"));
                        evaluacion.setLuces_bajas(res.getInt("luces_bajas"));
                        evaluacion.setLuces_indicadoras(res.getInt("luces_indicadoras"));
                        evaluacion.setLlantas_rines_delanteros(res.getInt("llantas_rines_delanteros"));
                        evaluacion.setLlantas_rines_traseros(res.getInt("llantas_rines_traseros"));
                        evaluacion.setLlantas_masas_delanteras(res.getInt("llantas_masas_delanteras"));
                        evaluacion.setLlantas_masas_traseras(res.getInt("llantas_masas_traseras"));
                        evaluacion.setCaja_direccion(res.getInt("caja_direccion"));
                        evaluacion.setDeposito_aceite(res.getInt("deposito_aceite"));
                        evaluacion.setParabrisas(res.getInt("parabrisas"));
                        evaluacion.setLimpiaparabrisas(res.getInt("limpiaparabrisas"));
                        evaluacion.setHuelgo(res.getInt("huelgo"));
                        evaluacion.setEscape(res.getInt("escape"));
                        listaEvaluacion.add(evaluacion);
                    }
                }
             }
        } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
        return listaEvaluacion;

    }

    public Object findOne(int id_estado){
        Evaluacion evaluacion = new Evaluacion();
        String query = "select * from estado_vehiculo where id_estado = ?";
        try (Connection con=DatabaseConnectionManager.getConnection()){
            try (PreparedStatement stmt = con.prepareStatement(query)){
                stmt.setInt(1, id_estado);
                try (ResultSet res = stmt.executeQuery()){
                    if (res.next()){
                        evaluacion.setId_evaluacion(res.getInt("id_evaluacion"));
                        evaluacion.setLuces_galibo(res.getInt("luces_galibo"));
                        evaluacion.setLuces_altas(res.getInt("luces_altas"));
                        evaluacion.setLuces_bajas(res.getInt("luces_bajas"));
                        evaluacion.setLuces_indicadoras(res.getInt("luces_indicadoras"));
                        evaluacion.setLlantas_rines_delanteros(res.getInt("llantas_rines_delanteros"));
                        evaluacion.setLlantas_rines_traseros(res.getInt("llantas_rines_trasos"));
                        evaluacion.setLlantas_masas_delanteras(res.getInt("llantas_masas_delanteras"));
                        evaluacion.setLlantas_masas_traseras(res.getInt("llantas_masas_traseras"));
                        evaluacion.setCaja_direccion(res.getInt("caja_direccion"));
                        evaluacion.setDeposito_aceite(res.getInt("deposito_aceite"));
                        evaluacion.setParabrisas(res.getInt("parabrisas"));
                        evaluacion.setLimpiaparabrisas(res.getInt("limpiaparabrisas"));
                        evaluacion.setHuelgo(res.getInt("huelgo"));
                        evaluacion.setEscape(res.getInt("escape"));
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return evaluacion;
    }

    public void guardarEstadoVehiculo(Evaluacion evaluacion) {
        String query = "INSERT INTO estado_vehiculo (luces_galibo, luces_altas, luces_bajas, luces_demarcadoras, luces_indicadoras) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DatabaseConnectionManager.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, evaluacion.getLuces_galibo());
            ps.setInt(2, evaluacion.getLuces_altas());
            ps.setInt(3, evaluacion.getLuces_bajas());
            ps.setInt(5, evaluacion.getLuces_indicadoras());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
