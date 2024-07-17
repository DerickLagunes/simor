package com.simor.cocaapp.utils;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter(urlPatterns = {
        "/cedis",
        "/clientes",
        "/cargarDictamenEspecifico",
        "/economicocondictamen",
        "/economico",
        "/evaluacion",
        "/uploadexcel",
        "/evaluarUnidadEspecifica",
        "/verDictamen",
        "/verEconomicos",
        "/verEvaluacion",
        "/evaluarUnidad.jsp",
        "/nuevoDictamen.jsp",
        "/subirExcel.jsp",
        "/verDictamen.jsp",
        "/verEconomicos.jsp",
        "/verEvaluacion.jsp"
}) // This filter will be applied to all URLs
public class TecnicoSessionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code if needed (optional)
    }

    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Get the HttpSession from the request
        HttpSession session = httpRequest.getSession(false);

        // Check if the user is an admin(assuming isAdmin is a boolean session attribute)
        boolean isTecnico = false;
        if(session != null){
            isTecnico = session.getAttribute("tipoSesion").equals("tecnico");
        }

        if (isTecnico) {
            // If the user is an admin, allow access to the Servlet
            chain.doFilter(request, response);
        } else {
            // If the user is not an admin, redirect them to a restricted access page
            httpResponse.sendRedirect("accesoDenegado.jsp");
        }
    }

    @Override
    public void destroy() {
        // Cleanup code if needed (optional)
    }
}