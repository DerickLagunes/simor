package com.simor.cocaapp.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="UnidadEspecificaServlet", value="/evaluarUnidadEspecifica")
public class UnidadEspecificaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sesion = req.getSession();
        int id_cedis = Integer.parseInt(req.getParameter("id_cedis"));
        String id_economico = req.getParameter("id_economico");
        sesion.setAttribute("id_cedis",id_cedis);
        sesion.setAttribute("id_economico",id_economico);
        resp.sendRedirect("evaluarUnidad.jsp");
    }
}
