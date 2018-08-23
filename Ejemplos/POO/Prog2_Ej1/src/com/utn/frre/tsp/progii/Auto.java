package com.utn.frre.tsp.progii;

public class Auto {

    boolean encendido = false;
    int puertas = 0;
    int distanciaRecorrida = 0;

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void avanzar(int metros) {
        if (this.encendido == true) {
            this.distanciaRecorrida += metros;
        }
    }

    public void girarLlave() {

        this.encendido = !this.encendido;

        if (this.encendido == true) {
            this.encendido = false;
        } else {
            this.encendido = true;
        }
    }


}
