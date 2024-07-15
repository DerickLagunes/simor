package com.simor.cocaapp.controller;

import com.simor.cocaapp.model.DAO.UsuarioDao;
import com.simor.cocaapp.model.Operacion;
import com.simor.cocaapp.model.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserDao", value = "/login")
public class UsuarioServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String pass  = req.getParameter("pass");

        UsuarioDao dao = new UsuarioDao();

        req.getSession().removeAttribute("mensaje");
        Usuario usr = (Usuario) dao.findOne(email, pass);

        if(usr.getId_usuario()!=0){ //Que si existe un usuario en la BD
            req.getSession().setAttribute("sesion",usr);
            //Definir el tipo de sesión de acuerdo al tipo del usuario
            req.getSession().setAttribute("tipoSesion", usr.getTipo_usuario());

            List<Operacion> operaciones = new ArrayList<>();
            switch (usr.getTipo_usuario()){
                case "admin":
                    operaciones.add(
                            new Operacion(
                                    "Ver Usuarios",
                                    "verUsuarios.jsp",
                                    "assets/img/userAdmin.png",
                                    "Ver, agregar, actualizar y eliminar <strong>usuarios</strong> del sistema"
                            ));
                    operaciones.add(
                            new Operacion(
                                    "Evaluaciones",
                                    "verEvaluaciones.jsp",
                                    "assets/img/check_truck.png",
                                    "Ver, agregar, actualizar y eliminar <strong>Evaluaciones registradas</strong> del sistema"
                            ));
                    break;
                case "tecnico":
                    operaciones.add(
                            new Operacion(
                                    "Consultar Unidades Económicas",
                                    "verEconomicos.jsp",
                                    "assets/img/check_truck.png",
                                    "Consultar <strong>las unidades económicas</strong> registradas en el sistema"
                            ));
                    operaciones.add(
                            new Operacion(
                                    "Registrar Unidad Economica",
                                    "nuevoEconomico.jsp",
                                    "assets/img/registrarEconomico.png",
                                    "Agregar <strong>una unidad economica</strong> en el sistema"
                            ));
                    operaciones.add(
                            new Operacion(
                                    "Evaluar Unidad Economica",
                                    "evaluarUnidad.jsp",
                                    "assets/img/evaluarUnidad.png",
                                    "Evaluar <strong>una unidad economica</strong> en el sistema"
                            ));
                    break;
                case "cliente":
                    operaciones.add(
                            new Operacion(
                                    "Ver mis evaluaciónes",
                                    "verEconomicosCliente.jsp",
                                    "assets/img/check_truck.png",
                                    "Ver <strong>sus unidades economicas</strong> registradas en el sistema"
                            ));
                default:
                    break;
            }
            req.getSession().setAttribute("operaciones", operaciones);
        }else{
            req.getSession().setAttribute("mensaje","El usuario o la contraseña son incorrectos");
        }

        resp.sendRedirect("index.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().removeAttribute("sesion");
        resp.sendRedirect("index.jsp");
    }
}
