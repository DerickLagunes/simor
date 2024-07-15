package com.simor.cocaapp.controller;

import com.google.gson.Gson;
import com.simor.cocaapp.model.DAO.EconomicoDao;
import com.simor.cocaapp.model.DAO.UsuarioDao;
import com.simor.cocaapp.model.Economico;
import com.simor.cocaapp.model.Operacion;
import com.simor.cocaapp.model.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ClienteServlet", value = "/clientes")
public class ClienteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsuarioDao dao = new UsuarioDao();
        List<Usuario> lista = dao.findAllClients();

        if (lista.size()==0){
            Usuario vacio = new Usuario();
            vacio.setId_usuario(0);
            vacio.setNombre_usuario("");
            lista.add(vacio);
        }

        Gson gson = new Gson();
        String json = gson.toJson(lista);

        resp.setContentType("text/json");
        resp.getWriter().write(json);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("404.jsp");
    }
}
