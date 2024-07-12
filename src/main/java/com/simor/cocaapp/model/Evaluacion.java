package com.simor.cocaapp.model;

import java.io.Serializable;

public class Evaluacion implements Serializable {
    private int id_evaluacion;
    private int luces_galibo;
    private int luces_altas;
    private int luces_bajas;
    private int luces_demarcadoras_delanteras;
    private int luces_demarcadoras_traseras;
    private int luces_indicadoras;
    private int llantas_rines_delanteros;
    private int llantas_rines_traseros;
    private int llantas_masas_delanteras;
    private int llantas_masas_traseras;
    private int llantas_presion_delantera_izquierda;
    private int llantas_presion_delantera_derecha;
    private int llantas_presion_trasera_izquierda_1;
    private int llantas_presion_trasera_izquierda_2;
    private int llantas_presion_trasera_derecha_1;
    private int llantas_presion_trasera_derecha_2;
    private int llantas_profundidad_delantera_izquierda;
    private int llantas_profundidad_delantera_derecha;
    private int llantas_profundidad_trasera_izquierda_1;
    private int llantas_profundidad_trasera_izquierda_2;
    private int llantas_profundidad_trasera_derecha_1;
    private int llantas_profundidad_trasera_derecha_2;
    private int llantas_birlos_delantera_izquierda;
    private int llantas_birlos_delantera_derecha;
    private int llantas_birlos_trasera_izquierda;
    private int llantas_birlos_trasera_derecha;
    private int llantas_birlos_delantera_izquierda_num = 0;
    private int llantas_birlos_delantera_derecha_num = 0;
    private int llantas_birlos_trasera_izquierda_num = 0;
    private int llantas_birlos_trasera_derecha_num = 0;
    private int llantas_tuercas_delantera_izquierda;
    private int llantas_tuercas_delantera_derecha;
    private int llantas_tuercas_trasera_izquierda;
    private int llantas_tuercas_trasera_derecha;
    private int llantas_tuercas_delantera_izquierda_num = 0;
    private int llantas_tuercas_delantera_derecha_num = 0;
    private int llantas_tuercas_trasera_izquierda_num = 0;
    private int llantas_tuercas_trasera_derecha_num = 0;
    private int caja_direccion;
    private int deposito_aceite;
    private int parabrisas;
    private int limpiaparabrisas;
    private int huelgo;
    private int huelgo_cuanto;
    private int escape;

    //Constructor
    public Evaluacion(){
    }
    //Getter and Setter


    public int getId_evaluacion() {
        return id_evaluacion;
    }

