package com.simor.cocaapp.controller;

import com.google.gson.Gson;
import com.simor.cocaapp.model.DAO.MunicipioDao;
import com.simor.cocaapp.model.Municipio;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "MunicipioServlet", value = "/Municipio")
public class MunicipioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Municipio> lista = new ArrayList<>();
        try{
            int estado = Integer.parseInt(req.getParameter("estado"));
            MunicipioDao dao = new MunicipioDao();
            lista = dao.findAll(estado);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        Gson gson = new Gson();
        String json = gson.toJson(lista);

        resp.setContentType("text/json");
        resp.getWriter().write(json);

    }
}
