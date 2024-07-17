package com.simor.cocaapp.model;

import java.sql.Timestamp;

public class Data {

    private Economico economico;
    private Cedis cedis;
    private Timestamp fecha_de_evaluacion;

    public Data() {
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

    public Timestamp getFecha_de_evaluacion() {
        return fecha_de_evaluacion;
    }

    public void setFecha_de_evaluacion(Timestamp fecha_de_evaluacion) {
        this.fecha_de_evaluacion = fecha_de_evaluacion;
    }
}
