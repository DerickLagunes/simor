package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.*;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TablaDao {

    public ArrayList<Tabla> get(int start, int length, String searchTerm, String orderColumn, String orderDir){
        ArrayList<Tabla> lista = new ArrayList<>();
        String query = "SELECT ee.fecha_de_evaluacion, e.placa, e.id_economico, e.id_cedis, c.nombre_cedis, c.region, " +
                "ee.id_evaluacion, d.id_dictamen, d.folio_humo, d.folio_fisico, d.archivo_humo, d.archivo_fisico, ev.id_evaluacion " +
                "FROM economicos AS e " +
                "JOIN cedis AS c ON e.id_cedis = c.id_cedis " +
                "LEFT JOIN economico_evaluacion AS ee on e.id_economico = ee.id_economico " +
                "LEFT JOIN evaluacion as ev on ev.id_evaluacion = ee.id_evaluacion " +
                "LEFT JOIN dictamen_economico de on e.id_economico = de.id_economico " +
                "LEFT JOIN dictamen d on de.id_dictamen = d.id_dictamen " +
                "WHERE e.placa LIKE ? OR e.id_economico LIKE ? OR e.id_cedis LIKE ? " +
                "OR ee.fecha_de_evaluacion LIKE ? OR c.region LIKE ? "+
                "ORDER BY " + orderColumn + " " + orderDir + " LIMIT ? OFFSET ? ;";

        try{
            Connection con = DatabaseConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            String searchPattern = "%" + searchTerm + "%";
            ps.setString(1, searchPattern);
            ps.setString(2, searchPattern);
            ps.setString(3, searchPattern);
            ps.setString(4, searchPattern);
            ps.setString(5, searchPattern);
            ps.setInt(6, length);
            ps.setInt(7, start);

            ResultSet rs = ps.executeQuery();

            //objeto para guardar la lista de evaluaciones en el mismo economico
            Map<String, Tabla> dataMap = new HashMap<>();
            int i = 0;
            while(rs.next()){
                i++;
                String id_economico = rs.getString("id_economico");
                Tabla tabla = dataMap.get(id_economico); //porque cada registro es para un economico

                if(tabla==null){//Si el economico no esta en el objeto mapa
                    tabla = new Tabla();
                    Economico e = new Economico();
                    Cedis c = new Cedis();

                    String placa = rs.getString("placa");
                    int id_cedis = rs.getInt("id_cedis");
                    String region = rs.getString("region");
                    String nombre_cedis = rs.getString("nombre_cedis");

                    e.setId_economico(id_economico);
                    e.setPlaca(placa);
                    e.setId_cedis(id_cedis);
                    c.setId_cedis(id_cedis);
                    c.setRegion(region);
                    c.setNombre_cedis(nombre_cedis);

                    tabla.setEconomico(e);
                    tabla.setCedis(c);

                    dataMap.put(id_economico, tabla);
                }
                Evaluacion evaluacion = new Evaluacion();
                Dictamen dictamen = new Dictamen();

                Timestamp fecha_de_evaluacion = rs.getTimestamp("fecha_de_evaluacion");
                int id_evaluacion = rs.getInt("id_evaluacion");

                evaluacion.setId_evaluacion(id_evaluacion);
                evaluacion.setFecha_de_evaluacion(fecha_de_evaluacion);

                int id_dictamen = rs.getInt("id_dictamen");
                String folio_humo = rs.getString("folio_humo");
                String folio_fisico = rs.getString("folio_fisico");
                String archivo_humo = rs.getString("archivo_humo");
                String archivo_fisico = rs.getString("archivo_fisico");

                dictamen.setId_dictamen(id_dictamen);
                dictamen.setFolio1(folio_humo);
                dictamen.setFolio2(folio_fisico);
                dictamen.setArchivo1(archivo_humo);
                dictamen.setArchivo2(archivo_fisico);

                tabla.getEconomico().getEvaluaciones().add(evaluacion);
                tabla.getEconomico().getDictamenes().add(dictamen);

                //Construye el selector de evaluaciones y dictamenes
                tabla.setConsultar_evaluacion(tabla.getEconomico().getSelector(false));

            }
            lista = new ArrayList<>(dataMap.values());

            rs.close();
            ps.close();
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return lista;
    }

    public int countAll(String searchTerm){
        int res = 0;
        String query = "SELECT COUNT(DISTINCT e.id_economico) AS res FROM economicos AS e " +
                "JOIN cedis AS c ON e.id_cedis = c.id_cedis " +
                "LEFT JOIN economico_evaluacion AS ee on e.id_economico = ee.id_economico " +
                "LEFT JOIN evaluacion AS ev on ev.id_evaluacion = ee.id_evaluacion " +
                "LEFT JOIN dictamen_economico de on e.id_economico = de.id_economico " +
                "LEFT JOIN dictamen d on de.id_dictamen = d.id_dictamen " +
                "WHERE e.placa LIKE ? OR e.id_economico LIKE ? OR e.id_cedis LIKE ? " +
                "OR ee.fecha_de_evaluacion LIKE ? OR c.region LIKE ?";
        try{
            Connection con = DatabaseConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            String searchPattern = "%" + searchTerm + "%";
            ps.setString(1, searchPattern);
            ps.setString(2, searchPattern);
            ps.setString(3, searchPattern);
            ps.setString(4, searchPattern);
            ps.setString(5, searchPattern);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                res = rs.getInt("res");
            }
            rs.close();
            ps.close();
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return res;
    }


    public ArrayList<Tabla> get(int id, int start, int length, String searchTerm, String orderColumn, String orderDir) {
        ArrayList<Tabla> lista = new ArrayList<>();
        String query = "SELECT ee.fecha_de_evaluacion, e.placa, e.id_economico, e.id_cedis, c.nombre_cedis, c.region, " +
                "ee.id_evaluacion, d.id_dictamen, d.folio_humo, d.folio_fisico, d.archivo_humo, d.archivo_fisico, ev.id_evaluacion " +
                "FROM economicos AS e " +
                "JOIN cedis AS c ON e.id_cedis = c.id_cedis " +
                "LEFT JOIN economico_evaluacion AS ee on e.id_economico = ee.id_economico " +
                "LEFT JOIN evaluacion as ev on ev.id_evaluacion = ee.id_evaluacion " +
                "LEFT JOIN dictamen_economico de on e.id_economico = de.id_economico " +
                "LEFT JOIN dictamen d on de.id_dictamen = d.id_dictamen " +
                "WHERE e.id_usuario = ? AND (e.placa LIKE ? OR e.id_economico LIKE ? OR e.id_cedis LIKE ? " +
                "OR ee.fecha_de_evaluacion LIKE ? OR c.region LIKE ?) "+
                "ORDER BY " + orderColumn + " " + orderDir + " LIMIT ? OFFSET ? ;";

        try{
            Connection con = DatabaseConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,id);
            String searchPattern = "%" + searchTerm + "%";
            ps.setString(2, searchPattern);
            ps.setString(3, searchPattern);
            ps.setString(4, searchPattern);
            ps.setString(5, searchPattern);
            ps.setString(6, searchPattern);
            ps.setInt(7, length);
            ps.setInt(8, start);

            ResultSet rs = ps.executeQuery();

            //objeto para guardar la lista de evaluaciones en el mismo economico
            Map<String, Tabla> dataMap = new HashMap<>();
            int i = 0;
            while(rs.next()){
                i++;
                String id_economico = rs.getString("id_economico");
                Tabla tabla = dataMap.get(id_economico); //porque cada registro es para un economico

                if(tabla==null){//Si el economico no esta en el objeto mapa
                    tabla = new Tabla();
                    Economico e = new Economico();
                    Cedis c = new Cedis();

                    String placa = rs.getString("placa");
                    int id_cedis = rs.getInt("id_cedis");
                    String region = rs.getString("region");
                    String nombre_cedis = rs.getString("nombre_cedis");

                    e.setId_economico(id_economico);
                    e.setPlaca(placa);
                    e.setId_cedis(id_cedis);
                    c.setId_cedis(id_cedis);
                    c.setRegion(region);
                    c.setNombre_cedis(nombre_cedis);

                    tabla.setEconomico(e);
                    tabla.setCedis(c);

                    dataMap.put(id_economico, tabla);
                }
                Evaluacion evaluacion = new Evaluacion();
                Dictamen dictamen = new Dictamen();

                Timestamp fecha_de_evaluacion = rs.getTimestamp("fecha_de_evaluacion");
                int id_evaluacion = rs.getInt("id_evaluacion");

                evaluacion.setId_evaluacion(id_evaluacion);
                evaluacion.setFecha_de_evaluacion(fecha_de_evaluacion);

                int id_dictamen = rs.getInt("id_dictamen");
                String folio_humo = rs.getString("folio_humo");
                String folio_fisico = rs.getString("folio_fisico");
                String archivo_humo = rs.getString("archivo_humo");
                String archivo_fisico = rs.getString("archivo_fisico");

                dictamen.setId_dictamen(id_dictamen);
                dictamen.setFolio1(folio_humo);
                dictamen.setFolio2(folio_fisico);
                dictamen.setArchivo1(archivo_humo);
                dictamen.setArchivo2(archivo_fisico);

                tabla.getEconomico().getEvaluaciones().add(evaluacion);
                tabla.getEconomico().getDictamenes().add(dictamen);

                //Construye el selector de evaluaciones y dictamenes
                tabla.setConsultar_evaluacion(tabla.getEconomico().getSelector(true));

            }
            lista = new ArrayList<>(dataMap.values());

            rs.close();
            ps.close();
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return lista;
    }

    public int countAll(int id, String searchTerm) {
        int res = 0;
        String query = "SELECT COUNT(DISTINCT e.id_economico) AS res FROM economicos AS e " +
                "JOIN cedis AS c ON e.id_cedis = c.id_cedis " +
                "LEFT JOIN economico_evaluacion AS ee on e.id_economico = ee.id_economico " +
                "LEFT JOIN evaluacion AS ev on ev.id_evaluacion = ee.id_evaluacion " +
                "LEFT JOIN dictamen_economico de on e.id_economico = de.id_economico " +
                "LEFT JOIN dictamen d on de.id_dictamen = d.id_dictamen " +
                "WHERE e.id_usuario = ? AND (e.placa LIKE ? OR e.id_economico LIKE ? OR e.id_cedis LIKE ? " +
                "OR ee.fecha_de_evaluacion LIKE ? OR c.region LIKE ?)";
        try{
            Connection con = DatabaseConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1,id);
            String searchPattern = "%" + searchTerm + "%";
            ps.setString(2, searchPattern);
            ps.setString(3, searchPattern);
            ps.setString(4, searchPattern);
            ps.setString(5, searchPattern);
            ps.setString(6, searchPattern);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                res = rs.getInt("res");
            }
            rs.close();
            ps.close();
            con.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return res;
    }
}
