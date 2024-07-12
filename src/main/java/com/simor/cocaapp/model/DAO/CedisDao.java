package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.Cedis;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CedisDao {

    public List<Cedis> findAll(){
        List<Cedis> listaCedis=new ArrayList<>();
        String query="select * from cedis";
        try (Connection con= DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                try (ResultSet res = stmt.executeQuery()) {
                    while (res.next()) {
                        Cedis cedis = new Cedis();
                        cedis.setId_cedis(res.getInt("id_cedis"));
                        cedis.setNombre_cedis(res.getString("nombre_cedis"));
                        cedis.setRegion(res.getString("region"));
                        listaCedis.add(cedis);
                    }
                }
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaCedis;
    }

    public Cedis findOne(int id){
        Cedis cedis = new Cedis();
        String query="select * from cedis where id_cedis = ?";
        try (Connection con=DatabaseConnectionManager.getConnection()){
            try (PreparedStatement stmt=con.prepareStatement(query)) {
                stmt.setInt(1, id);
                try (ResultSet res = stmt.executeQuery()) {
                    if (res.next()) {
                        cedis.setId_cedis(res.getInt("id_cedis"));
                        cedis.setNombre_cedis(res.getString("nombre_cedis"));
                        cedis.setRegion(res.getString("region"));
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            return cedis;
    }


    public boolean insert(Cedis cedis) {
        boolean flag = false;
        String query = "insert into cedis(nombre_cedis, region) values(?,?)";
        try (Connection con=DatabaseConnectionManager.getConnection()) {
            try (PreparedStatement stmt = con.prepareStatement(query)) {
                stmt.setString(1, cedis.getNombre_cedis());
                stmt.setString(2, cedis.getRegion());
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
