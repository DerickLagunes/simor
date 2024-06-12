package com.simor.cocaapp.model;

import java.io.Serializable;

public class EstadoVehiculo implements Serializable {
    private int id_estado;
    private int luces_galibo;
    private int luces_altas;
    private int luces_bajas;
    private int luces_demarcadoras;
    private int luces_indicadoras;
    private int llantas_rines_delanteros;
    private int llantas_rines_traseros;
    private int llantas_masas_delanteras;
    private int llantas_masas_traseras;
    private int llantas_presion;
    private int llantas_profundidad;
    private int llantas_birlos_delanteros;
    private int llantas_birlos_traseros;
    private int llantas_tuercas_delanteros;
    private int llantas_tuercas_traseros;
    private int caja_direccion;
    private int deposito_aceite;
    private int parabrisas;
    private int limpiaparabrisas;
    private int huelgo;
    private int escape;

    //Constructor
    public EstadoVehiculo(){
    }
    //Getter and Setter

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public int getLuces_galibo() {
        return luces_galibo;
    }

    public void setLuces_galibo(int luces_galibo) {
        this.luces_galibo = luces_galibo;
    }

    public int getLuces_altas() {
        return luces_altas;
    }

    public void setLuces_altas(int luces_altas) {
        this.luces_altas = luces_altas;
    }

    public int getLuces_bajas() {
        return luces_bajas;
    }

    public void setLuces_bajas(int luces_bajas) {
        this.luces_bajas = luces_bajas;
    }

    public int getLuces_demarcadoras() {
        return luces_demarcadoras;
    }

    public void setLuces_demarcadoras(int luces_demarcadoras) {
        this.luces_demarcadoras = luces_demarcadoras;
    }

    public int getLuces_indicadoras() {
        return luces_indicadoras;
    }

    public void setLuces_indicadoras(int luces_indicadoras) {
        this.luces_indicadoras = luces_indicadoras;
    }

    public int getLlantas_rines_delanteros() {
        return llantas_rines_delanteros;
    }

    public void setLlantas_rines_delanteros(int llantas_rines_delanteros) {
        this.llantas_rines_delanteros = llantas_rines_delanteros;
    }

    public int getLlantas_rines_traseros() {
        return llantas_rines_traseros;
    }

    public void setLlantas_rines_traseros(int llantas_rines_traseros) {
        this.llantas_rines_traseros = llantas_rines_traseros;
    }

    public int getLlantas_masas_delanteras() {
        return llantas_masas_delanteras;
    }

    public void setLlantas_masas_delanteras(int llantas_masas_delanteras) {
        this.llantas_masas_delanteras = llantas_masas_delanteras;
    }

    public int getLlantas_masas_traseras() {
        return llantas_masas_traseras;
    }

    public void setLlantas_masas_traseras(int llantas_masas_traseras) {
        this.llantas_masas_traseras = llantas_masas_traseras;
    }

    public int getLlantas_presion() {
        return llantas_presion;
    }

    public void setLlantas_presion(int llantas_presion) {
        this.llantas_presion = llantas_presion;
    }

    public int getLlantas_profundidad() {
        return llantas_profundidad;
    }

    public void setLlantas_profundidad(int llantas_profundidad) {
        this.llantas_profundidad = llantas_profundidad;
    }

    public int getLlantas_birlos_delanteros() {
        return llantas_birlos_delanteros;
    }

    public void setLlantas_birlos_delanteros(int llantas_birlos_delanteros) {
        this.llantas_birlos_delanteros = llantas_birlos_delanteros;
    }

    public int getLlantas_birlos_traseros() {
        return llantas_birlos_traseros;
    }

    public void setLlantas_birlos_traseros(int llantas_birlos_traseros) {
        this.llantas_birlos_traseros = llantas_birlos_traseros;
    }

    public int getLlantas_tuercas_delanteros() {
        return llantas_tuercas_delanteros;
    }

    public void setLlantas_tuercas_delanteros(int llantas_tuercas_delanteros) {
        this.llantas_tuercas_delanteros = llantas_tuercas_delanteros;
    }

    public int getLlantas_tuercas_traseros() {
        return llantas_tuercas_traseros;
    }

    public void setLlantas_tuercas_traseros(int llantas_tuercas_traseros) {
        this.llantas_tuercas_traseros = llantas_tuercas_traseros;
    }

    public int getCaja_direccion() {
        return caja_direccion;
    }

    public void setCaja_direccion(int caja_direccion) {
        this.caja_direccion = caja_direccion;
    }

    public int getDeposito_aceite() {
        return deposito_aceite;
    }

    public void setDeposito_aceite(int deposito_aceite) {
        this.deposito_aceite = deposito_aceite;
    }

    public int getParabrisas() {
        return parabrisas;
    }

    public void setParabrisas(int parabrisas) {
        this.parabrisas = parabrisas;
    }

    public int getLimpiaparabrisas() {
        return limpiaparabrisas;
    }

    public void setLimpiaparabrisas(int limpiaparabrisas) {
        this.limpiaparabrisas = limpiaparabrisas;
    }

    public int getHuelgo() {
        return huelgo;
    }

    public void setHuelgo(int huelgo) {
        this.huelgo = huelgo;
    }

    public int getEscape() {
        return escape;
    }

    public void setEscape(int escape) {
        this.escape = escape;
    }

}
