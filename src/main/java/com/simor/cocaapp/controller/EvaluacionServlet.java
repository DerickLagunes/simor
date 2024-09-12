package com.simor.cocaapp.controller;

import com.simor.cocaapp.model.*;
import com.simor.cocaapp.model.DAO.DictamenDao;
import com.simor.cocaapp.model.DAO.EconomicoEvaluacionDao;
import com.simor.cocaapp.model.DAO.EvaluacionDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

@WebServlet(name="EvaluacionServlet", value = "/evaluacion")
public class EvaluacionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("404.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mensaje = "Hubo un error en la inserción de una nueva evaluación en la base de datos, favor de contactar a soporte técnico";

        //Esta es toda la info del cedis que podemos obtener del formulario
        Cedis cedis  = new Cedis();
        cedis.setId_cedis(Integer.parseInt(req.getParameter("cedis")));

        //En el formulario obtenemos solo el Id del economico que en este caso es String
        Economico economico = new Economico();
        economico.setId_economico(req.getParameter("economico"));

        Evaluacion evaluacion = new Evaluacion();
        //Luces
        /*
        Galibo, altas y bajas:
            1 = izq fundida
            2 = derecha fundida
            3 = ambas fundidas
            4 = aprobadas
        */
        evaluacion.setLuces_galibo(Integer.parseInt(req.getParameter("luces_galibo")));
        evaluacion.setLuces_altas(Integer.parseInt(req.getParameter("luces_altas")));
        evaluacion.setLuces_bajas(Integer.parseInt(req.getParameter("luces_bajas")));
        evaluacion.setLuces_direccionales_delanteras(Integer.parseInt(req.getParameter("luces_direccionales_delanteras")));
        evaluacion.setLuces_direccionales_traseras(Integer.parseInt(req.getParameter("luces_direccionales_traseras")));
        /*
        demarcadoras:
            1 = izq fundida
            2 = derecha fundida
            3 = ambas fundidas
            4 = aprobadas
        */
        evaluacion.setLuces_demarcadoras_delanteras(Integer.parseInt(req.getParameter("luces_demarcadoras_delanteras")));
        evaluacion.setLuces_demarcadoras_traseras(Integer.parseInt(req.getParameter("luces_demarcadoras_traseras")));
        /*
        indicadoras:
            1 = 1 fundida
            2 = 2 fundida
            3 = 3 fundidas
            4 = aprobadas
        */
        evaluacion.setLuces_indicadoras(Integer.parseInt(req.getParameter("luces_indicadoras")));
        //Llantas
        /*
        rines:
            1 = Derecho roto o soldado
            2 = Izquierdo roto o soldado
            3 = Ambos rotos o soldados
            4 = aprobados
        */
        evaluacion.setLlantas_rines_delanteros(Integer.parseInt(req.getParameter("llantas_rines_delanteros")));
        evaluacion.setLlantas_rines_traseros(Integer.parseInt(req.getParameter("llantas_rines_traseros")));
        /*
        masas:
            1 = Derecha con fuga
            2 = Izquierda con fuga
            3 = Ambas con fuga
            4 = aprobadas
        */
        evaluacion.setLlantas_masas_delanteras(Integer.parseInt(req.getParameter("llantas_masas_delanteras")));
        evaluacion.setLlantas_masas_traseras(Integer.parseInt(req.getParameter("llantas_masas_traseras")));
        /*
        presion es en PSI:
            minimo 70
        */
        evaluacion.setLlantas_presion_delantera_izquierda(Integer.parseInt(req.getParameter("presion_delantera_izquierda")));
        evaluacion.setLlantas_presion_delantera_derecha(Integer.parseInt(req.getParameter("presion_delantera_derecha")));
        evaluacion.setLlantas_presion_trasera_izquierda_1(Integer.parseInt(req.getParameter("presion_trasera_izquierda_1")));
        evaluacion.setLlantas_presion_trasera_izquierda_2(Integer.parseInt(req.getParameter("presion_trasera_izquierda_2")));
        evaluacion.setLlantas_presion_trasera_derecha_1(Integer.parseInt(req.getParameter("presion_trasera_derecha_1")));
        evaluacion.setLlantas_presion_trasera_derecha_2(Integer.parseInt(req.getParameter("presion_trasera_derecha_2")));
        /*
        profundidad es en mm
        */
        evaluacion.setLlantas_profundidad_delantera_izquierda(Float.parseFloat(req.getParameter("profundidad_delantera_izquierda")));
        evaluacion.setLlantas_profundidad_delantera_derecha(Float.parseFloat(req.getParameter("profundidad_delantera_derecha")));
        evaluacion.setLlantas_profundidad_trasera_izquierda_1(Float.parseFloat(req.getParameter("profundidad_trasera_izquierda_1")));
        evaluacion.setLlantas_profundidad_trasera_izquierda_2(Float.parseFloat(req.getParameter("profundidad_trasera_izquierda_2")));
        evaluacion.setLlantas_profundidad_trasera_derecha_1(Float.parseFloat(req.getParameter("profundidad_trasera_derecha_1")));
        evaluacion.setLlantas_profundidad_trasera_derecha_2(Float.parseFloat(req.getParameter("profundidad_trasera_derecha_2")));
        /*
        Birlos y Tuercas,
        si variable principal es = 1 significa Rotos o faltantes
        en ese caso se pone el numero de rotos o faltantes, por defecto es 0
        en caso de que sea 2 significa aprobados
        */
        evaluacion.setLlantas_birlos_delantera_izquierda(Integer.parseInt(req.getParameter("llantas_birlos_delantera_izquierda")));
        evaluacion.setLlantas_birlos_delantera_izquierda_num(Integer.parseInt(req.getParameter("llantas_birlos_delantera_izquierda_num")));
        evaluacion.setLlantas_tuercas_delantera_izquierda(Integer.parseInt(req.getParameter("llantas_tuercas_delantera_izquierda")));
        evaluacion.setLlantas_tuercas_delantera_izquierda_num(Integer.parseInt(req.getParameter("llantas_tuercas_delantera_izquierda_num")));
        evaluacion.setLlantas_birlos_delantera_derecha(Integer.parseInt(req.getParameter("llantas_birlos_delantera_derecha")));
        evaluacion.setLlantas_birlos_delantera_derecha_num(Integer.parseInt(req.getParameter("llantas_birlos_delantera_derecha_num")));
        evaluacion.setLlantas_tuercas_delantera_derecha(Integer.parseInt(req.getParameter("llantas_tuercas_delantera_derecha")));
        evaluacion.setLlantas_tuercas_delantera_derecha_num(Integer.parseInt(req.getParameter("llantas_tuercas_delantera_derecha_num")));
        evaluacion.setLlantas_birlos_trasera_izquierda(Integer.parseInt(req.getParameter("llantas_birlos_trasera_izquierda")));
        evaluacion.setLlantas_birlos_trasera_izquierda_num(Integer.parseInt(req.getParameter("llantas_birlos_trasera_izquierda_num")));
        evaluacion.setLlantas_tuercas_trasera_izquierda(Integer.parseInt(req.getParameter("llantas_tuercas_trasera_izquierda")));
        evaluacion.setLlantas_tuercas_trasera_izquierda_num(Integer.parseInt(req.getParameter("llantas_tuercas_trasera_izquierda_num")));
        evaluacion.setLlantas_birlos_trasera_derecha(Integer.parseInt(req.getParameter("llantas_birlos_trasera_derecha")));
        evaluacion.setLlantas_birlos_trasera_derecha_num(Integer.parseInt(req.getParameter("llantas_birlos_trasera_derecha_num")));
        evaluacion.setLlantas_tuercas_trasera_derecha(Integer.parseInt(req.getParameter("llantas_tuercas_trasera_derecha")));
        evaluacion.setLlantas_tuercas_trasera_derecha_num(Integer.parseInt(req.getParameter("llantas_tuercas_trasera_derecha_num")));
        //Otros
        evaluacion.setCaja_direccion(Integer.parseInt(req.getParameter("caja_direccion")));
        evaluacion.setDeposito_aceite(Integer.parseInt(req.getParameter("deposito_aceite")));
        evaluacion.setParabrisas(Integer.parseInt(req.getParameter("parabrisas")));
        evaluacion.setLimpiaparabrisas(Integer.parseInt(req.getParameter("limpiaparabrisas")));
        //1 es aprobado 2 es indicar cuantos
        evaluacion.setHuelgo(Integer.parseInt(req.getParameter("huelgo")));
        evaluacion.setHuelgo_cuanto(Integer.parseInt(req.getParameter("huelgo_cuanto")));
        evaluacion.setEscape(Integer.parseInt(req.getParameter("escape")));

        evaluacion.setManijas_de_puertas(Integer.parseInt(req.getParameter("manijas_de_puertas")));
        evaluacion.setChavetas(Integer.parseInt(req.getParameter("chavetas")));
        evaluacion.setChavetas_cuanto(Integer.parseInt(req.getParameter("chavetas_cuanto")));
        evaluacion.setFaro_derecho(Integer.parseInt(req.getParameter("faro_derecho")));
        evaluacion.setFaro_izquierdo(Integer.parseInt(req.getParameter("faro_izquierdo")));
        evaluacion.setCompresor(Integer.parseInt(req.getParameter("compresor")));
        evaluacion.setTiempo_de_carga_psi(Integer.parseInt(req.getParameter("tiempo_de_carga_psi")));
        evaluacion.setTiempo_de_carga_tiempo(Integer.parseInt(req.getParameter("tiempo_de_carga_tiempo")));
        evaluacion.setTanques_de_aire(Integer.parseInt(req.getParameter("tanques_de_aire")));
        evaluacion.setHumo(Integer.parseInt(req.getParameter("humo")));
        evaluacion.setGobernado(Integer.parseInt(req.getParameter("gobernado")));


        //Archivos de imagen
        try{
            String UPLOAD_DIRECTORY = req.getServletContext().getRealPath("/") + "assets"+ File.separator+"evidencias";
            String filePath1 = "";
            String filePath2 = "";

            try {
                Part filePart = req.getPart("evidencia1");
                String fileName = getSubmittedFileName(filePart);
                String uniqueFileName = UUID.randomUUID().toString() + "_" + fileName;
                filePath1 = UPLOAD_DIRECTORY + File.separator + uniqueFileName;
                InputStream fileContent = filePart.getInputStream();
                Files.copy(fileContent, Paths.get(filePath1));
                evaluacion.setEvidencia1(filePath1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                Part filePart = req.getPart("evidencia2");
                String fileName = getSubmittedFileName(filePart);
                String uniqueFileName = UUID.randomUUID().toString() + "_" + fileName;
                filePath2 = UPLOAD_DIRECTORY + File.separator + uniqueFileName;
                InputStream fileContent = filePart.getInputStream();
                Files.copy(fileContent, Paths.get(filePath2));
                evaluacion.setEvidencia2(filePath2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch(Exception e){
            e.printStackTrace();
            req.getSession().setAttribute("mensaje","Hubo en error con el registro de evidencias, no se pueden guardar");
        }

        //Comentarios
        evaluacion.setComentarios(req.getParameter("comentarios"));

        //Usuario del economico
        evaluacion.setId_usuario(Integer.parseInt(req.getParameter("id_usuario_evaluador")));

        //Insertar esta info
        //Primero la evaluacion
        EvaluacionDao dao = new EvaluacionDao();
        int id_evaluacion = dao.insert(evaluacion);

        if(id_evaluacion!=0){
            //economico_evaluacion es la tabla de interseccion
            EconomicoEvaluacion economicoEvaluacion = new EconomicoEvaluacion();
            // Obtén la fecha y hora actual
            LocalDateTime localDateTime = LocalDateTime.now();
            Timestamp sqlTimestamp = Timestamp.valueOf(localDateTime);
            economicoEvaluacion.setFecha_de_evaluacion(sqlTimestamp);
            economicoEvaluacion.setId_economico(economico.getId_economico());
            //Obtener de la inserción de datos de arriba
            economicoEvaluacion.setId_evaluacion(id_evaluacion);

            EconomicoEvaluacionDao dao2 = new EconomicoEvaluacionDao();
            if(dao2.insert(economicoEvaluacion)){
                //Se registro la evaluación, ahora enviar al usuario a donde?
                mensaje = "La evaluación se ha registrado exitosamente";
            }else{
                mensaje = "No se logro actualizar el registro de evaluaciones del sistema";
            }
        }else{
            mensaje = "No se pudo registrar la evaluación, contacte a soporte técnico";
        }
        req.getSession().setAttribute("mensaje", mensaje);
        resp.sendRedirect("evaluarUnidad.jsp");
    }

    public void destroy() {
    }

    public void init() throws ServletException {
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
