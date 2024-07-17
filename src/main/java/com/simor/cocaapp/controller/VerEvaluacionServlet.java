package com.simor.cocaapp.controller;

import com.simor.cocaapp.model.DAO.EvaluacionDao;
import com.simor.cocaapp.model.Data;
import com.simor.cocaapp.model.Economico;
import com.simor.cocaapp.model.Evaluacion;
import com.simor.cocaapp.model.Resultado;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name="VerEvaluacionServlet", value = "/verEvaluacion")
public class VerEvaluacionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id_evaluacion = Integer.parseInt(req.getParameter("id_evaluacion"));
        EvaluacionDao dao = new EvaluacionDao();
        Evaluacion evaluacion = dao.getOne(id_evaluacion);
        HttpSession sesion = req.getSession();

        //Pasar Datos del economico
        Data d = new Data();
        d = dao.getEconomico(id_evaluacion);
        sesion.setAttribute("data",d);
        //Pasar datos de la evaluación y lista de resultados
        sesion.setAttribute("evaluacion",evaluacion);
        sesion.setAttribute("resultados",evaluacion.getResultados());

        resp.sendRedirect("verEvaluacion.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("404.jsp");
    }
}
