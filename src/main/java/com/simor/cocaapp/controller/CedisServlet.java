package com.simor.cocaapp.controller;

import com.google.gson.Gson;
import com.simor.cocaapp.model.Cedis;
import com.simor.cocaapp.model.DAO.CedisDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "CedisServlet", value = "/cedis")
public class CedisServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CedisDao dao = new CedisDao();
        List<Cedis> lista = dao.findAll();
        Gson gson = new Gson();
        String json = gson.toJson(lista);

        resp.setContentType("text/json");
        resp.getWriter().write(json);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre_cedis = req.getParameter("nombre_cedis");
        String region_cedis = req.getParameter("region_cedis");

        Cedis cedis = new Cedis();
        cedis.setNombre_cedis(nombre_cedis);
        cedis.setRegion(region_cedis);

        CedisDao dao = new CedisDao();

        resp.setContentType("text/plain");
        if(dao.insert(cedis)){
            resp.getWriter().write("Listo");
        }else{
            resp.getWriter().write("Error");
        }
    }
}
