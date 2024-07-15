package com.simor.cocaapp.controller;

import com.google.gson.Gson;
import com.simor.cocaapp.model.Cedis;
import com.simor.cocaapp.model.DAO.CedisDao;
import com.simor.cocaapp.model.DAO.EconomicoDao;
import com.simor.cocaapp.model.Economico;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "EconomicoServlet", value = "/economico")
public class EconomicoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        EconomicoDao dao = new EconomicoDao();
        List<Economico> lista = dao.findAllByCedis(Integer.parseInt(req.getParameter("id_cedis")));

        if (lista.size()==0){
            Economico vacio = new Economico();
            vacio.setId_economico("");
            lista.add(vacio);
        }

        Gson gson = new Gson();
        String json = gson.toJson(lista);

        resp.setContentType("text/json");
        resp.getWriter().write(json);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id_economico = req.getParameter("id_economico");
        String placa = req.getParameter("placa");
        String economico_cedis = req.getParameter("economico_cedis");
        String id_usuario_economico = req.getParameter("id_usuario_economico");

        Economico economico = new Economico();
        economico.setId_economico(id_economico);
        economico.setPlaca(placa);
        economico.setId_cedis(Integer.parseInt(economico_cedis));
        economico.setId_usuario(Integer.parseInt(id_usuario_economico));

        EconomicoDao dao = new EconomicoDao();

        resp.setContentType("text/plain");
        if(dao.insert(economico)){
            resp.getWriter().write("Listo");
        }else{
            resp.getWriter().write("Error");
        }
    }
}
