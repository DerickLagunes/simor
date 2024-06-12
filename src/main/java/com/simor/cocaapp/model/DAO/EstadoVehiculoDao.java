package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.EstadoVehiculo;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstadoVehiculoDao  {
    public List<EstadoVehiculo> findAll(){
        List<EstadoVehiculo> listaEstadoVehiculo = new ArrayList<>();
        String query = "select * from estado_vehiculo";
        try (Connection con= DatabaseConnectionManager.getConnection()){
            try (PreparedStatement ps = con.prepareStatement(query)){
                try (ResultSet res = ps.executeQuery()) {
                    while (res.next()) {
                        EstadoVehiculo estadoVehiculo = new EstadoVehiculo();
                        estadoVehiculo.setId_estado(res.getInt("id_estado"));
                        estadoVehiculo.setLuces_galibo(res.getInt("luces_galibo"));
                        estadoVehiculo.setLuces_altas(res.getInt("luces_altas"));
                        estadoVehiculo.setLuces_bajas(res.getInt("luces_bajas"));
                        estadoVehiculo.setLuces_demarcadoras(res.getInt("luces_demarcadoras"));
                        estadoVehiculo.setLuces_indicadoras(res.getInt("luces_indicadoras"));
                        estadoVehiculo.setLlantas_rines_delanteros(res.getInt("llantas_rines_delanteros"));
                        estadoVehiculo.setLlantas_rines_traseros(res.getInt("llantas_rines_traseros"));
                        estadoVehiculo.setLlantas_masas_delanteras(res.getInt("llantas_masas_delanteras"));
                        estadoVehiculo.setLlantas_masas_traseras(res.getInt("llantas_masas_traseras"));
                        estadoVehiculo.setLlantas_presion(res.getInt("llantas_presion"));
                        estadoVehiculo.setLlantas_profundidad(res.getInt("llantas_profundidad"));
                        estadoVehiculo.setLlantas_birlos_delanteros(res.getInt("llantas_birlos_delanteros"));
                        estadoVehiculo.setLlantas_birlos_traseros(res.getInt("llantas_birlos_traseros"));
                        estadoVehiculo.setLlantas_tuercas_delanteros(res.getInt("llantas_tuercas_delanteros"));
                        estadoVehiculo.setLlantas_tuercas_traseros(res.getInt("llantas_tuercas_traseros"));
                        estadoVehiculo.setCaja_direccion(res.getInt("caja_direccion"));
                        estadoVehiculo.setDeposito_aceite(res.getInt("deposito_aceite"));
                        estadoVehiculo.setParabrisas(res.getInt("parabrisas"));
                        estadoVehiculo.setLimpiaparabrisas(res.getInt("limpiaparabrisas"));
                        estadoVehiculo.setHuelgo(res.getInt("huelgo"));
                        estadoVehiculo.setEscape(res.getInt("escape"));
                        listaEstadoVehiculo.add(estadoVehiculo);
                    }
                }
             }
        } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
        return listaEstadoVehiculo;

    }

    public Object findOne(int id_estado){
        EstadoVehiculo estadoVehiculo= new EstadoVehiculo();
        String query = "select * from estado_vehiculo where id_estado = ?";
        try (Connection con=DatabaseConnectionManager.getConnection()){
            try (PreparedStatement stmt = con.prepareStatement(query)){
                stmt.setInt(1, id_estado);
                try (ResultSet res = stmt.executeQuery()){
                    if (res.next()){
                        estadoVehiculo.setId_estado(res.getInt("id_estado"));
                        estadoVehiculo.setLuces_galibo(res.getInt("luces_galibo"));
                        estadoVehiculo.setLuces_altas(res.getInt("luces_altas"));
                        estadoVehiculo.setLuces_bajas(res.getInt("luces_bajas"));
                        estadoVehiculo.setLuces_demarcadoras(res.getInt("luces_demarcadoras"));
                        estadoVehiculo.setLuces_indicadoras(res.getInt("luces_indicadoras"));
                        estadoVehiculo.setLlantas_rines_delanteros(res.getInt("llantas_rines_delanteros"));
                        estadoVehiculo.setLlantas_rines_traseros(res.getInt("llantas_rines_trasos"));
                        estadoVehiculo.setLlantas_masas_delanteras(res.getInt("llantas_masas_delanteras"));
                        estadoVehiculo.setLlantas_masas_traseras(res.getInt("llantas_masas_traseras"));
                        estadoVehiculo.setLlantas_presion(res.getInt("llantas_presion"));
                        estadoVehiculo.setLlantas_profundidad(res.getInt("llantas_profundidad"));
                        estadoVehiculo.setLlantas_birlos_delanteros(res.getInt("llantas_birlos_delanteros"));
                        estadoVehiculo.setLlantas_birlos_traseros(res.getInt("llantas_birlos_traseros"));
                        estadoVehiculo.setLlantas_tuercas_delanteros(res.getInt("llantas_tuercas_delanteros"));
                        estadoVehiculo.setLlantas_tuercas_traseros(res.getInt("llantas_tuercas_traseros"));
                        estadoVehiculo.setCaja_direccion(res.getInt("caja_direccion"));
                        estadoVehiculo.setDeposito_aceite(res.getInt("deposito_aceite"));
                        estadoVehiculo.setParabrisas(res.getInt("parabrisas"));
                        estadoVehiculo.setLimpiaparabrisas(res.getInt("limpiaparabrisas"));
                        estadoVehiculo.setHuelgo(res.getInt("huelgo"));
                        estadoVehiculo.setEscape(res.getInt("escape"));
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return estadoVehiculo;
    }

    public void guardarEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        String query = "INSERT INTO estado_vehiculo (luces_galibo, luces_altas, luces_bajas, luces_demarcadoras, luces_indicadoras) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = DatabaseConnectionManager.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, estadoVehiculo.getLuces_galibo());
            ps.setInt(2, estadoVehiculo.getLuces_altas());
            ps.setInt(3, estadoVehiculo.getLuces_bajas());
            ps.setInt(4, estadoVehiculo.getLuces_demarcadoras());
            ps.setInt(5, estadoVehiculo.getLuces_indicadoras());

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
