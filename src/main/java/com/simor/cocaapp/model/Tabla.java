package com.simor.cocaapp.model;

import java.util.ArrayList;

public class Tabla {

    private Economico economico;
    private Cedis cedis;
    private Usuario usuario;
    private String consultar_evaluacion;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
