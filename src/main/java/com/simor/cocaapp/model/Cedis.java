package com.simor.cocaapp.model;

import java.io.Serializable;

public class Cedis implements Serializable {
    private int id_cedis;
    private String nombre_cedis;
    private String region;

    //Constructor
    public Cedis() {
    }
    //Getter and Setter

    public int getId_cedis() {
        return id_cedis;
    }

    public void setId_cedis(int id_cedis) {
        this.id_cedis = id_cedis;
    }

    public String getNombre_cedis() {
        return nombre_cedis;
    }

    public void setNombre_cedis(String nombre_cedis) {
        this.nombre_cedis = nombre_cedis;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
