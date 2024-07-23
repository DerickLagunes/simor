package com.simor.cocaapp.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Economico implements Serializable {
    private String placa;
    private String id_economico;
    private int id_cedis;
    private ArrayList<Dictamen> dictamenes;

    private ArrayList<Evaluacion> evaluaciones;
    private int id_usuario;

//Constructor
    public Economico(){
        this.evaluaciones = new ArrayList<>();
        this.dictamenes = new ArrayList<>();
    }
    //Getter and Setter
    public String getPlaca() {return placa;}

    public void setPlaca(String placa) {this.placa = placa;}

    public String getId_economico() {
        return id_economico;
    }

    public void setId_economico(String id_economico) {
        this.id_economico = id_economico;
    }

    public int getId_cedis() {
        return id_cedis;
    }

    public void setId_cedis(int id_cedis) {
        this.id_cedis = id_cedis;
    }

    public ArrayList<Dictamen> getDictamenes() {
        return dictamenes;
    }

    public void setDictamenes(ArrayList<Dictamen> dictamenes) {
        this.dictamenes = dictamenes;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getSelector(boolean isCliente){
        String eval1 ="<select class=\"form-select selectWithLinks\">\n";
        String options = "<option value=\"\" disabled selected>Evaluaciones...</option>\n";
        String eval2 = "</select><br>\n";
        if(this.getEvaluaciones().get(0).getId_evaluacion() > 0) {
            for (Evaluacion e : this.getEvaluaciones()) {
                if (e.getFecha_de_evaluacion() != null) {
                    String formattedDate = new SimpleDateFormat("dd/MM/yyyy").format(e.getFecha_de_evaluacion());
                    options += "<option value=\"verEvaluacion"+ (isCliente? "Cliente":"") +"?id_evaluacion=" + e.getId_evaluacion() + "\">" + formattedDate + "</option>\n";
                }
            }
        }else{
            eval1 = "<strong class=\"mb-0\">Sin Evaluaciones </strong>";
            if(isCliente){
                options = "Por favor espere a que un técnico registre la evaluación de su unidad.";
            }else{
                options = "<a class=\"btn btn-primary\" href=\"evaluarUnidadEspecifica?id_cedis="+this.getId_cedis()+"&id_economico="+this.getId_economico()+"\">Agregar</a>";
            }
            eval2 = "<br><br>";
        }
        //Dictamenes
        String eval3 ="<select class=\"form-select selectWithLinks\">\n";
        String options2 = "<option value=\"\" disabled selected>Dictamenes...</option>\n";
        String eval4 = "</select>\n";
        if(this.getDictamenes().get(0).getId_dictamen() > 0) {
            for (Dictamen e : this.getDictamenes()) {
                if (e.getFolio1() != "" && e.getFolio2() != "") {
                    options2 += "<option value=\"verDictamen"+ (isCliente? "Cliente":"") +"?id_dictamen=" + e.getId_dictamen() + "&id_economico="+this.getId_economico()+"\"> Folio1: " + e.getFolio1() +" | Folio2:"+ e.getFolio2() + "</option>\n";
                }
            }
        }else{
            eval3 = "<strong class=\"mb-0\"> Sin Dictamenes &nbsp;&nbsp;</strong>";
            if(isCliente){
                options2 = "Por favor espere a que un técnico carge el dictamen de su unidad.";

            }else{
                options2 = "<a class=\"btn btn-primary\" href=\"cargarDictamenEspecifico?id_economico="+this.getId_economico()+"\">Agregar</a>";
            }
            eval4 = "<br>";
        }
        return eval1 + options + eval2 + eval3 + options2 + eval4;
    }
}
