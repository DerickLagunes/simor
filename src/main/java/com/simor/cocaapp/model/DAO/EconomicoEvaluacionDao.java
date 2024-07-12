package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.EconomicoEvaluacion;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EconomicoEvaluacionDao {

    public boolean insert(EconomicoEvaluacion ee){
        boolean flag = false;
        String query = "insert into economico_evaluacion(id_evaluacion, id_economico, fecha_de_evaluacion) values (?,?,?)";
        try (Connection con=DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setInt(1, ee.getId_evaluacion());
                stmt.setString(2, ee.getId_economico());
                stmt.setTimestamp(3, ee.getFecha_de_evaluacion());
                if(stmt.executeUpdate()>0){
                    flag = true;
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

}