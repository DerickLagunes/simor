package com.simor.cocaapp.model;

public class Dictamen {
    private int id_dictamen;
    private String folio_humo;
    private String folio_fisico;
    private String archivo_humo;
    private String archivo_fisico;

    public Dictamen() {
    }

    public int getId_dictamen() {
        return id_dictamen;
    }

    public void setId_dictamen(int id_dictamen) {
        this.id_dictamen = id_dictamen;
    }

    public String getFolio1() {
        return folio_humo;
    }

    public void setFolio1(String folio_humo) {
        this.folio_humo = folio_humo;
    }

    public String getFolio2() {
        return folio_fisico;
    }

    public void setFolio2(String folio_fisico) {
        this.folio_fisico = folio_fisico;
    }

    public String getArchivo1() {
        return archivo_humo;
    }

    public void setArchivo1(String archivo_humo) {
        this.archivo_humo = archivo_humo;
    }

    public String getArchivo2() {
        return archivo_fisico;
    }

    public void setArchivo2(String archivo_fisico) {
        this.archivo_fisico = archivo_fisico;
    }
}