    public void setId_evaluacion(int id_evaluacion) {
        this.id_evaluacion = id_evaluacion;
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
    public int getLuces_demarcadoras_delanteras() {
        return luces_demarcadoras_delanteras;
    }

    public void setLuces_demarcadoras_delanteras(int luces_demarcadoras_delanteras) {
        this.luces_demarcadoras_delanteras = luces_demarcadoras_delanteras;
    }

    public int getLuces_demarcadoras_traseras() {
        return luces_demarcadoras_traseras;
    }

    public void setLuces_demarcadoras_traseras(int luces_demarcadoras_traseras) {
        this.luces_demarcadoras_traseras = luces_demarcadoras_traseras;
    }

    public int getLlantas_presion_delantera_izquierda() {
        return llantas_presion_delantera_izquierda;
    }

    public void setLlantas_presion_delantera_izquierda(int llantas_presion_delantera_izquierda) {
        this.llantas_presion_delantera_izquierda = llantas_presion_delantera_izquierda;
    }

    public int getLlantas_presion_delantera_derecha() {
        return llantas_presion_delantera_derecha;
    }

    public void setLlantas_presion_delantera_derecha(int llantas_presion_delantera_derecha) {
        this.llantas_presion_delantera_derecha = llantas_presion_delantera_derecha;
    }

    public int getLlantas_presion_trasera_izquierda_1() {
        return llantas_presion_trasera_izquierda_1;
    }

    public void setLlantas_presion_trasera_izquierda_1(int llantas_presion_trasera_izquierda_1) {
        this.llantas_presion_trasera_izquierda_1 = llantas_presion_trasera_izquierda_1;
    }

    public int getLlantas_presion_trasera_izquierda_2() {
        return llantas_presion_trasera_izquierda_2;
    }

    public void setLlantas_presion_trasera_izquierda_2(int llantas_presion_trasera_izquierda_2) {
        this.llantas_presion_trasera_izquierda_2 = llantas_presion_trasera_izquierda_2;
    }

    public int getLlantas_presion_trasera_derecha_1() {
        return llantas_presion_trasera_derecha_1;
    }

    public void setLlantas_presion_trasera_derecha_1(int llantas_presion_trasera_derecha_1) {
        this.llantas_presion_trasera_derecha_1 = llantas_presion_trasera_derecha_1;
    }

    public int getLlantas_presion_trasera_derecha_2() {
        return llantas_presion_trasera_derecha_2;
    }

    public void setLlantas_presion_trasera_derecha_2(int llantas_presion_trasera_derecha_2) {
        this.llantas_presion_trasera_derecha_2 = llantas_presion_trasera_derecha_2;
    }

    public int getLlantas_profundidad_delantera_izquierda() {
        return llantas_profundidad_delantera_izquierda;
    }

    public void setLlantas_profundidad_delantera_izquierda(int llantas_profundidad_delantera_izquierda) {
        this.llantas_profundidad_delantera_izquierda = llantas_profundidad_delantera_izquierda;
    }

    public int getLlantas_profundidad_delantera_derecha() {
        return llantas_profundidad_delantera_derecha;
    }

    public void setLlantas_profundidad_delantera_derecha(int llantas_profundidad_delantera_derecha) {
        this.llantas_profundidad_delantera_derecha = llantas_profundidad_delantera_derecha;
    }

    public int getLlantas_profundidad_trasera_izquierda_1() {
        return llantas_profundidad_trasera_izquierda_1;
    }

    public void setLlantas_profundidad_trasera_izquierda_1(int llantas_profundidad_trasera_izquierda_1) {
        this.llantas_profundidad_trasera_izquierda_1 = llantas_profundidad_trasera_izquierda_1;
    }

    public int getLlantas_profundidad_trasera_izquierda_2() {
        return llantas_profundidad_trasera_izquierda_2;
    }

    public void setLlantas_profundidad_trasera_izquierda_2(int llantas_profundidad_trasera_izquierda_2) {
        this.llantas_profundidad_trasera_izquierda_2 = llantas_profundidad_trasera_izquierda_2;
    }

    public int getLlantas_profundidad_trasera_derecha_1() {
        return llantas_profundidad_trasera_derecha_1;
    }

    public void setLlantas_profundidad_trasera_derecha_1(int llantas_profundidad_trasera_derecha_1) {
        this.llantas_profundidad_trasera_derecha_1 = llantas_profundidad_trasera_derecha_1;
    }

    public int getLlantas_profundidad_trasera_derecha_2() {
        return llantas_profundidad_trasera_derecha_2;
    }

    public void setLlantas_profundidad_trasera_derecha_2(int llantas_profundidad_trasera_derecha_2) {
        this.llantas_profundidad_trasera_derecha_2 = llantas_profundidad_trasera_derecha_2;
    }

    public int getHuelgo_cuanto() {
        return huelgo_cuanto;
    }

    public void setHuelgo_cuanto(int huelgo_cuanto) {
        this.huelgo_cuanto = huelgo_cuanto;
    }

    public int getLlantas_birlos_delantera_izquierda() {
        return llantas_birlos_delantera_izquierda;
    }

    public void setLlantas_birlos_delantera_izquierda(int llantas_birlos_delantera_izquierda) {
        this.llantas_birlos_delantera_izquierda = llantas_birlos_delantera_izquierda;
    }

    public int getLlantas_birlos_delantera_derecha() {
        return llantas_birlos_delantera_derecha;
    }

    public void setLlantas_birlos_delantera_derecha(int llantas_birlos_delantera_derecha) {
        this.llantas_birlos_delantera_derecha = llantas_birlos_delantera_derecha;
    }

    public int getLlantas_birlos_trasera_izquierda() {
        return llantas_birlos_trasera_izquierda;
    }

    public void setLlantas_birlos_trasera_izquierda(int llantas_birlos_trasera_izquierda) {
        this.llantas_birlos_trasera_izquierda = llantas_birlos_trasera_izquierda;
    }

    public int getLlantas_birlos_trasera_derecha() {
        return llantas_birlos_trasera_derecha;
    }

    public void setLlantas_birlos_trasera_derecha(int llantas_birlos_trasera_derecha) {
        this.llantas_birlos_trasera_derecha = llantas_birlos_trasera_derecha;
    }

    public int getLlantas_birlos_delantera_izquierda_num() {
        return llantas_birlos_delantera_izquierda_num;
    }

    public void setLlantas_birlos_delantera_izquierda_num(int llantas_birlos_delantera_izquierda_num) {
        this.llantas_birlos_delantera_izquierda_num = llantas_birlos_delantera_izquierda_num;
    }

    public int getLlantas_birlos_delantera_derecha_num() {
        return llantas_birlos_delantera_derecha_num;
    }

    public void setLlantas_birlos_delantera_derecha_num(int llantas_birlos_delantera_derecha_num) {
        this.llantas_birlos_delantera_derecha_num = llantas_birlos_delantera_derecha_num;
    }

    public int getLlantas_birlos_trasera_izquierda_num() {
        return llantas_birlos_trasera_izquierda_num;
    }

    public void setLlantas_birlos_trasera_izquierda_num(int llantas_birlos_trasera_izquierda_num) {
        this.llantas_birlos_trasera_izquierda_num = llantas_birlos_trasera_izquierda_num;
    }

    public int getLlantas_birlos_trasera_derecha_num() {
        return llantas_birlos_trasera_derecha_num;
    }

    public void setLlantas_birlos_trasera_derecha_num(int llantas_birlos_trasera_derecha_num) {
        this.llantas_birlos_trasera_derecha_num = llantas_birlos_trasera_derecha_num;
    }

    public int getLlantas_tuercas_delantera_izquierda() {
        return llantas_tuercas_delantera_izquierda;
    }

    public void setLlantas_tuercas_delantera_izquierda(int llantas_tuercas_delantera_izquierda) {
        this.llantas_tuercas_delantera_izquierda = llantas_tuercas_delantera_izquierda;
    }

    public int getLlantas_tuercas_delantera_derecha() {
        return llantas_tuercas_delantera_derecha;
    }

    public void setLlantas_tuercas_delantera_derecha(int llantas_tuercas_delantera_derecha) {
        this.llantas_tuercas_delantera_derecha = llantas_tuercas_delantera_derecha;
    }

    public int getLlantas_tuercas_trasera_izquierda() {
        return llantas_tuercas_trasera_izquierda;
    }

    public void setLlantas_tuercas_trasera_izquierda(int llantas_tuercas_trasera_izquierda) {
        this.llantas_tuercas_trasera_izquierda = llantas_tuercas_trasera_izquierda;
    }

    public int getLlantas_tuercas_trasera_derecha() {
        return llantas_tuercas_trasera_derecha;
    }

    public void setLlantas_tuercas_trasera_derecha(int llantas_tuercas_trasera_derecha) {
        this.llantas_tuercas_trasera_derecha = llantas_tuercas_trasera_derecha;
    }

    public int getLlantas_tuercas_delantera_izquierda_num() {
        return llantas_tuercas_delantera_izquierda_num;
    }

    public void setLlantas_tuercas_delantera_izquierda_num(int llantas_tuercas_delantera_izquierda_num) {
        this.llantas_tuercas_delantera_izquierda_num = llantas_tuercas_delantera_izquierda_num;
    }

    public int getLlantas_tuercas_delantera_derecha_num() {
        return llantas_tuercas_delantera_derecha_num;
    }

    public void setLlantas_tuercas_delantera_derecha_num(int llantas_tuercas_delantera_derecha_num) {
        this.llantas_tuercas_delantera_derecha_num = llantas_tuercas_delantera_derecha_num;
    }

    public int getLlantas_tuercas_trasera_izquierda_num() {
        return llantas_tuercas_trasera_izquierda_num;
    }

    public void setLlantas_tuercas_trasera_izquierda_num(int llantas_tuercas_trasera_izquierda_num) {
        this.llantas_tuercas_trasera_izquierda_num = llantas_tuercas_trasera_izquierda_num;
    }

    public int getLlantas_tuercas_trasera_derecha_num() {
        return llantas_tuercas_trasera_derecha_num;
    }

    public void setLlantas_tuercas_trasera_derecha_num(int llantas_tuercas_trasera_derecha_num) {
        this.llantas_tuercas_trasera_derecha_num = llantas_tuercas_trasera_derecha_num;
    }
}
