package com.simor.cocaapp.model.DAO;

import com.simor.cocaapp.model.Rol;
import com.simor.cocaapp.model.Usuario;
import com.simor.cocaapp.utils.DatabaseConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao{
    public List<Usuario> findAll() {
        List<Usuario> listaUsuario = new ArrayList<>();
        String query = "select * from usuarios";
        try(Connection con = DatabaseConnectionManager.getConnection()){
            try(PreparedStatement stmt = con.prepareStatement(query)){
                try (ResultSet res = stmt.executeQuery()){
                    while(res.next()){
                        Usuario usr = new Usuario();
                        usr.setId_usuario(res.getInt("id_usuario"));
                        usr.setNombre_usuario(res.getString("nombre_usuario"));
                        usr.setContrasena(res.getString("contrasena"));
                        usr.setTipo_usuario(res.getString("tipo_usuario"));
                        listaUsuario.add(usr);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaUsuario;
    }

    public Object findOne(String correo, String contra) {
        Usuario usr = new Usuario();
        String query = "select usuarios.* from usuarios where nombre_usuario = ? AND contrasena = sha2(?,256)";
        //String query = "select usuarios.* from usuarios where nombre_usuario = ? AND contrasena = ?";
        try(Connection con = DatabaseConnectionManager.getConnection()){
            try(PreparedStatement stmt = con.prepareStatement(query)){
                stmt.setString(1,correo);
                stmt.setString(2,contra);
                try (ResultSet res = stmt.executeQuery()){
                    if(res.next()){
                        usr.setId_usuario(res.getInt("id_usuario"));
                        usr.setNombre_usuario(res.getString("nombre_usuario"));
                        usr.setContrasena(res.getString("contrasena"));
                        usr.setTipo_usuario(res.getString("tipo_usuario"));
                    }
                }
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return usr;
    }

    public List<Usuario> findAllClients() {
        List<Usuario> listaUsuario = new ArrayList<>();
        String query = "select * from usuarios where tipo_usuario = ?";
        try(Connection con = DatabaseConnectionManager.getConnection()){
            try(PreparedStatement stmt = con.prepareStatement(query)){
                stmt.setString(1,"cliente");
                try (ResultSet res = stmt.executeQuery()){
                    while(res.next()){
                        Usuario usr = new Usuario();
                        usr.setId_usuario(res.getInt("id_usuario"));
                        usr.setNombre_usuario(res.getString("nombre_usuario"));
                        usr.setContrasena(res.getString("contrasena"));
                        usr.setTipo_usuario(res.getString("tipo_usuario"));
                        listaUsuario.add(usr);
                    }
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaUsuario;
    }
}
