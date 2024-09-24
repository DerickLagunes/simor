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
    private float llantas_profundidad_delantera_izquierda;
    private float llantas_profundidad_delantera_derecha;
    private float llantas_profundidad_trasera_izquierda_1;
    private float llantas_profundidad_trasera_izquierda_2;
    private float llantas_profundidad_trasera_derecha_1;
    private float llantas_profundidad_trasera_derecha_2;
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
    private int manijas_de_puertas;
    private int chavetas;
    private int chavetas_cuanto;
    private int brazo_pitman;
    private int faro_izquierdo;
    private int faro_derecho;
    private int compresor;
    private int tiempo_de_carga_psi;
    private float tiempo_de_carga_tiempo;
    private int tanques_de_aire;
    private int luces_direccionales_delanteras;
    private int luces_direccionales_traseras;
    private int humo;
    private int gobernado;
    private String evidencia1;
    private String evidencia2;
    private String comentarios;

    //Constructor
    public Evaluacion(){
        resultados = new ArrayList<>();
    }

    //Getter and Setters
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

    public float getLlantas_profundidad_delantera_izquierda() {
        return llantas_profundidad_delantera_izquierda;
    }

    public void setLlantas_profundidad_delantera_izquierda(float llantas_profundidad_delantera_izquierda) {
        this.llantas_profundidad_delantera_izquierda = llantas_profundidad_delantera_izquierda;
    }

    public float getLlantas_profundidad_delantera_derecha() {
        return llantas_profundidad_delantera_derecha;
    }

    public void setLlantas_profundidad_delantera_derecha(float llantas_profundidad_delantera_derecha) {
        this.llantas_profundidad_delantera_derecha = llantas_profundidad_delantera_derecha;
    }

    public float getLlantas_profundidad_trasera_izquierda_1() {
        return llantas_profundidad_trasera_izquierda_1;
    }

    public void setLlantas_profundidad_trasera_izquierda_1(float llantas_profundidad_trasera_izquierda_1) {
        this.llantas_profundidad_trasera_izquierda_1 = llantas_profundidad_trasera_izquierda_1;
    }

    public float getLlantas_profundidad_trasera_izquierda_2() {
        return llantas_profundidad_trasera_izquierda_2;
    }

    public void setLlantas_profundidad_trasera_izquierda_2(float llantas_profundidad_trasera_izquierda_2) {
        this.llantas_profundidad_trasera_izquierda_2 = llantas_profundidad_trasera_izquierda_2;
    }

    public float getLlantas_profundidad_trasera_derecha_1() {
        return llantas_profundidad_trasera_derecha_1;
    }

    public void setLlantas_profundidad_trasera_derecha_1(float llantas_profundidad_trasera_derecha_1) {
        this.llantas_profundidad_trasera_derecha_1 = llantas_profundidad_trasera_derecha_1;
    }

    public float getLlantas_profundidad_trasera_derecha_2() {
        return llantas_profundidad_trasera_derecha_2;
    }

    public void setLlantas_profundidad_trasera_derecha_2(float llantas_profundidad_trasera_derecha_2) {
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

    public void setResultados(ArrayList<Resultado> resultados) {
        this.resultados = resultados;
    }

    public int getManijas_de_puertas() {
        return manijas_de_puertas;
    }

    public void setManijas_de_puertas(int manijas_de_puertas) {
        this.manijas_de_puertas = manijas_de_puertas;
    }

    public int getChavetas() {
        return chavetas;
    }

    public void setChavetas(int chavetas) {
        this.chavetas = chavetas;
    }

    public int getBrazo_pitman() {
        return brazo_pitman;
    }

    public void setBrazo_pitman(int brazo_pitman) {
        this.brazo_pitman = brazo_pitman;
    }

    public int getCompresor() {
        return compresor;
    }

    public void setCompresor(int compresor) {
        this.compresor = compresor;
    }


    public int getLuces_direccionales_delanteras() {
        return luces_direccionales_delanteras;
    }

    public void setLuces_direccionales_delanteras(int getLuces_direccionales_delanteras) {
        this.luces_direccionales_delanteras = getLuces_direccionales_delanteras;
    }

    public int getTiempo_de_carga_psi() {
        return tiempo_de_carga_psi;
    }

    public void setTiempo_de_carga_psi(int tiempo_de_carga_psi) {
        this.tiempo_de_carga_psi = tiempo_de_carga_psi;
    }

    public float getTiempo_de_carga_tiempo() {
        return tiempo_de_carga_tiempo;
    }

    public void setTiempo_de_carga_tiempo(float tiempo_de_carga_tiempo) {
        this.tiempo_de_carga_tiempo = tiempo_de_carga_tiempo;
    }

    public int getLuces_direccionales_traseras() {
        return luces_direccionales_traseras;
    }

    public void setLuces_direccionales_traseras(int getLuces_direccionales_traseras) {
        this.luces_direccionales_traseras = getLuces_direccionales_traseras;
    }

    public int getFaro_izquierdo() {
        return faro_izquierdo;
    }

    public void setFaro_izquierdo(int faro_izquierdo) {
        this.faro_izquierdo = faro_izquierdo;
    }

    public int getFaro_derecho() {
        return faro_derecho;
    }

    public void setFaro_derecho(int faro_derecho) {
        this.faro_derecho = faro_derecho;
    }

    public int getHumo() {
        return humo;
    }

    public void setHumo(int humo) {
        this.humo = humo;
    }

    public int getGobernado() {
        return gobernado;
    }

    public void setGobernado(int gobernado) {
        this.gobernado = gobernado;
    }

    public String getEvidencia1() {
        return evidencia1;
    }

    public void setEvidencia1(String evidencia1) {
        this.evidencia1 = evidencia1;
    }

    public String getEvidencia2() {
        return evidencia2;
    }

    public void setEvidencia2(String evidencia2) {
        this.evidencia2 = evidencia2;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getTanques_de_aire() {
        return tanques_de_aire;
    }

    public void setTanques_de_aire(int tanques_de_aire) {
        this.tanques_de_aire = tanques_de_aire;
    }

    public int getChavetas_cuanto() {
        return chavetas_cuanto;
    }

    public void setChavetas_cuanto(int chavetas_cuanto) {
        this.chavetas_cuanto = chavetas_cuanto;
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
            this.resultados.add(new Resultado(false,"Luces Galibo", "Luces","Ambas luces funcionan", "Izquierda fundida",this.luces_galibo));
        } else if (this.luces_galibo == 2) {
            this.resultados.add(new Resultado(false,"Luces Galibo","Luces", "Ambas luces funcionan","Derecha fundida",this.luces_galibo));
        } else if (this.luces_galibo == 3) {
            this.resultados.add(new Resultado(false,"Luces Galibo","Luces", "Ambas luces funcionan","Ambas fundidas",this.luces_galibo));
        }else{
            this.resultados.add(new Resultado(true,"Luces Galibo","Luces", "Ambas luces funcionan","Aprobado",this.luces_galibo));
        }

        if(this.luces_altas == 1){
            this.resultados.add(new Resultado(false,"Luces Altas","Luces", "Ambas luces funcionan","Izquierda fundida",this.luces_altas));
        } else if (this.luces_altas == 2) {
            this.resultados.add(new Resultado(false,"Luces Altas","Luces", "Ambas luces funcionan","Derecha fundida",this.luces_altas));
        } else if (this.luces_altas == 3) {
            this.resultados.add(new Resultado(false,"Luces Altas","Luces", "Ambas luces funcionan","Ambas fundidas",this.luces_altas));
        }else{
            this.resultados.add(new Resultado(true,"Luces Altas","Luces", "Ambas luces funcionan","Aprobado",this.luces_altas));
        }

        if(this.luces_bajas == 1){
            this.resultados.add(new Resultado(false,"Luces Bajas","Luces", "Ambas luces funcionan","Izquierda fundida",this.luces_bajas));
        } else if (this.luces_bajas == 2) {
            this.resultados.add(new Resultado(false,"Luces Bajas","Luces", "Ambas luces funcionan","Derecha fundida",this.luces_bajas));
        } else if (this.luces_bajas == 3) {
            this.resultados.add(new Resultado(false,"Luces Bajas","Luces", "Ambas luces funcionan","Ambas fundidas",this.luces_bajas));
        }else{
            this.resultados.add(new Resultado(true,"Luces Bajas","Luces", "Ambas luces funcionan","Aprobado",this.luces_bajas));
        }

        /*
        direccionales:
            1 = izq fundida
            2 = derecha fundida
            3 = ambas fundidas
            4 = aprobadas
        */
        if(this.luces_direccionales_delanteras == 1){
            this.resultados.add(new Resultado(false,"Luces Direccionales Delanteras","Luces", "Ambas luces funcionan","Izquierda fundida",this.luces_direccionales_delanteras));
        } else if (this.luces_direccionales_delanteras == 2) {
            this.resultados.add(new Resultado(false,"Luces Direccionales Delanteras","Luces", "Ambas luces funcionan","Derecha fundida",this.luces_direccionales_delanteras));
        } else if (this.luces_direccionales_delanteras == 3) {
            this.resultados.add(new Resultado(false,"Luces Direccionales Delanteras","Luces", "Ambas luces funcionan","Ambas fundidas",this.luces_direccionales_delanteras));
        }else{
            this.resultados.add(new Resultado(true,"Luces Direccionales Delanteras","Luces", "Ambas luces funcionan","Aprobado",this.luces_direccionales_delanteras));
        }

        if(this.luces_direccionales_traseras == 1){
            this.resultados.add(new Resultado(false,"Luces Direccionales Traseras","Luces", "Ambas luces funcionan","Izquierda fundida",this.luces_direccionales_traseras));
        } else if (this.luces_direccionales_traseras == 2) {
            this.resultados.add(new Resultado(false,"Luces Direccionales Traseras","Luces", "Ambas luces funcionan","Derecha fundida",this.luces_direccionales_traseras));
        } else if (this.luces_direccionales_traseras == 3) {
            this.resultados.add(new Resultado(false,"Luces Direccionales Traseras","Luces", "Ambas luces funcionan","Ambas fundidas",this.luces_direccionales_traseras));
        }else{
            this.resultados.add(new Resultado(true,"Luces Direccionales Traseras","Luces", "Ambas luces funcionan","Aprobado",this.luces_direccionales_traseras));
        }

        /*
        demarcadoras:
            1 = izq fundida
            2 = derecha fundida
            3 = ambas fundidas
            4 = aprobadas
        */
        if(this.luces_demarcadoras_delanteras == 1){
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Delanteras","Luces", "Ambas luces funcionan","Izquierda fundida",this.luces_demarcadoras_delanteras));
        } else if (this.luces_demarcadoras_delanteras == 2) {
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Delanteras","Luces", "Ambas luces funcionan","Derecha fundida",this.luces_demarcadoras_delanteras));
        } else if (this.luces_demarcadoras_delanteras == 3) {
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Delanteras","Luces", "Ambas luces funcionan","Ambas fundidas",this.luces_demarcadoras_delanteras));
        }else{
            this.resultados.add(new Resultado(true,"Luces Demarcadoras Delanteras","Luces", "Ambas luces funcionan","Aprobado",this.luces_demarcadoras_delanteras));
        }

        if(this.luces_demarcadoras_traseras == 1){
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Traseras","Luces", "Ambas luces funcionan","Izquierda fundida",this.luces_demarcadoras_traseras));
        } else if (this.luces_demarcadoras_traseras == 2) {
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Traseras","Luces", "Ambas luces funcionan","Derecha fundida",this.luces_demarcadoras_traseras));
        } else if (this.luces_demarcadoras_traseras == 3) {
            this.resultados.add(new Resultado(false,"Luces Demarcadoras Traseras","Luces", "Ambas luces funcionan","Ambas fundidas",this.luces_demarcadoras_traseras));
        }else{
            this.resultados.add(new Resultado(true,"Luces Demarcadoras Traseras","Luces", "Ambas luces funcionan","Aprobado",this.luces_demarcadoras_traseras));
        }

        /*
        indicadoras:
            1 = 1 fundida
            2 = 2 fundida
            3 = 3 fundidas
            4 = aprobadas
        */
        if(this.luces_indicadoras == 1){
            this.resultados.add(new Resultado(false,"Luces Indicadoras","Luces", "Todas las luces funcionan","1 fundida",this.luces_indicadoras));
        } else if (this.luces_indicadoras == 2) {
            this.resultados.add(new Resultado(false,"Luces Indicadoras","Luces", "Todas las luces funcionan","2 fundida",this.luces_indicadoras));
        } else if (this.luces_indicadoras == 3) {
            this.resultados.add(new Resultado(false,"Luces Indicadoras","Luces", "Todas las luces funcionan","3 fundidas",this.luces_indicadoras));
        }else{
            this.resultados.add(new Resultado(true,"Luces Indicadoras","Luces", "Todas las luces funcionan","Aprobadas",this.luces_indicadoras));
        }

        //Direccionales
        if(this.luces_direccionales_delanteras == 1){
            this.resultados.add(new Resultado(false,"Luces Direccionales Delanteras","Luces", "Ambas luces funcionan","Izquierda fundida",this.luces_direccionales_delanteras));
        } else if (this.luces_direccionales_delanteras == 2) {
            this.resultados.add(new Resultado(false,"Luces Direccionales Delanteras","Luces", "Ambas luces funcionan","Derecha fundida",this.luces_direccionales_delanteras));
        } else if (this.luces_direccionales_delanteras == 3) {
            this.resultados.add(new Resultado(false,"Luces Direccionales Delanteras","Luces", "Ambas luces funcionan","Ambas fundidas",this.luces_direccionales_delanteras));
        }else{
            this.resultados.add(new Resultado(true,"Luces Direccionales Delanteras","Luces", "Ambas luces funcionan","Aprobadas",this.luces_direccionales_delanteras));
        }
        if(this.luces_direccionales_traseras == 1){
            this.resultados.add(new Resultado(false,"Luces Direccionales Traseras","Luces", "Ambas luces funcionan","Izquierda fundida",this.luces_direccionales_traseras));
        } else if (this.luces_direccionales_traseras == 2) {
            this.resultados.add(new Resultado(false,"Luces Direccionales Traseras","Luces", "Ambas luces funcionan","Derecha fundida",this.luces_direccionales_traseras));
        } else if (this.luces_direccionales_traseras == 3) {
            this.resultados.add(new Resultado(false,"Luces Direccionales Traseras","Luces", "Ambas luces funcionan","Ambas fundidas",this.luces_direccionales_traseras));
        }else{
            this.resultados.add(new Resultado(true,"Luces Direccionales Traseras","Luces", "Ambas luces funcionan","Aprobadas",this.luces_direccionales_traseras));
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
            this.resultados.add(new Resultado(false,"Rines Delanteros","Llantas", "Rines en buen estado","Derecho roto o soldado",this.llantas_rines_delanteros));
        } else if (this.llantas_rines_delanteros == 2) {
            this.resultados.add(new Resultado(false,"Rines Delanteros","Llantas", "Rines en buen estado","Izquierdo roto o soldado",this.llantas_rines_delanteros));
        } else if (this.llantas_rines_delanteros == 3) {
            this.resultados.add(new Resultado(false,"Rines Delanteros","Llantas", "Rines en buen estado","Ambos rotos o soldados",this.llantas_rines_delanteros));
        }else{
            this.resultados.add(new Resultado(true,"Rines Delanteros","Llantas", "Rines en buen estado","Aprobados",this.llantas_rines_delanteros));
        }

        if(this.llantas_rines_traseros == 1){
            this.resultados.add(new Resultado(false,"Rines Traseros","Llantas", "Rines en buen estado","Derecho roto o soldado",this.llantas_rines_traseros));
        } else if (this.llantas_rines_traseros == 2) {
            this.resultados.add(new Resultado(false,"Rines Traseros","Llantas", "Rines en buen estado","Izquierdo roto o soldado",this.llantas_rines_traseros));
        } else if (this.llantas_rines_traseros == 3) {
            this.resultados.add(new Resultado(false,"Rines Traseros","Llantas", "Rines en buen estado","Ambos rotos o soldados",this.llantas_rines_traseros));
        }else{
            this.resultados.add(new Resultado(true,"Rines Traseros","Llantas", "Rines en buen estado","Aprobados",this.llantas_rines_traseros));
        }

        /*
        masas:
            1 = Derecha con fuga
            2 = Izquierda con fuga
            3 = Ambas con fuga
            4 = aprobadas
        */
        if(this.llantas_masas_delanteras == 1){
            this.resultados.add(new Resultado(false,"Masas Delanteras","Llantas", "Masas en buen estado","Derecha con fuga",this.llantas_masas_delanteras));
        } else if (this.llantas_masas_delanteras == 2) {
            this.resultados.add(new Resultado(false,"Masas Delanteras","Llantas", "Masas en buen estado","Izquierda con fuga",this.llantas_masas_delanteras));
        } else if (this.llantas_masas_delanteras == 3) {
            this.resultados.add(new Resultado(false,"Masas Delanteras","Llantas", "Masas en buen estado","Ambas con fuga",this.llantas_masas_delanteras));
        }else{
            this.resultados.add(new Resultado(true,"Masas Delanteras","Llantas", "Masas en buen estado","Aprobadas",this.llantas_masas_delanteras));
        }

        if(this.llantas_masas_traseras == 1){
            this.resultados.add(new Resultado(false,"Masas Traseras","Llantas", "Masas en buen estado","Derecha con fuga",this.llantas_masas_traseras));
        } else if (this.llantas_masas_traseras == 2) {
            this.resultados.add(new Resultado(false,"Masas Traseras","Llantas", "Masas en buen estado","Izquierda con fuga",this.llantas_masas_traseras));
        } else if (this.llantas_masas_traseras == 3) {
            this.resultados.add(new Resultado(false,"Masas Traseras","Llantas", "Masas en buen estado","Ambas con fuga",this.llantas_masas_traseras));
        }else{
            this.resultados.add(new Resultado(true,"Masas Traseras","Llantas", "Masas en buen estado","Aprobadas",this.llantas_masas_traseras));
        }

        /*
        presion es en PSI:
            minimo 70
        */
        if(this.llantas_presion_delantera_izquierda >= 80){
            this.resultados.add(new Resultado(true,"Presión Delantera Izquierda","Llantas", "La presión es igual o mayor a 80 PSI", "Obtuvo: " + this.llantas_presion_delantera_izquierda +" PSI",this.llantas_presion_delantera_izquierda));
        }else{
            this.resultados.add(new Resultado(false,"Presión Delantera Izquierda","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_delantera_izquierda +" PSI",this.llantas_presion_delantera_izquierda));
        }
        if(this.llantas_presion_delantera_derecha >= 80){
            this.resultados.add(new Resultado(true,"Presión Delantera Derecha","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_delantera_derecha +" PSI",this.llantas_presion_delantera_derecha));
        }else{
            this.resultados.add(new Resultado(false,"Presión Delantera Derecha","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_delantera_derecha +" PSI",this.llantas_presion_delantera_derecha));
        }
        if(this.llantas_presion_trasera_izquierda_1 >= 80){
            this.resultados.add(new Resultado(true,"Presión Trasera Izquierda 1","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_izquierda_1 +" PSI",this.llantas_presion_trasera_izquierda_1));
        }else{
            this.resultados.add(new Resultado(false,"Presión Trasera Izquierda 1","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_izquierda_1 +" PSI",this.llantas_presion_trasera_izquierda_1));
        }
        if(this.llantas_presion_trasera_izquierda_2 >= 80){
            this.resultados.add(new Resultado(true,"Presión Trasera Izquierda 2","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_izquierda_2 +" PSI",this.llantas_presion_trasera_izquierda_2));
        }else{
            this.resultados.add(new Resultado(false,"Presión Trasera Izquierda 2","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_izquierda_2 +" PSI", this.llantas_presion_trasera_izquierda_2));
        }
        if(this.llantas_presion_trasera_derecha_1 >= 80){
            this.resultados.add(new Resultado(true,"Presión Trasera Derecha 1","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_derecha_1 +" PSI",this.llantas_presion_trasera_derecha_1));
        }else{
            this.resultados.add(new Resultado(false,"Presión Trasera Derecha 1","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_derecha_1 +" PSI",this.llantas_presion_trasera_derecha_1));
        }
        if(this.llantas_presion_trasera_derecha_2 >= 80){
            this.resultados.add(new Resultado(true,"Presión Trasera Derecha 2","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_derecha_2 +" PSI",this.llantas_presion_trasera_derecha_2));
        }else{
            this.resultados.add(new Resultado(false,"Presión Trasera Derecha 2","Llantas", "La presión es igual o mayor a 80 PSI","Obtuvo: " + this.llantas_presion_trasera_derecha_2 +" PSI",this.llantas_presion_trasera_derecha_2));
        }

        /*
        profundidad es en mm si excede las minimas
        minima delantera 3.2 mm
        minima trasera 1.6 mm
        */
        if(this.llantas_profundidad_delantera_izquierda >= 3.2){
            this.resultados.add(new Resultado(true,"Profundidad Delantera Izquierda","Llantas", "La profundidad es igual o mayor a 3.2 milímetros","Obtuvo: " + this.llantas_profundidad_delantera_izquierda + " mm",1));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Delantera Izquierda","Llantas", "La profundidad es igual o mayor a 3.2 milímetros","Obtuvo: " + this.llantas_profundidad_delantera_izquierda + " mm",1));
        }
        if(this.llantas_profundidad_delantera_derecha >= 3.2){
            this.resultados.add(new Resultado(true,"Profundidad Delantera Derecha","Llantas", "La profundidad es igual o mayor a 3.2 milímetros","Obtuvo: " + this.llantas_profundidad_delantera_derecha + " mm",1));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Delantera Derecha","Llantas", "La profundidad es igual o mayor a 3.2 milímetros","Obtuvo: " + this.llantas_profundidad_delantera_derecha + " mm",1));
        }
        if(this.llantas_profundidad_trasera_izquierda_1 >= 1.6){
            this.resultados.add(new Resultado(true,"Profundidad Trasera Izquierda 1","Llantas", "La profundidad es igual o mayor a 1.6 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_izquierda_1 + " mm",1));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Trasera Izquierda 1","Llantas", "La profundidad es igual o mayor a 1.6 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_izquierda_1 + " mm",1));
        }
        if(this.llantas_profundidad_trasera_izquierda_2 >= 1.6){
            this.resultados.add(new Resultado(true,"Profundidad Trasera Izquierda 2","Llantas", "La profundidad es igual o mayor a 1.6 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_izquierda_2 + " mm",1));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Trasera Izquierda 2","Llantas", "La profundidad es igual o mayor a 1.6 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_izquierda_2 + " mm",1));
        }
        if(this.llantas_profundidad_trasera_derecha_1 >= 1.6){
            this.resultados.add(new Resultado(true,"Profundidad Trasera Derecha 1","Llantas", "La profundidad es igual o mayor a 1.6 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_derecha_1 + " mm",1));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Trasera Derecha 1","Llantas", "La profundidad es igual o mayor a 1.6 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_derecha_1 + " mm",1));
        }
        if(this.llantas_profundidad_trasera_derecha_2 >= 1.6){
            this.resultados.add(new Resultado(true,"Profundidad Trasera Derecha 2","Llantas", "La profundidad es igual o mayor a 1.6 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_derecha_2 + " mm",1));
        }else{
            this.resultados.add(new Resultado(false,"Profundidad Trasera Derecha 2","Llantas", "La profundidad es igual o mayor a 1.6 milímetros","Obtuvo: " + this.llantas_profundidad_trasera_derecha_2 + " mm",1));
        }

        /*
        Birlos y Tuercas,
        si variable principal es = 1 significa Rotos o faltantes
        en ese caso se pone el numero de rotos o faltantes, por defecto es 0
        en caso de que sea 2 significa aprobados
        */
        if(this.llantas_birlos_delantera_izquierda == 2){
            this.resultados.add(new Resultado(true,"Birlos Delantera Izquierda","Llantas", "Al menos 8 birlos en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " birlos rotos o faltantes",this.llantas_birlos_delantera_izquierda));
        }else{
            if(this.llantas_birlos_delantera_izquierda_num > 2){
                this.resultados.add(new Resultado(false,"Birlos Delantera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " birlos rotos o faltantes",this.llantas_birlos_delantera_izquierda_num));
            }else {
                this.resultados.add(new Resultado(true,"Birlos Delantera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " birlos rotos o faltantes",this.llantas_birlos_delantera_izquierda_num));
            }
        }
        if(this.llantas_birlos_delantera_derecha == 2){
            this.resultados.add(new Resultado(true,"Birlos Delantera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " birlos rotos o faltantes",this.llantas_birlos_delantera_derecha));
        }else{
            if(this.llantas_birlos_delantera_derecha_num > 2){
                this.resultados.add(new Resultado(false,"Birlos Delantera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " birlos rotos o faltantes",this.llantas_birlos_delantera_derecha_num));
            }else {
                this.resultados.add(new Resultado(true,"Birlos Delantera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " birlos rotos o faltantes",this.llantas_birlos_delantera_derecha_num));
            }
        }

        if(this.llantas_birlos_trasera_izquierda == 2){
            this.resultados.add(new Resultado(true,"Birlos Trasera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " birlos rotos o faltantes", this.llantas_birlos_trasera_izquierda));
        }else{
            if(this.llantas_birlos_trasera_izquierda_num > 2){
                this.resultados.add(new Resultado(false,"Birlos Trasera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " birlos rotos o faltantes",this.llantas_birlos_trasera_izquierda_num));
            }else {
                this.resultados.add(new Resultado(true,"Birlos Trasera Izquierda","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " birlos rotos o faltantes", this.llantas_birlos_trasera_izquierda_num));
            }
        }
        if(this.llantas_birlos_trasera_derecha == 2){
            this.resultados.add(new Resultado(true,"Birlos Trasera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " birlos rotos o faltantes", this.llantas_birlos_trasera_derecha));
        }else{
            if(this.llantas_birlos_trasera_derecha_num > 2){
                this.resultados.add(new Resultado(false,"Birlos Trasera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " birlos rotos o faltantes",this.llantas_birlos_trasera_derecha_num));
            }else {
                this.resultados.add(new Resultado(true,"Birlos Trasera Derecha","Llantas", "Al menos 8 birlos en buen estado","Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " birlos rotos o faltantes", this.llantas_birlos_trasera_derecha_num));
            }
        }

        //Tuercas
        if(this.llantas_tuercas_delantera_izquierda == 2){
            this.resultados.add(new Resultado(true,"Tuercas Delantera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " tuercas rotas o faltantes",this.llantas_tuercas_delantera_izquierda));
        }else{
            if(this.llantas_tuercas_delantera_izquierda_num > 2){
                this.resultados.add(new Resultado(false,"Tuercas Delantera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " tuercas rotas o faltantes",this.llantas_birlos_delantera_izquierda_num));
            }else {
                this.resultados.add(new Resultado(true,"Tuercas Delantera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_izquierda_num + " tuercas rotas o faltantes",this.llantas_birlos_delantera_izquierda_num));
            }
        }
        if(this.llantas_tuercas_delantera_derecha == 2){
            this.resultados.add(new Resultado(true,"Tuercas Delantera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " tuercas rotas o faltantes",this.llantas_tuercas_delantera_derecha));
        }else{
            if(this.llantas_tuercas_delantera_derecha_num > 2){
                this.resultados.add(new Resultado(false,"Tuercas Delantera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " tuercas rotas o faltantes",this.llantas_birlos_delantera_derecha_num));
            }else {
                this.resultados.add(new Resultado(true,"Tuercas Delantera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_delantera_derecha_num + " tuercas rotas o faltantes",this.llantas_birlos_delantera_derecha_num));
            }
        }

        if(this.llantas_tuercas_trasera_izquierda == 2){
            this.resultados.add(new Resultado(true,"Tuercas Trasera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " tuercas rotas o faltantes",this.llantas_tuercas_trasera_izquierda));
        }else{
            if(this.llantas_tuercas_trasera_izquierda_num > 2){
                this.resultados.add(new Resultado(false,"Tuercas Trasera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " tuercas rotas o faltantes",this.llantas_tuercas_trasera_izquierda_num));
            }else {
                this.resultados.add(new Resultado(true,"Tuercas Trasera Izquierda","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_izquierda_num + " tuercas rotas o faltantes",this.llantas_tuercas_trasera_izquierda_num));
            }
        }
        if(this.llantas_tuercas_trasera_derecha == 2){
            this.resultados.add(new Resultado(true,"Tuercas Trasera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " tuercas rotas o faltantes",this.llantas_tuercas_trasera_derecha));
        }else{
            if(this.llantas_tuercas_trasera_derecha_num > 2){
                this.resultados.add(new Resultado(false,"Tuercas Trasera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " tuercas rotas o faltantes",this.llantas_tuercas_trasera_derecha_num));
            }else {
                this.resultados.add(new Resultado(true,"Tuercas Trasera Derecha","Llantas", "Al menos 8 tuercas en buen estado", "Obtuvo: " + this.llantas_birlos_trasera_derecha_num + " tuercas rotas o faltantes",this.llantas_tuercas_trasera_derecha_num));
            }
        }

        //Otros
        /*
        Caja de dirección y deposito de aceite:
            1 = Fuga de aceite
            2 = Aprobado
        */
        if(this.caja_direccion == 1){
            this.resultados.add(new Resultado(false,"Caja de Dirección", "Otros", "Caja en buen estado", "Fuga de aceite",this.caja_direccion));
        }else{
            this.resultados.add(new Resultado(true,"Caja de Dirección","Otros", "Caja en buen estado","Aprobada",this.caja_direccion));
        }
        if(this.deposito_aceite == 1){
            this.resultados.add(new Resultado(false,"Deposito de Aceite", "Otros", "Deposito en buen estado","Fuga de aceite",this.deposito_aceite));
        }else{
            this.resultados.add(new Resultado(true,"Deposito de Aceite","Otros", "Deposito en buen estado","Aprobado",this.deposito_aceite));
        }

        /*
        Parabrisas:
            1 = Aprobado
            2 = Estrellado
        */
        if(this.parabrisas == 2){
            this.resultados.add(new Resultado(false,"Parabrisas", "Otros", "Parabrisas en buen estado","Estrellado",this.parabrisas));
        }else{
            this.resultados.add(new Resultado(true,"Parabrisas","Otros", "Parabrisas en buen estado","Aprobado",this.parabrisas));
        }


        /*
        Limpia Parabrisas:
            1 = Aprobado
            2 = No funciona
            3 = Falta 1 pluma
            4 = Faltan 2 plumas
        */
        if(this.limpiaparabrisas == 4){
            this.resultados.add(new Resultado(false,"Limpia Parabrisas", "Otros", "Limpia parabrisas en buen estado","Faltan 2 plumas",this.limpiaparabrisas));
        } else if (this.limpiaparabrisas == 3) {
            this.resultados.add(new Resultado(false,"Limpia Parabrisas", "Otros", "Limpia parabrisas en buen estado","Falta 1 pluma",this.limpiaparabrisas));
        } else if (this.limpiaparabrisas == 2) {
            this.resultados.add(new Resultado(false,"Limpia Parabrisas", "Otros", "Limpia parabrisas en buen estado","No funciona",this.limpiaparabrisas));
        }else{
            this.resultados.add(new Resultado(true,"Limpia Parabrisas","Otros", "Limpia parabrisas en buen estado","Aprobado",this.limpiaparabrisas));
        }

        /*
        Huelgo:
            1 = Aprobado
            2 = cuanto
        */
        if(this.huelgo == 1){
            this.resultados.add(new Resultado(true,"Huelgo","Otros", "Huelgo en buen estado","Aprobado",this.huelgo));
        }else{
            this.resultados.add(new Resultado(false,"Huelgo","Otros", "Huelgo en buen estado","Obtuvo: " + this.huelgo_cuanto, this.huelgo));
        }

         /*
        Humo:
            1 = No Aprobado
            2 = Aprobado
        */
        if(this.humo == 1){
            this.resultados.add(new Resultado(false,"Humo","Otros", "Humo en buen estado","No Aprobado",this.humo));
        }else{
            this.resultados.add(new Resultado(true,"Humo","Otros", "Humo en buen estado","Aprobado",this.humo));
        }

        /*
        Gobernado:
            1 = No Aprobado
            2 = Aprobado
        */
        if(this.gobernado == 1){
            this.resultados.add(new Resultado(false,"Governado","Otros", "Governado en buen estado","No Aprobado",this.gobernado));
        }else{
            this.resultados.add(new Resultado(true,"Governado","Otros", "Governado en buen estado","Aprobado", this.gobernado));
        }

        /*
        Escape:
            1 = Aprobado
            2 = Faltante
            3 = Roto
        */
        if(this.escape == 3){
            this.resultados.add(new Resultado(false,"Escape", "Otros", "Escape en buen estado","Roto",this.escape));
        } else if (this.limpiaparabrisas == 2) {
            this.resultados.add(new Resultado(false,"Escape", "Otros", "Escape en buen estado","Faltante",this.escape));
        } else{
            this.resultados.add(new Resultado(true,"Escape","Otros", "Escape en buen estado","Aprobado",this.escape));
        }

        /*
        Tiempo de carga
        psi y tiempo
         */
        //psi debe ser entre 70 y 120 psi
        if(this.tiempo_de_carga_psi < 70 || this.tiempo_de_carga_psi > 120) {
            //Además no puede superar los 2 minutos de recarga
            if(this.tiempo_de_carga_tiempo > 2.0){
                this.resultados.add(new Resultado(false,"Tiempo de carga", "Otros",
                        "Entre 70 y 120 PSI y tiempo de carga máximo de 2 minutos",
                        "PSI: " + this.tiempo_de_carga_psi + "\n Tiempo de carga: " + this.tiempo_de_carga_tiempo + " minutos", 1));
            }
        }else{
            if(this.tiempo_de_carga_tiempo > 2.0){
                this.resultados.add(new Resultado(false,"Tiempo de carga", "Otros",
                        "Entre 70 y 120 PSI y tiempo de carga máximo de 2 minutos",
                        "PSI: " + this.tiempo_de_carga_psi + "\n Tiempo de carga: " + this.tiempo_de_carga_tiempo + " minutos", 1));
            }else{
                this.resultados.add(new Resultado(true,"Tiempo de carga", "Otros",
                        "Entre 70 y 120 PSI y tiempo de carga máximo de 2 minutos",
                        "PSI y tiempo de carga en minutos correctos", 1));
            }
        }


        /*
        tanque_de_aire:
            1 = No Aprobado
            2 = Aprobado
        */
        if(this.tanques_de_aire == 1){
            this.resultados.add(new Resultado(false,"Tanques de aire","Otros", "Tanque de aire en buen estado","No Aprobado (Con agua)",this.tanques_de_aire));
        }else{
            this.resultados.add(new Resultado(true,"Tanques de aire","Otros", "Tanque de aire en buen estado","Aprobado",this.tanques_de_aire));
        }

        /*
        compresor:
            1 = No corta
            2 = No Aprobado
            3 = Aprobado
        */
        if(this.compresor == 1){
            this.resultados.add(new Resultado(false,"Compresor","Otros", "Compresor en buen estado","No corta (No aprobado)",this.compresor));
        }else if(this.compresor == 2){
            this.resultados.add(new Resultado(false,"Compresor","Otros", "Compresor en buen estado","No Aprobado",this.compresor));
        } else {
            this.resultados.add(new Resultado(true,"Compresor","Otros", "Compresor en buen estado","Aprobado",this.compresor));
        }

        /*
        faros:
            1 = Flojo
            2 = Roto
            3 = Aprobado
        */
        if(this.faro_derecho == 1){
            this.resultados.add(new Resultado(false,"Faro derecho","Otros", "Faro derecho en buen estado","Flojo (No aprobado)",this.faro_derecho));
        }else if(this.faro_derecho == 2){
            this.resultados.add(new Resultado(false,"Faro derecho","Otros", "Faro derecho en buen estado","Roto (No Aprobado)",this.faro_derecho));
        } else {
            this.resultados.add(new Resultado(true,"Faro derecho","Otros", "Faro derecho en buen estado","Aprobado", this.faro_derecho));
        }
        if(this.faro_izquierdo == 1){
            this.resultados.add(new Resultado(false,"Faro izquierdo","Otros", "Faro izquierdo en buen estado","Flojo (No aprobado)",this.faro_izquierdo));
        }else if(this.faro_izquierdo == 2){
            this.resultados.add(new Resultado(false,"Faro izquierdo","Otros", "Faro izquierdo en buen estado","Roto (No Aprobado)",this.faro_izquierdo));
        } else {
            this.resultados.add(new Resultado(true,"Faro izquierdo","Otros", "Faro izquierdo en buen estado","Aprobado",this.faro_izquierdo));
        }

        /*
        brazo pitman:
            1 = Golpeado No Aprobado
            2 = Aprobado
        */
        if(this.brazo_pitman == 1){
            this.resultados.add(new Resultado(false,"Brazo Pitman","Otros", "Brazo Pitman en buen estado","Golpeado (No aprobado)", this.brazo_pitman));
        } else {
            this.resultados.add(new Resultado(true,"Brazo Pitman","Otros", "Brazo Pitman en buen estado","Aprobado",this.brazo_pitman));
        }

        /*
        manijas:
            1 = 1 rota
            2 = 2 rotas
            3 = Aprobadas
        */
        if(this.manijas_de_puertas == 1){
            this.resultados.add(new Resultado(false,"Manijas de puertas","Otros", "Manijas de puertas en buen estado","1 rota (No aprobado)", this.manijas_de_puertas));
        } else if(this.manijas_de_puertas == 2) {
            this.resultados.add(new Resultado(false,"Manijas de puertas","Otros", "Manijas de puertas en buen estado","2 rotas (No aprobado)",this.manijas_de_puertas));
        } else {
            this.resultados.add(new Resultado(true,"Manijas de puertas","Otros", "Manijas de puertas en buen estado","Aprobadas",this.manijas_de_puertas));
        }

        /*
        Chavetas:
            1 = Aprobadas
            2 = cuanto
        */
        if(this.chavetas == 1){
            this.resultados.add(new Resultado(true,"Chavetas","Otros", "Chavetas en buen estado","Aprobadas",this.chavetas));
        }else{
            this.resultados.add(new Resultado(false,"Chavetas","Otros", "Chavetas en buen estado","Faltan: " + this.chavetas_cuanto + " chavetas (No aprobado)",this.chavetas));
        }


        this.resultados = resultados;
        return resultados;
    }
}
