package com.simor.cocaapp.model;

public class Dictamen {
    private int id_dictamen;
    private int folio1;
    private int folio2;
    private String archivo1;
    private String archivo2;

    public Dictamen() {
    }

    public int getId_dictamen() {
        return id_dictamen;
    }

    public void setId_dictamen(int id_dictamen) {
        this.id_dictamen = id_dictamen;
    }

    public int getFolio1() {
        return folio1;
    }

    public void setFolio1(int folio1) {
        this.folio1 = folio1;
    }

    public int getFolio2() {
        return folio2;
    }

    public void setFolio2(int folio2) {
        this.folio2 = folio2;
    }

    public String getArchivo1() {
        return archivo1;
    }

    public void setArchivo1(String archivo1) {
        this.archivo1 = archivo1;
    }

    public String getArchivo2() {
        return archivo2;
    }

    public void setArchivo2(String archivo2) {
        this.archivo2 = archivo2;
    }
}
