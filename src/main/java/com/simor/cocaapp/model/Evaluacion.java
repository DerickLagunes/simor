package com.simor.cocaapp.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;

public class Evaluacion implements Serializable {
    private int id_evaluacion;
    private int id_usuario;
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
    private Timestamp fecha_de_evaluacion;
    private ArrayList<Resultado> resultados;

    //Constructor
    public Evaluacion(){
        resultados = new ArrayList<>();
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

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Timestamp getFecha_de_evaluacion() {
        return fecha_de_evaluacion;
    }

    public void setFecha_de_evaluacion(Timestamp fecha_de_evaluacion) {
        this.fecha_de_evaluacion = fecha_de_evaluacion;
    }

    public ArrayList<Resultado> getResultados() {
        /*
        Galibo, altas y bajas:
            1 = izq fundida
            2 = derecha fundida
            3 = ambas fundidas
            4 = aprobadas
        */
        if(this.luces_galibo == 1){
            this.resultados.add(new Resultado(false,"Luces Galibo", "Luces","Ambas luces funcionan", "Izquierda fundida"));
        } else if (this.luces_galibo == 2) {
            this.resultados.add(new Resultado(false,"Luces Galibo","Luces", "Ambas luces funcionan","Derecha fundida"));
        } else if (this.luces_galibo == 3) {
            this.resultados.add(new Resultado(false,"Luces Galibo","Luces", "Ambas luces funcionan","Ambas fundidas"));
        }else{
            this.resultados.add(new Resultado(true,"Luces Galibo","Luces", "Ambas luces funcionan","Aprobado"));
        }

        if(this.luces_altas == 1){
            this.resultados.add(new Resultado(false,"Luces Altas","Luces", "Ambas luces funcionan","Izquierda fundida"));
        } else if (this.luces_altas == 2) {
            this.resultados.add(new Resultado(false,"Luces Altas","Luces", "Ambas luces funcionan","Derecha fundida"));
        } else if (this.luces_altas == 3) {
            this.resultados.add(new Resultado(false,"Luces Altas","Luces", "Ambas luces funcionan","Ambas fundidas"));
        }else{
            this.resultados.add(new Resultado(true,"Luces Altas","Luces", "Ambas luces funcionan","Aprobado"));
        }

        if(this.luces_bajas == 1){
            this.resultados.add(new Resultado(false,"Luces Bajas","Luces", "Ambas luces funcionan","Izquierda fundida"));
        } else if (this.luces_bajas == 2) {
            this.resultados.add(new Resultado(false,"Luces Bajas","Luces", "Ambas luces funcionan","Derecha fundida"));
        } else if (this.luces_bajas == 3) {
            this.resultados.add(new Resultado(false,"Luces Bajas","Luces", "Ambas luces funcionan","Ambas fundidas"));
        }else{
            this.resultados.add(new Resultado(true,"Luces Bajas","Luces", "Ambas luces funcionan","Aprobado"));
        }

        /*
        demarcadoras:
            1 = izq fundida
            2 = derecha fundida
            3 = ambas fundidas
            4 = aprobadas
        */
        if(this.luces_demarcadoras_delanteras == 1){
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Delanteras","Luces", "Ambas luces funcionan","Izquierda fundida"));
        } else if (this.luces_demarcadoras_delanteras == 2) {
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Delanteras","Luces", "Ambas luces funcionan","Derecha fundida"));
        } else if (this.luces_demarcadoras_delanteras == 3) {
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Delanteras","Luces", "Ambas luces funcionan","Ambas fundidas"));
        }else{
            this.resultados.add(new Resultado(true,"Luces Demarcadoras Delanteras","Luces", "Ambas luces funcionan","Aprobado"));
        }

        if(this.luces_demarcadoras_traseras == 1){
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Traseras","Luces", "Ambas luces funcionan","Izquierda fundida"));
        } else if (this.luces_demarcadoras_traseras == 2) {
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Traseras","Luces", "Ambas luces funcionan","Derecha fundida"));
        } else if (this.luces_demarcadoras_traseras == 3) {
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Traseras","Luces", "Ambas luces funcionan","Ambas fundidas"));
        }else{
            this.resultados.add(new Resultado(true,"Luces Demarcadoras Traseras","Luces", "Ambas luces funcionan","Aprobado"));
        }

        /*
        indicadoras:
            1 = 1 fundida
            2 = 2 fundida
            3 = 3 fundidas
            4 = aprobadas
        */
        if(this.luces_indicadoras == 1){
            this.resultados.add(new Resultado(false,"Luces Indicadoras","Luces", "Todas las luces funcionan","1 fundida"));
        } else if (this.luces_indicadoras == 2) {
            this.resultados.add(new Resultado(false,"Luces Indicadoras","Luces", "Todas las luces funcionan","2 fundida"));
        } else if (this.luces_indicadoras == 3) {
            this.resultados.add(new Resultado(false,"Luces Indicadoras","Luces", "Todas las luces funcionan","3 fundidas"));
        }else{
            this.resultados.add(new Resultado(true,"Luces Indicadoras","Luces", "Todas las luces funcionan","Aprobadas"));
        }


        //Llantas
        /*
        rines:
            1 = Derecho roto o soldado
            2 = Izquierdo roto o soldado
            3 = Ambos rotos o soldados
            4 = aprobados
        */
        if(this.llantas_rines_delanteros == 1){
            this.resultados.add(new Resultado(false,"Rines Delanteros","Llantas", "Rines en buen estado","Derecho roto o soldado"));
        } else if (this.llantas_rines_delanteros == 2) {
            this.resultados.add(new Resultado(false,"Rines Delanteros","Llantas", "Rines en buen estado","Izquierdo roto o soldado"));
        } else if (this.llantas_rines_delanteros == 3) {
            this.resultados.add(new Resultado(false,"Rines Delanteros","Llantas", "Rines en buen estado","Ambos rotos o soldados"));
        }else{
            this.resultados.add(new Resultado(true,"Rines Delanteros","Llantas", "Rines en buen estado","Aprobados"));
        }

        if(this.llantas_rines_traseros == 1){
            this.resultados.add(new Resultado(false,"Rines Traseros","Llantas", "Rines en buen estado","Derecho roto o soldado"));
        } else if (this.llantas_rines_traseros == 2) {
            this.resultados.add(new Resultado(false,"Rines Traseros","Llantas", "Rines en buen estado","Izquierdo roto o soldado"));
        } else if (this.llantas_rines_traseros == 3) {
            this.resultados.add(new Resultado(false,"Rines Traseros","Llantas", "Rines en buen estado","Ambos rotos o soldados"));
        }else{
            this.resultados.add(new Resultado(true,"Rines Traseros","Llantas", "Rines en buen estado","Aprobados"));
        }

        /*
        masas:
            1 = Derecha con fuga
            2 = Izquierda con fuga
            3 = Ambas con fuga
            4 = aprobadas
        */
        if(this.llantas_masas_delanteras == 1){
            this.resultados.add(new Resultado(false,"Masas Delanteras","Llantas", "Masas en buen estado","Derecha con fuga"));
        } else if (this.llantas_masas_delanteras == 2) {
            this.resultados.add(new Resultado(false,"Masas Delanteras","Llantas", "Masas en buen estado","Izquierda con fuga"));
        } else if (this.llantas_masas_delanteras == 3) {
            this.resultados.add(new Resultado(false,"Masas Delanteras","Llantas", "Masas en buen estado","Ambas con fuga"));
        }else{
            this.resultados.add(new Resultado(true,"Masas Delanteras","Llantas", "Masas en buen estado","Aprobadas"));
        }

        if(this.llantas_masas_traseras == 1){
            this.resultados.add(new Resultado(false,"Masas Traseras","Llantas", "Masas en buen estado","Derecha con fuga"));
        } else if (this.llantas_masas_traseras == 2) {
            this.resultados.add(new Resultado(false,"Masas Traseras","Llantas", "Masas en buen estado","Izquierda con fuga"));
        } else if (this.llantas_masas_traseras == 3) {
            this.resultados.add(new Resultado(false,"Masas Traseras","Llantas", "Masas en buen estado","Ambas con fuga"));
        }else{
            this.resultados.add(new Resultado(true,"Masas Traseras","Llantas", "Masas en buen estado","Aprobadas"));
        }

        /*
        presion es en PSI:
            minimo 70
        */
        if(this.llantas_presion_delantera_izquierda >= 80){
            this.resultados.add(new Resultado(true,"Presión Delantera Izquierda","Llantas", "La presión es igual o mayor a 80 PSI", "Obtuvo: " + this.llantas_presion_delantera_izquierda +" PSI"));
        }else{
            this.resultados.add(new Resultado(false,"Presión Delantera Izquierda","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_delantera_izquierda +" PSI"));
        }
        if(this.llantas_presion_delantera_derecha >= 80){
            this.resultados.add(new Resultado(true,"Presión Delantera Derecha","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_delantera_derecha +" PSI"));
        }else{
            this.resultados.add(new Resultado(false,"Presión Delantera Derecha","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_delantera_derecha +" PSI"));
        }
        if(this.llantas_presion_trasera_izquierda_1 >= 80){
            this.resultados.add(new Resultado(true,"Presión Trasera Izquierda 1","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_izquierda_1 +" PSI"));
        }else{
            this.resultados.add(new Resultado(false,"Presión Trasera Izquierda 1","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_izquierda_1 +" PSI"));
        }
        if(this.llantas_presion_trasera_izquierda_2 >= 80){
            this.resultados.add(new Resultado(true,"Presión Trasera Izquierda 2","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_izquierda_2 +" PSI"));
        }else{
            this.resultados.add(new Resultado(false,"Presión Trasera Izquierda 2","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_izquierda_2 +" PSI"));
        }
        if(this.llantas_presion_trasera_derecha_1 >= 80){
            this.resultados.add(new Resultado(true,"Presión Trasera Derecha 1","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_derecha_1 +" PSI"));
        }else{
            this.resultados.add(new Resultado(false,"Presión Trasera Derecha 1","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_derecha_1 +" PSI"));
        }
        if(this.llantas_presion_trasera_derecha_2 >= 80){
            this.resultados.add(new Resultado(true,"Presión Trasera Derecha 2","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_derecha_2 +" PSI"));
        }else{
            this.resultados.add(new Resultado(false,"Presión Trasera Derecha 2","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_derecha_2 +" PSI"));
        }

        /*
        profundidad es en mm si excede las minimas
        minima delantera 3.2 mm
        minima trasera 1.6 mm
        */
        if(this.llantas_profundidad_delantera_izquierda >= 32){
            this.resultados.add(new Resultado(true,"Profundidad Delantera Izquierda","Llantas", "La profundidad es igual o mayor a 32 milímetros","Obtuvo: " + this.llantas_profundidad_delantera_izquierda + " mm"));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Delantera Izquierda","Llantas", "La profundidad es igual o mayor a 32 milímetros","Obtuvo: " + this.llantas_profundidad_delantera_izquierda + " mm"));
        }
        if(this.llantas_profundidad_delantera_derecha >= 32){
            this.resultados.add(new Resultado(true,"Profundidad Delantera Derecha","Llantas", "La profundidad es igual o mayor a 32 milímetros","Obtuvo: " + this.llantas_profundidad_delantera_derecha + " mm"));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Delantera Derecha","Llantas", "La profundidad es igual o mayor a 32 milímetros","Obtuvo: " + this.llantas_profundidad_delantera_derecha + " mm"));
        }
        if(this.llantas_profundidad_trasera_izquierda_1 >= 16){
            this.resultados.add(new Resultado(true,"Profundidad Trasera Izquierda 1","Llantas", "La profundidad es igual o mayor a 16 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_izquierda_1 + " mm"));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Trasera Izquierda 1","Llantas", "La profundidad es igual o mayor a 16 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_izquierda_1 + " mm"));
        }
        if(this.llantas_profundidad_trasera_izquierda_2 >= 16){
            this.resultados.add(new Resultado(true,"Profundidad Trasera Izquierda 2","Llantas", "La profundidad es igual o mayor a 16 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_izquierda_2 + " mm"));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Trasera Izquierda 2","Llantas", "La profundidad es igual o mayor a 16 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_izquierda_2 + " mm"));
        }
        if(this.llantas_profundidad_trasera_derecha_1 >= 16){
            this.resultados.add(new Resultado(true,"Profundidad Trasera Derecha 1","Llantas", "La profundidad es igual o mayor a 16 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_derecha_1 + " mm"));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Trasera Derecha 1","Llantas", "La profundidad es igual o mayor a 16 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_derecha_1 + " mm"));
        }
        if(this.llantas_profundidad_trasera_derecha_2 >= 16){
            this.resultados.add(new Resultado(true,"Profundidad Trasera Derecha 2","Llantas", "La profundidad es igual o mayor a 16 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_derecha_2 + " mm"));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Trasera Derecha 2","Llantas", "La profundidad es igual o mayor a 16 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_derecha_2 + " mm"));
        }

        /*
        Birlos y Tuercas,
        si variable principal es = 1 significa Rotos o faltantes
        en ese caso se pone el numero de rotos o faltantes, por defecto es 0
        en caso de que sea 2 significa aprobados
        */
        if(this.llantas_birlos_delantera_izquierda == 2){
            this.resultados.add(new Resultado(true,"Birlos Delantera Izquierda","Llantas", "Al menos 8 birlos en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " birlos rotos o faltantes"));
        }else{
            if(this.llantas_birlos_delantera_izquierda_num > 2){
                this.resultados.add(new Resultado(false,"Birlos Delantera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " birlos rotos o faltantes"));
            }else {
                this.resultados.add(new Resultado(true,"Birlos Delantera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " birlos rotos o faltantes"));
            }
        }
        if(this.llantas_birlos_delantera_derecha == 2){
            this.resultados.add(new Resultado(true,"Birlos Delantera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " birlos rotos o faltantes"));
        }else{
            if(this.llantas_birlos_delantera_derecha_num > 2){
                this.resultados.add(new Resultado(false,"Birlos Delantera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " birlos rotos o faltantes"));
            }else {
                this.resultados.add(new Resultado(true,"Birlos Delantera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " birlos rotos o faltantes"));
            }
        }

        if(this.llantas_birlos_trasera_izquierda == 2){
            this.resultados.add(new Resultado(true,"Birlos Trasera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " birlos rotos o faltantes"));
        }else{
            if(this.llantas_birlos_trasera_izquierda_num > 2){
                this.resultados.add(new Resultado(false,"Birlos Trasera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " birlos rotos o faltantes"));
            }else {
                this.resultados.add(new Resultado(true,"Birlos Trasera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " birlos rotos o faltantes"));
            }
        }
        if(this.llantas_birlos_trasera_derecha == 2){
            this.resultados.add(new Resultado(true,"Birlos Trasera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " birlos rotos o faltantes"));
        }else{
            if(this.llantas_birlos_trasera_derecha_num > 2){
                this.resultados.add(new Resultado(false,"Birlos Trasera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " birlos rotos o faltantes"));
            }else {
                this.resultados.add(new Resultado(true,"Birlos Trasera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " birlos rotos o faltantes"));
            }
        }

        //Tuercas
        if(this.llantas_tuercas_delantera_izquierda == 2){
            this.resultados.add(new Resultado(true,"Tuercas Delantera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " tuercas rotas o faltantes"));
        }else{
            if(this.llantas_tuercas_delantera_izquierda_num > 2){
                this.resultados.add(new Resultado(false,"Tuercas Delantera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " tuercas rotas o faltantes"));
            }else {
                this.resultados.add(new Resultado(true,"Tuercas Delantera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " tuercas rotas o faltantes"));
            }
        }
        if(this.llantas_tuercas_delantera_derecha == 2){
            this.resultados.add(new Resultado(true,"Tuercas Delantera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " tuercas rotas o faltantes"));
        }else{
            if(this.llantas_tuercas_delantera_derecha_num > 2){
                this.resultados.add(new Resultado(false,"Tuercas Delantera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " tuercas rotas o faltantes"));
            }else {
                this.resultados.add(new Resultado(true,"Tuercas Delantera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " tuercas rotas o faltantes"));
            }
        }

        if(this.llantas_tuercas_trasera_izquierda == 2){
            this.resultados.add(new Resultado(true,"Tuercas Trasera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " tuercas rotas o faltantes"));
        }else{
            if(this.llantas_tuercas_trasera_izquierda_num > 2){
                this.resultados.add(new Resultado(false,"Tuercas Trasera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " tuercas rotas o faltantes"));
            }else {
                this.resultados.add(new Resultado(true,"Tuercas Trasera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " tuercas rotas o faltantes"));
            }
        }
        if(this.llantas_tuercas_trasera_derecha == 2){
            this.resultados.add(new Resultado(true,"Tuercas Trasera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " tuercas rotas o faltantes"));
        }else{
            if(this.llantas_tuercas_trasera_derecha_num > 2){
                this.resultados.add(new Resultado(false,"Tuercas Trasera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " tuercas rotas o faltantes"));
            }else {
                this.resultados.add(new Resultado(true,"Tuercas Trasera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " tuercas rotas o faltantes"));
            }
        }

        //Otros
        /*
        Caja de dirección y deposito de aceite:
            1 = Fuga de aceite
            2 = Aprobado
        */
        if(this.caja_direccion == 1){
            this.resultados.add(new Resultado(false,"Caja de Dirección", "Otros", "Caja en buen estado", "Fuga de aceite"));
        }else{
            this.resultados.add(new Resultado(true,"Caja de Dirección","Otros", "Caja en buen estado","Aprobada"));
        }
        if(this.deposito_aceite == 1){
            this.resultados.add(new Resultado(false,"Deposito de Aceite", "Otros", "Deposito en buen estado","Fuga de aceite"));
        }else{
            this.resultados.add(new Resultado(true,"Deposito de Aceite","Otros", "Deposito en buen estado","Aprobado"));
        }

        /*
        Parabrisas:
            1 = Aprobado
            2 = Estrellado
        */
        if(this.parabrisas == 2){
            this.resultados.add(new Resultado(false,"Parabrisas", "Otros", "Parabrisas en buen estado","Estrellado"));
        }else{
            this.resultados.add(new Resultado(true,"Parabrisas","Otros", "Parabrisas en buen estado","Aprobado"));
        }


        /*
        Limpia Parabrisas:
            1 = Aprobado
            2 = No funciona
            3 = Falta 1 pluma
            4 = Faltan 2 plumas
        */
        if(this.limpiaparabrisas == 4){
            this.resultados.add(new Resultado(false,"Limpia Parabrisas", "Otros", "Limpia parabrisas en buen estado","Faltan 2 plumas"));
        } else if (this.limpiaparabrisas == 3) {
            this.resultados.add(new Resultado(false,"Limpia Parabrisas", "Otros", "Limpia parabrisas en buen estado","Falta 1 pluma"));
        } else if (this.limpiaparabrisas == 2) {
            this.resultados.add(new Resultado(false,"Limpia Parabrisas", "Otros", "Limpia parabrisas en buen estado","No funciona"));
        }else{
            this.resultados.add(new Resultado(true,"Limpia Parabrisas","Otros", "Limpia parabrisas en buen estado","Aprobado"));
        }

        /*
        Huelgo:
            1 = Aprobado
            2 = cuanto
        */
        if(this.huelgo == 1){
            this.resultados.add(new Resultado(true,"Huelgo","Otros", "Huelgo en buen estado","Aprobado"));
        }else{
            this.resultados.add(new Resultado(false,"Huelgo","Llantas", "Huelgo en buen estado","Obtuvo: " + this.huelgo_cuanto));
        }

        /*
        Escape:
            1 = Aprobado
            2 = Faltante
            3 = Roto
        */
        if(this.escape == 3){
            this.resultados.add(new Resultado(false,"Escape", "Otros", "Escape en buen estado","Roto"));
        } else if (this.limpiaparabrisas == 2) {
            this.resultados.add(new Resultado(false,"Escape", "Otros", "Escape en buen estado","Faltante"));
        } else{
            this.resultados.add(new Resultado(true,"Escape","Otros", "Escape en buen estado","Aprobado"));
        }

        this.resultados = resultados;
        return resultados;
    }
}
