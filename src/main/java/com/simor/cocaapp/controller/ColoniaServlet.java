package com.simor.cocaapp.controller;

import com.google.gson.Gson;
import com.simor.cocaapp.model.Colonia;
import com.simor.cocaapp.model.DAO.ColoniaDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ColoniaServlet", value = "/Colonia")
public class ColoniaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Colonia> lista = new ArrayList<>();
        try{
            int municipio = Integer.parseInt(req.getParameter("municipio"));
            ColoniaDao dao = new ColoniaDao();
            lista = dao.findAll(municipio);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        Gson gson = new Gson();
        String json = gson.toJson(lista);

        resp.setContentType("text/json");
        resp.getWriter().write(json);

    }
}
