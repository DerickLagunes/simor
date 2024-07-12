package com.simor.cocaapp.controller;

import com.google.gson.Gson;
import com.simor.cocaapp.model.DAO.EconomicoDao;
import com.simor.cocaapp.model.Economico;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@MultipartConfig
@WebServlet(name = "EconomicoServlet", value = "/economicoyarchivo")
public class EconomicoYArchivoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("404.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id_economico = req.getParameter("id_economico");
        String economico_cedis = req.getParameter("economico_cedis");

        Economico economico = new Economico();
        economico.setId_economico(id_economico);
        economico.setId_cedis(Integer.parseInt(economico_cedis));

        EconomicoDao dao = new EconomicoDao();

        resp.setContentType("text/plain");
        if(dao.insert(economico)){
            resp.getWriter().write("Listo");
        }else{
            resp.getWriter().write("Error");
        }
    }
}
