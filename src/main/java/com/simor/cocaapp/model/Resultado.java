package com.simor.cocaapp.model;

public class Resultado {
    private boolean aprobado;
    private String elemento;
    private String categoria;
    private String apruebaCon;
    private String resultado;

    public Resultado() {
    }

    public Resultado(boolean aprobado, String elemento, String categoria, String apruebaCon, String resultado) {
        this.aprobado = aprobado;
        this.elemento = elemento;
        this.categoria = categoria;
        this.apruebaCon = apruebaCon;
        this.resultado = resultado;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getApruebaCon() {
        return apruebaCon;
    }

    public void setApruebaCon(String apruebaCon) {
        this.apruebaCon = apruebaCon;
    }
}
