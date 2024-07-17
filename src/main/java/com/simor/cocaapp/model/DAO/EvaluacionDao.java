package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.*;
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

    public Evaluacion getOne(int id_evaluacion){
        Evaluacion e = new Evaluacion();
        String query="select e.*,ee.fecha_de_evaluacion from evaluacion as e join economico_evaluacion ee on e.id_evaluacion = ee.id_evaluacion where e.id_evaluacion = ?";
        try (Connection con=DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setInt(1, id_evaluacion);
                try (ResultSet res = stmt.executeQuery()) {
                    if (res.next()) {

                        Timestamp fecha_de_evaluacion = res.getTimestamp("fecha_de_evaluacion");
                        e.setFecha_de_evaluacion(fecha_de_evaluacion); //Timestamp

                        e.setId_evaluacion(id_evaluacion);

                        int id_usuario = res.getInt("id_usuario");
                        e.setId_usuario(id_usuario);

                        int luces_galibo = res.getInt("luces_galibo");
                        e.setLuces_galibo(luces_galibo);

                        int luces_altas = res.getInt("luces_altas");
                        e.setLuces_altas(luces_altas);

                        int luces_bajas = res.getInt("luces_bajas");
                        e.setLuces_bajas(luces_bajas);

                        int luces_demarcadoras_delanteras = res.getInt("luces_demarcadoras_delanteras");
                        e.setLuces_demarcadoras_delanteras(luces_demarcadoras_delanteras);

                        int luces_demarcadoras_traseras = res.getInt("luces_demarcadoras_traseras");
                        e.setLuces_demarcadoras_traseras(luces_demarcadoras_traseras);

                        int luces_indicadoras = res.getInt("luces_indicadoras");
                        e.setLuces_indicadoras(luces_indicadoras);

                        int llantas_rines_delanteros = res.getInt("llantas_rines_delanteros");
                        e.setLlantas_rines_delanteros(llantas_rines_delanteros);

                        int llantas_rines_traseros = res.getInt("llantas_rines_traseros");
                        e.setLlantas_rines_traseros(llantas_rines_traseros);

                        int llantas_masas_delanteras = res.getInt("llantas_masas_delanteras");
                        e.setLlantas_masas_delanteras(llantas_masas_delanteras);

                        int llantas_masas_traseras = res.getInt("llantas_masas_traseras");
                        e.setLlantas_masas_traseras(llantas_masas_traseras);

                        int llantas_presion_delantera_izquierda = res.getInt("llantas_presion_delantera_izquierda");
                        e.setLlantas_presion_delantera_izquierda(llantas_presion_delantera_izquierda);

                        int llantas_presion_delantera_derecha = res.getInt("llantas_presion_delantera_derecha");
                        e.setLlantas_presion_delantera_derecha(llantas_presion_delantera_derecha);

                        int llantas_presion_trasera_izquierda_1 = res.getInt("llantas_presion_trasera_izquierda_1");
                        e.setLlantas_presion_trasera_izquierda_1(llantas_presion_trasera_izquierda_1);

                        int llantas_presion_trasera_izquierda_2 = res.getInt("llantas_presion_trasera_izquierda_2");
                        e.setLlantas_presion_trasera_izquierda_2(llantas_presion_trasera_izquierda_2);

                        int llantas_presion_trasera_derecha_1 = res.getInt("llantas_presion_trasera_derecha_1");
                        e.setLlantas_presion_trasera_derecha_1(llantas_presion_trasera_derecha_1);

                        int llantas_presion_trasera_derecha_2 = res.getInt("llantas_presion_trasera_derecha_2");
                        e.setLlantas_presion_trasera_derecha_2(llantas_presion_trasera_derecha_2);

                        int llantas_profundidad_delantera_izquierda = res.getInt("llantas_profundidad_delantera_izquierda");
                        e.setLlantas_profundidad_delantera_izquierda(llantas_profundidad_delantera_izquierda);

                        int llantas_profundidad_delantera_derecha = res.getInt("llantas_profundidad_delantera_derecha");
                        e.setLlantas_profundidad_delantera_derecha(llantas_profundidad_delantera_derecha);

                        int llantas_profundidad_trasera_izquierda_1 = res.getInt("llantas_profundidad_trasera_izquierda_1");
                        e.setLlantas_profundidad_trasera_izquierda_1(llantas_profundidad_trasera_izquierda_1);

                        int llantas_profundidad_trasera_izquierda_2 = res.getInt("llantas_profundidad_trasera_izquierda_2");
                        e.setLlantas_profundidad_trasera_izquierda_2(llantas_profundidad_trasera_izquierda_2);

                        int llantas_profundidad_trasera_derecha_1 = res.getInt("llantas_profundidad_trasera_derecha_1");
                        e.setLlantas_profundidad_trasera_derecha_1(llantas_profundidad_trasera_derecha_1);

                        int llantas_profundidad_trasera_derecha_2 = res.getInt("llantas_profundidad_trasera_derecha_2");
                        e.setLlantas_profundidad_trasera_derecha_2(llantas_profundidad_trasera_derecha_2);

                        int llantas_birlos_delantera_izquierda = res.getInt("llantas_birlos_delantera_izquierda");
                        e.setLlantas_birlos_delantera_izquierda(llantas_birlos_delantera_izquierda);

                        int llantas_birlos_delantera_derecha = res.getInt("llantas_birlos_delantera_derecha");
                        e.setLlantas_birlos_delantera_derecha(llantas_birlos_delantera_derecha);

                        int llantas_birlos_trasera_izquierda = res.getInt("llantas_birlos_trasera_izquierda");
                        e.setLlantas_birlos_trasera_izquierda(llantas_birlos_trasera_izquierda);

                        int llantas_birlos_trasera_derecha = res.getInt("llantas_birlos_trasera_derecha");
                        e.setLlantas_birlos_trasera_derecha(llantas_birlos_trasera_derecha);

                        int llantas_birlos_delantera_izquierda_num = res.getInt("llantas_birlos_delantera_izquierda_num");
                        e.setLlantas_birlos_delantera_izquierda_num(llantas_birlos_delantera_izquierda_num);

                        int llantas_birlos_delantera_derecha_num = res.getInt("llantas_birlos_delantera_derecha_num");
                        e.setLlantas_birlos_delantera_derecha_num(llantas_birlos_delantera_derecha_num);

                        int llantas_birlos_trasera_izquierda_num = res.getInt("llantas_birlos_trasera_izquierda_num");
                        e.setLlantas_birlos_trasera_izquierda_num(llantas_birlos_trasera_izquierda_num);

                        int llantas_birlos_trasera_derecha_num = res.getInt("llantas_birlos_trasera_derecha_num");
                        e.setLlantas_birlos_trasera_derecha_num(llantas_birlos_trasera_derecha_num);

                        int llantas_tuercas_delantera_izquierda = res.getInt("llantas_tuercas_delantera_izquierda");
                        e.setLlantas_tuercas_delantera_izquierda(llantas_tuercas_delantera_izquierda);

                        int llantas_tuercas_delantera_derecha = res.getInt("llantas_tuercas_delantera_derecha");
                        e.setLlantas_tuercas_delantera_derecha(llantas_tuercas_delantera_derecha);

                        int llantas_tuercas_trasera_izquierda = res.getInt("llantas_tuercas_trasera_izquierda");
                        e.setLlantas_tuercas_trasera_izquierda(llantas_tuercas_trasera_izquierda);

                        int llantas_tuercas_trasera_derecha = res.getInt("llantas_tuercas_trasera_derecha");
                        e.setLlantas_tuercas_trasera_derecha(llantas_tuercas_trasera_derecha);

                        int llantas_tuercas_delantera_izquierda_num = res.getInt("llantas_tuercas_delantera_izquierda_num");
                        e.setLlantas_tuercas_delantera_izquierda_num(llantas_tuercas_delantera_izquierda_num);

                        int llantas_tuercas_delantera_derecha_num = res.getInt("llantas_tuercas_delantera_derecha_num");
                        e.setLlantas_tuercas_delantera_derecha_num(llantas_tuercas_delantera_derecha_num);

                        int llantas_tuercas_trasera_izquierda_num = res.getInt("llantas_tuercas_trasera_izquierda_num");
                        e.setLlantas_tuercas_trasera_izquierda_num(llantas_tuercas_trasera_izquierda_num);

                        int llantas_tuercas_trasera_derecha_num = res.getInt("llantas_tuercas_trasera_derecha_num");
                        e.setLlantas_tuercas_trasera_derecha_num(llantas_tuercas_trasera_derecha_num);

                        int caja_direccion = res.getInt("caja_direccion");
                        e.setCaja_direccion(caja_direccion);

                        int deposito_aceite = res.getInt("deposito_aceite");
                        e.setDeposito_aceite(deposito_aceite);

                        int parabrisas = res.getInt("parabrisas");
                        e.setParabrisas(parabrisas);

                        int limpiaparabrisas = res.getInt("limpiaparabrisas");
                        e.setLimpiaparabrisas(limpiaparabrisas);

                        int huelgo = res.getInt("huelgo");
                        e.setHuelgo(huelgo);

                        int huelgo_cuanto = res.getInt("huelgo_cuanto");
                        e.setHuelgo_cuanto(huelgo_cuanto);

                        int escape = res.getInt("escape");
                        e.setEscape(escape);
                    }
                }
            }
        }catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            return e;
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

    public Data getEconomico(int id_evaluacion) {
        Economico e = new Economico();
        Cedis c = new Cedis();
        Data d = new Data();
        String query="SELECT e.id_economico, c.nombre_cedis, c.region, e.placa, ee.fecha_de_evaluacion " +
                "FROM economico_evaluacion AS ee " +
                "JOIN economicos AS e ON ee.id_economico=e.id_economico " +
                "JOIN cedis AS c ON c.id_cedis=e.id_cedis " +
                "WHERE ee.id_evaluacion = ?";
        try (Connection con=DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setInt(1, id_evaluacion);
                try (ResultSet res = stmt.executeQuery()) {
                    if (res.next()) {
                        String id_economico = res.getString("id_economico");
                        String nombre_cedis = res.getString("nombre_cedis");
                        String region = res.getString("region");
                        String placa = res.getString("placa");
                        Timestamp fecha_de_evaluacion = res.getTimestamp("fecha_de_evaluacion");

                        e.setId_economico(id_economico);
                        e.setPlaca(placa);
                        c.setNombre_cedis(nombre_cedis);
                        c.setRegion(region);
                        d.setFecha_de_evaluacion(fecha_de_evaluacion);
                        d.setEconomico(e);
                        d.setCedis(c);
                    }
                }
            }
        }catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return d;
    }
}


