package com.simor.cocaapp.controller;

import com.simor.cocaapp.model.DAO.EvaluacionDao;
import com.simor.cocaapp.model.Evaluacion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="VerEvaluacionServlet", value = "/verEvaluacion")
public class VerEvaluacionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id_evaluacion = Integer.parseInt(req.getParameter("id_evaluacion"));
        EvaluacionDao dao = new EvaluacionDao();
        Evaluacion evaluacion = dao.getOne(id_evaluacion);
        HttpSession sesion = req.getSession();
        sesion.setAttribute("evaluacion",evaluacion);
        resp.sendRedirect("verEvaluacion.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("404.jsp");
    }
}
