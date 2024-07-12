package com.simor.cocaapp.model;

import java.io.Serializable;
import java.sql.Timestamp;

public class EconomicoEvaluacion implements Serializable {
    private int id_evaluacion;
    private String id_economico;
    private Timestamp fecha_de_evaluacion;

    //Constructor
    public EconomicoEvaluacion(){
    }
    //Getter and Setter

    public int getId_evaluacion() {
        return id_evaluacion;
    }

    public void setId_evaluacion(int id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
    }

    public String getId_economico() {
        return id_economico;
    }

    public void setId_economico(String id_economico) {
        this.id_economico = id_economico;
    }

    public Timestamp getFecha_de_evaluacion() {
        return fecha_de_evaluacion;
    }

    public void setFecha_de_evaluacion(Timestamp fecha_de_evaluacion) {
        this.fecha_de_evaluacion = fecha_de_evaluacion;
    }
}
