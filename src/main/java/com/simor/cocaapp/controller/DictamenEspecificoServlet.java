package com.simor.cocaapp.controller;

import com.simor.cocaapp.model.DAO.DictamenDao;
import com.simor.cocaapp.model.DAO.EconomicoDao;
import com.simor.cocaapp.model.Dictamen;
import com.simor.cocaapp.model.Economico;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@MultipartConfig
@WebServlet(name="DictamenEspecificoServlet", value="/cargarDictamenEspecifico")
public class DictamenEspecificoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sesion = req.getSession();
        String id_economico = req.getParameter("id_economico");
        sesion.setAttribute("id_economico",id_economico);
        resp.sendRedirect("nuevoDictamen.jsp");
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id_economico = req.getParameter("id_economico");
        Economico economico = new Economico();
        economico.setId_economico(id_economico);
        EconomicoDao dao = new EconomicoDao();
        try{
            String UPLOAD_DIRECTORY = req.getServletContext().getRealPath("/") + "assets"+ File.separator+"dictamenes";
            String filePath1 = "";
            String filePath2 = "";

            try {
                Part filePart = req.getPart("file1");
                String fileName = getSubmittedFileName(filePart);
                String uniqueFileName = UUID.randomUUID().toString() + "_" + fileName;
                filePath1 = UPLOAD_DIRECTORY + File.separator + uniqueFileName;
                InputStream fileContent = filePart.getInputStream();
                Files.copy(fileContent, Paths.get(filePath1));
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Part filePart = req.getPart("file2");
                String fileName = getSubmittedFileName(filePart);
                String uniqueFileName = UUID.randomUUID().toString() + "_" + fileName;
                filePath2 = UPLOAD_DIRECTORY + File.separator + uniqueFileName;
                InputStream fileContent = filePart.getInputStream();
                Files.copy(fileContent, Paths.get(filePath2));
            } catch (Exception e) {
                e.printStackTrace();
            }

            String folio1 = req.getParameter("folio1");
            String folio2 = req.getParameter("folio2");

            Dictamen dictamen = new Dictamen();
            DictamenDao dd = new DictamenDao();
            if(!folio1.equals("") || !folio2.equals("")){
                dictamen.setFolio1(Integer.parseInt(folio1));
                dictamen.setFolio2(Integer.parseInt(folio2));
                dictamen.setArchivo1(filePath1);
                dictamen.setArchivo2(filePath2);

                //Insertar dictamen en la base de datos
                dictamen.setId_dictamen(dd.insert(dictamen));
                dd.insertRelation(dictamen,economico);
            }
            ///////////////////////////////////////////////

            req.getSession().setAttribute("mensaje","Dictamen insertado correctamente");
        } catch(Exception e){
            req.getSession().setAttribute("mensaje","Hubo en error con la base de datos, contacte al administrador o soporte técnico");
        }

        resp.sendRedirect("verEconomicos.jsp");
    }

    private String getSubmittedFileName(Part part) {
        String header = part.getHeader("content-disposition");
        String[] elements = header.split(";");
        for (String element : elements) {
            if (element.trim().startsWith("filename")) {
                return element.substring(
                        element.indexOf("=") + 1).trim().replace("\"", "");
            }
        }
        return "";
    }
}
