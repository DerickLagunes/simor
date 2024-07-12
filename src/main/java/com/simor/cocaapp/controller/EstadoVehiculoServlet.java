package com.simor.cocaapp.controller;

import com.simor.cocaapp.model.DAO.EstadoVehiculoDao;
import com.simor.cocaapp.model.Evaluacion;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "evaluacionEstadoVehiculo", urlPatterns = "/procesarEvaluacion")
public class EstadoVehiculoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuperar los valores del formulario

    }
}