package com.simor.cocaapp.controller;

import com.google.gson.Gson;
import com.simor.cocaapp.model.DAO.EstadoDao;
import com.simor.cocaapp.model.Estado;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EstadoServlet", value = "/Estado")
public class EstadoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Estado> lista = new ArrayList<>();
        try{
            int pais = Integer.parseInt(req.getParameter("pais"));
            EstadoDao dao = new EstadoDao();
            lista = dao.findAll(pais);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        Gson gson = new Gson();
        String json = gson.toJson(lista);

        resp.setContentType("text/json");
        resp.getWriter().write(json);

    }
}
