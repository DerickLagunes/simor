package com.simor.cocaapp.model;

import java.io.Serializable;
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
}
