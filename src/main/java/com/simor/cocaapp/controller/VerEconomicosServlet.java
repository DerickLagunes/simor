package com.simor.cocaapp.controller;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name="VerEconomicosServlet", value = "verEconomicos")
public class VerEconomicosServlet extends HttpServlet {
    private DataDao dao;

    @Override
    public void init() throws ServletException {
        dao = new DataDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int draw = Integer.parseInt(request.getParameter("draw"));
        int start = Integer.parseInt(request.getParameter("start"));
        int length = Integer.parseInt(request.getParameter("length"));
        String searchTerm = request.getParameter("search[value]");

        // Obtener parámetros de ordenación
        String orderColumnIndex = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String[] columnNames = {"name", "position", "office", "age", "startDate", "salary"};
        String orderColumn = columnNames[Integer.parseInt(orderColumnIndex)];

        // Aquí deberías obtener los datos desde tu base de datos
        ArrayList<Data> dataList = dao.get(start, length, searchTerm, orderColumn, orderDir);
        int total = dao.countAll(searchTerm);

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
