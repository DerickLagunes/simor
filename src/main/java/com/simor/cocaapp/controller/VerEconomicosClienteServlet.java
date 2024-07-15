package com.simor.cocaapp.controller;

import com.google.gson.Gson;
import com.simor.cocaapp.model.DAO.TablaDao;
import com.simor.cocaapp.model.DataTableResponse;
import com.simor.cocaapp.model.Tabla;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name="VerEconomicosClienteServlet", value = "/verEconomicosCliente")
public class VerEconomicosClienteServlet extends HttpServlet {
    private TablaDao dao;

    @Override
    public void init() throws ServletException {
        dao = new TablaDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = 0;
        if (request.getParameter("id_usuario") != null){
            id = Integer.parseInt(request.getParameter("id_usuario"));
        }

        int draw = Integer.parseInt(request.getParameter("draw"));
        int start = Integer.parseInt(request.getParameter("start"));
        int length = Integer.parseInt(request.getParameter("length"));
        String searchTerm = request.getParameter("search[value]");

        // Obtener parámetros de ordenación
        String orderColumnIndex = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String[] columnNames = {"fecha_de_evaluacion", "placa", "id_economico", "nombre_cedis", "region", "consultar"};
        String orderColumn = columnNames[Integer.parseInt(orderColumnIndex)];

        // Aquí deberías obtener los datos desde tu base de datos
        ArrayList<Tabla> dataList = dao.get(id, start, length, searchTerm, orderColumn, orderDir);
        int total = dao.countAll(id, searchTerm);

        DataTableResponse dataTableResponse = new DataTableResponse();
        dataTableResponse.setDraw(draw);
        dataTableResponse.setRecordsTotal(total);
        dataTableResponse.setRecordsFiltered(total);
        dataTableResponse.setData(dataList);

        Gson gson = new Gson();
        String json = gson.toJson(dataTableResponse);

        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.print(json);
        out.flush();
    }
}
