package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.EconomicoEvaluacion;
import com.simor.cocaapp.model.Evaluacion;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EvaluacionDao {
    public List<EconomicoEvaluacion> findAll(){
        List<EconomicoEvaluacion> listaEconomicoEvaluacion = new ArrayList<>();
        String query = "select * from evaluacion";
        try (Connection con= DatabaseConnectionManager.getConnection()){
            try (Statement stmt = con.createStatement()){
                try (ResultSet res = stmt.executeQuery(query)){
                    while (res.next()){
                        EconomicoEvaluacion estadoEconomico = new EconomicoEvaluacion();
                        estadoEconomico.setId_economico(res.getString("id_economico"));
                        estadoEconomico.setFecha_de_evaluacion(res.getTimestamp("fecha_de_evaluacion"));
                        listaEconomicoEvaluacion.add(estadoEconomico);
                    }
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return listaEconomicoEvaluacion;
    }

    public Object findOne(int idEstado, int idEconomico){
        EconomicoEvaluacion estadoEconomico = new EconomicoEvaluacion();
        String query="select * from evaluacion where id_evaluacion = ? and id_economico = ?";
        try (Connection con=DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setInt(1, idEstado);
                stmt.setInt(2, idEconomico);
                try (ResultSet res = stmt.executeQuery()) {
                    if (res.next()) {
                        estadoEconomico.setId_evaluacion(res.getInt("id_evaluacion"));
                        estadoEconomico.setId_economico(res.getString("id_economico"));
                        estadoEconomico.setFecha_de_evaluacion(res.getTimestamp("fecha_de_evaluacion"));
                    }

                }
            }
        }catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return estadoEconomico;
        }


    public int insert(Evaluacion evaluacion) {
        int id_evaluacion = 0;
        String query = "INSERT INTO evaluacion (\n" +
                "    luces_galibo, luces_altas, luces_bajas, luces_demarcadoras_delanteras, luces_demarcadoras_traseras,\n" +
                "    luces_indicadoras, llantas_rines_delanteros, llantas_rines_traseros, llantas_masas_delanteras, llantas_masas_traseras,\n" +
                "    llantas_presion_delantera_izquierda, llantas_presion_delantera_derecha, llantas_presion_trasera_izquierda_1, llantas_presion_trasera_izquierda_2,\n" +
                "    llantas_presion_trasera_derecha_1, llantas_presion_trasera_derecha_2, llantas_profundidad_delantera_izquierda, llantas_profundidad_delantera_derecha,\n" +
                "    llantas_profundidad_trasera_izquierda_1, llantas_profundidad_trasera_izquierda_2, llantas_profundidad_trasera_derecha_1, llantas_profundidad_trasera_derecha_2,\n" +
                "    llantas_birlos_delantera_izquierda, llantas_birlos_delantera_derecha, llantas_birlos_trasera_izquierda, llantas_birlos_trasera_derecha,\n" +
                "    llantas_birlos_delantera_izquierda_num, llantas_birlos_delantera_derecha_num, llantas_birlos_trasera_izquierda_num, llantas_birlos_trasera_derecha_num,\n" +
                "    llantas_tuercas_delantera_izquierda, llantas_tuercas_delantera_derecha, llantas_tuercas_trasera_izquierda, llantas_tuercas_trasera_derecha,\n" +
                "    llantas_tuercas_delantera_izquierda_num, llantas_tuercas_delantera_derecha_num, llantas_tuercas_trasera_izquierda_num, llantas_tuercas_trasera_derecha_num,\n" +
                "    caja_direccion, deposito_aceite, parabrisas, limpiaparabrisas, huelgo, huelgo_cuanto, escape\n" +
                ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try (Connection con=DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                stmt.setInt(1, evaluacion.getLuces_galibo());
                stmt.setInt(2, evaluacion.getLuces_altas());
                stmt.setInt(3, evaluacion.getLuces_bajas());
                stmt.setInt(4, evaluacion.getLuces_demarcadoras_delanteras());
                stmt.setInt(5, evaluacion.getLuces_demarcadoras_traseras());
                stmt.setInt(6, evaluacion.getLuces_indicadoras());

                stmt.setInt(7, evaluacion.getLlantas_rines_delanteros());
                stmt.setInt(8, evaluacion.getLlantas_rines_traseros());
                stmt.setInt(9, evaluacion.getLlantas_masas_delanteras());
                stmt.setInt(10, evaluacion.getLlantas_masas_traseras());
                stmt.setInt(11, evaluacion.getLlantas_presion_delantera_izquierda());
                stmt.setInt(12, evaluacion.getLlantas_presion_delantera_derecha());
                stmt.setInt(13, evaluacion.getLlantas_presion_trasera_izquierda_1());
                stmt.setInt(14, evaluacion.getLlantas_presion_trasera_izquierda_2());
                stmt.setInt(15, evaluacion.getLlantas_presion_trasera_derecha_1());
                stmt.setInt(16, evaluacion.getLlantas_presion_trasera_derecha_2());
                stmt.setInt(17, evaluacion.getLlantas_profundidad_delantera_izquierda());
                stmt.setInt(18, evaluacion.getLlantas_profundidad_delantera_derecha());
                stmt.setInt(19, evaluacion.getLlantas_profundidad_trasera_izquierda_1());
                stmt.setInt(20, evaluacion.getLlantas_profundidad_trasera_izquierda_2());
                stmt.setInt(21, evaluacion.getLlantas_profundidad_trasera_derecha_1());
                stmt.setInt(22, evaluacion.getLlantas_profundidad_trasera_derecha_2());
                stmt.setInt(23, evaluacion.getLlantas_birlos_delantera_izquierda());
                stmt.setInt(24, evaluacion.getLlantas_birlos_delantera_derecha());
                stmt.setInt(25, evaluacion.getLlantas_birlos_trasera_izquierda());
                stmt.setInt(26, evaluacion.getLlantas_birlos_trasera_derecha());
                stmt.setInt(27, evaluacion.getLlantas_birlos_delantera_izquierda_num());
                stmt.setInt(28, evaluacion.getLlantas_birlos_delantera_derecha_num());
                stmt.setInt(29, evaluacion.getLlantas_birlos_trasera_izquierda_num());
                stmt.setInt(30, evaluacion.getLlantas_birlos_trasera_derecha_num());
                stmt.setInt(31, evaluacion.getLlantas_tuercas_delantera_izquierda());
                stmt.setInt(32, evaluacion.getLlantas_tuercas_delantera_derecha());
                stmt.setInt(33, evaluacion.getLlantas_tuercas_trasera_izquierda());
                stmt.setInt(34, evaluacion.getLlantas_tuercas_trasera_derecha());
                stmt.setInt(35, evaluacion.getLlantas_tuercas_delantera_izquierda_num());
                stmt.setInt(36, evaluacion.getLlantas_tuercas_delantera_derecha_num());
                stmt.setInt(37, evaluacion.getLlantas_tuercas_trasera_izquierda_num());
                stmt.setInt(38, evaluacion.getLlantas_tuercas_trasera_derecha_num());

                stmt.setInt(39, evaluacion.getCaja_direccion());
                stmt.setInt(40, evaluacion.getDeposito_aceite());
                stmt.setInt(41, evaluacion.getParabrisas());
                stmt.setInt(42, evaluacion.getLimpiaparabrisas());
                stmt.setInt(43, evaluacion.getHuelgo());
                stmt.setInt(44, evaluacion.getHuelgo_cuanto());
                stmt.setInt(45, evaluacion.getEscape());

                if(stmt.executeUpdate()>0){
                    // Obtiene las claves generadas
                    ResultSet generatedKeys = stmt.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        id_evaluacion = generatedKeys.getInt(1);
                    }
                    generatedKeys.close();
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return id_evaluacion;
    }
}


