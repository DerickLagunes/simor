package com.simor.cocaapp.model;

import java.util.ArrayList;

public class Tabla {

    private Economico economico;
    private Cedis cedis;
    private Usuario usuario;
    private String consultar_evaluacion;
    private String consultar_dictamen1;
    private String consultar_dictamen2;

    public Tabla() {
    }

    public Economico getEconomico() {
        return economico;
    }

    public void setEconomico(Economico economico) {
        this.economico = economico;
    }

    public Cedis getCedis() {
        return cedis;
    }

    public void setCedis(Cedis cedis) {
        this.cedis = cedis;
    }

    public String getConsultar_evaluacion() {
        return consultar_evaluacion;
    }

    public void setConsultar_evaluacion(String consultar_evaluacion) {
        this.consultar_evaluacion = consultar_evaluacion;
    }

    public String getConsultar_dictamen1() {
        return consultar_dictamen1;
    }

    public void setConsultar_dictamen1(String consultar_dictamen1) {
        this.consultar_dictamen1 = consultar_dictamen1;
    }

    public String getConsultar_dictamen2() {
        return consultar_dictamen2;
    }

    public void setConsultar_dictamen2(String consultar_dictamen2) {
        this.consultar_dictamen2 = consultar_dictamen2;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
