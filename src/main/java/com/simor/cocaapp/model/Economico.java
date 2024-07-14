package com.simor.cocaapp.model;

import java.io.Serializable;

public class Economico implements Serializable {
    private String placa;
private String id_economico;
private int id_cedis;

//Constructor
    public Economico(){}
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
}
