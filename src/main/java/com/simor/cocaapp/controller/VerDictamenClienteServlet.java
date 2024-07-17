package com.simor.cocaapp.controller;

import com.simor.cocaapp.model.DAO.DictamenDao;
import com.simor.cocaapp.model.Dictamen;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name="VerDictamenClienteServlet", value = "/verDictamenCliente")
public class VerDictamenClienteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id_dictamen = Integer.parseInt(req.getParameter("id_dictamen"));
        String id_economico = req.getParameter("id_economico");
        DictamenDao dao = new DictamenDao();
        Dictamen dictamen = dao.getOne(id_dictamen);

        String basePath = req.getServletContext().getRealPath("/");
        String filePath1 = dictamen.getArchivo1().replace(basePath,"");
        String filePath2 = dictamen.getArchivo2().replace(basePath,"");

        dictamen.setArchivo1(filePath1);
        dictamen.setArchivo2(filePath2);

        HttpSession sesion = req.getSession();
        sesion.setAttribute("dictamen",dictamen);
        sesion.setAttribute("id_economico",id_economico);
        resp.sendRedirect("verDictamenCliente.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("404.jsp");
    }
}
