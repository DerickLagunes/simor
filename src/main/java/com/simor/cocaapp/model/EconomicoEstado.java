package com.simor.cocaapp.model;

import java.io.Serializable;
import java.util.Date;

public class EconomicoEstado implements Serializable {
    private int id_estado;
    private String id_economico;
    private Date fecha_de_evaluacion;

    //Constructor
    public EconomicoEstado (){
    }
    //Getter and Setter

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getId_economico() {
        return id_economico;
    }

    public void setId_economico(String id_economico) {
        this.id_economico = id_economico;
    }

    public Date getFecha_de_evaluacion() {
        return fecha_de_evaluacion;
    }

    public void setFecha_de_evaluacion(Date fecha_de_evaluacion) {
        this.fecha_de_evaluacion = fecha_de_evaluacion;
    }
}
