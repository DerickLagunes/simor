package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.Cedis;
import com.simor.cocaapp.model.Economico;
import com.simor.cocaapp.model.EconomicoEvaluacion;
import com.simor.cocaapp.model.Evaluacion;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TablaDao {

    public ArrayList<Economico> get(int start, int length, String searchTerm, String orderColumn, String orderDir){
        ArrayList<Economico> lista = new ArrayList<>();
        String query = "SELECT * " + //poner aqui las columnas
                "FROM economicos AS e " +
                "JOIN cedis AS c ON e.id_cedis = c.id_cedis " +
                "JOIN economico_evaluacion AS ee on e.id_economico = ee.id_evaluacion " +
                "JOIN evaluacion as ev on ev.id_evaluacion = ee.id_evaluacion " +
                "WHERE e.placa LIKE ? OR e.id_economico LIKE ? OR e.id_cedis LIKE ? " +
                "OR ee.fecha_de_evaluacion LIKE ? OR c.region LIKE ?"+
                "ORDER BY " + orderColumn + " " + orderDir + " LIMIT ? OFFSET ?";
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
            while(rs.next()){
                Economico e = new Economico();
                //WIP ver la configuración de datos que retorna la consulta
                e.setPlaca(rs.getString("placa"));
                e.setId_economico(rs.getString("id"));

                Cedis c = new Cedis();
                c.setId_cedis();
                c.setNombre_cedis();
                c.setRegion();

                e.setId_cedis();

                EconomicoEvaluacion ee = new EconomicoEvaluacion();
                ee.setId_economico(e.getId_economico());
                ee.setFecha_de_evaluacion();

                Evaluacion ev = new Evaluacion();
                ev.setId_evaluacion();

                ee.setId_evaluacion();
                //Definir las acciones dinamicamente:
                e.setModificar("<a class=\"btn btn-primary\" href=\"modificarServlet?id="+d.getId()+"\">Modificar</a>");
                e.setEliminar("<a class=\"btn btn-danger\" href=\"eliminarServlet?id="+d.getId()+"\">Eliminar</a>");
                lista.add(e);
            }
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
        String query = "SELECT COUNT(*) AS res FROM economicos AS e " +
                "JOIN cedis AS c ON e.id_cedis = c.id_cedis " +
                "JOIN economico_evaluacion AS ee on e.id_economico = ee.id_evaluacion " +
                "JOIN evaluacion as e on e.id_evaluacion = ee.id_evaluacion " +
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


}
