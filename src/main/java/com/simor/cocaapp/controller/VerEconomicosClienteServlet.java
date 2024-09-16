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

        int valor; // 4 = aprobados
        boolean tipo = true;
        if(request.getParameter("valor").isEmpty()){
            valor = 0;
        } else {
            valor = Integer.parseInt(request.getParameter("valor"));
        }
        String filtro = request.getParameter("filtro");

        if(valor==4 && filtro.contains("luces")){
            //Quiere ver los Aprobados
            tipo = true; // Like %4%
            valor = 4;
        }else if(valor==1  && filtro.contains("luces")){
            //Quiere ver los Reprobados
            tipo = false;
            valor = 4;
        }else if(valor==4 && (filtro.contains("rines") || filtro.contains("masas"))){
            //Quiere ver los Aprobados
            tipo = true;
            valor = 4; //
        }else if(valor==1  && (filtro.contains("rines") || filtro.contains("masas"))){
            //Quiere ver los Reprobados
            tipo = false;
            valor = 4; // NOT LIKE %4%
        }else if(valor==1 && (filtro.contains("birlos") ||
                filtro.contains("tuercas") || filtro.contains("manijas") ||
                filtro.contains("tanques") || filtro.contains("caja") ||
                filtro.contains("deposito") || filtro.contains("humo") ||
                filtro.contains("gobernado") || filtro.contains("brazo"))){
            //Quiere ver los Reprobados
            tipo = true;
            valor = 1;
        }else if(valor==4 && (filtro.contains("birlos") ||
                filtro.contains("tuercas") || filtro.contains("manijas") ||
                filtro.contains("tanques") || filtro.contains("caja") ||
                filtro.contains("deposito") || filtro.contains("humo") ||
                filtro.contains("gobernado") || filtro.contains("brazo"))){
            //Quiere ver los Aprobados
            tipo = true;
            valor = 2;
        }else if(valor==4 && (filtro.contains("parabrisas") ||
                filtro.contains("huelgo") || filtro.contains("escape") ||
                filtro.contains("chavetas"))){
            //Quiere ver los Aprobados
            tipo = true;
            valor = 1;
        }else if(valor==2 && (filtro.contains("parabrisas") ||
                filtro.contains("huelgo") || filtro.contains("escape") ||
                filtro.contains("chavetas"))){
            //Quiere ver los Reprobados
            tipo = true;
            valor = 2;
        }else if(valor==4 && (filtro.contains("compresor") ||
                filtro.contains("faro"))){
            //Quiere ver los Aprobados
            tipo = true;
            valor = 3;
        }else if(valor==2 && (filtro.contains("compresor") ||
                filtro.contains("faro"))){
            //Quiere ver los Reprobados
            tipo = false;
            valor = 3;
        }
        String searchTerm = request.getParameter("search[value]");

        // Obtener parámetros de ordenación
        String orderColumnIndex = request.getParameter("order[0][column]");
        String orderDir = request.getParameter("order[0][dir]");
        String[] columnNames = {"fecha_de_evaluacion", "placa", "id_economico", "nombre_cedis", "region", "consultar"};
        String orderColumn = columnNames[Integer.parseInt(orderColumnIndex)];

        // Aquí deberías obtener los datos desde tu base de datos
        ArrayList<Tabla> dataList = dao.get(id, start, length, searchTerm, orderColumn, orderDir, filtro, valor, tipo);
        int total = dao.countAll(id, searchTerm, filtro, valor, tipo);

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
