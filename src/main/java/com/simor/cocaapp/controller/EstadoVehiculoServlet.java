package com.simor.cocaapp.controller;

import com.simor.cocaapp.model.DAO.EstadoVehiculoDao;
import com.simor.cocaapp.model.EstadoVehiculo;
import com.simor.cocaapp.model.Usuario;
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
        int lucesGalibo = Integer.parseInt(request.getParameter("lucesGalibo"));
        int lucesAltas = Integer.parseInt(request.getParameter("lucesAltas"));
        int lucesBajas = Integer.parseInt(request.getParameter("lucesBajas"));
        int lucesDemarcadoras = Integer.parseInt(request.getParameter("lucesDemarcadoras"));
        int lucesIndicadoras = Integer.parseInt(request.getParameter("lucesIndicadoras"));

        // Crear un objeto EstadoVehiculo con los valores recuperados
        EstadoVehiculo estadoVehiculo = new EstadoVehiculo();
        estadoVehiculo.setLuces_galibo(lucesGalibo);
        estadoVehiculo.setLuces_altas(lucesAltas);
        estadoVehiculo.setLuces_bajas(lucesBajas);
        estadoVehiculo.setLuces_demarcadoras(lucesDemarcadoras);
        estadoVehiculo.setLuces_indicadoras(lucesIndicadoras);

        // Guardar el estado del vehículo en la base de datos usando el DAO
        EstadoVehiculoDao estadoVehiculoDao = new EstadoVehiculoDao();
        estadoVehiculoDao.guardarEstadoVehiculo(estadoVehiculo);

        // Redirigir al usuario a una página de confirmación o a otro destino
        response.sendRedirect("confirmacion.jsp");
    }
}