package com.utn.frre.tsp.progii;



public class Fraccion {

    private double dividendo;
    private double divisor;

    // Define un constructor que recibe 2 parametros
    public Fraccion(double dividendo, double divisor) {
        this.dividendo  = dividendo;
        this.divisor = divisor;
    }

    public double getDividendo() {
        return dividendo;
    }

    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    // se define una funcion "suma" que recibe como parametro
    // un tipo Fraccion y retorna un tipo Fraccion
    public Fraccion sumar(Fraccion f) {

        // Utiliza 2 variables para hacer la suma
        // entre el valor de la clase (this) y el valor
        // del parametro que recibe la funcion.
        double d1 = this.dividendo + f.dividendo;
        double d2 = this.divisor + f.divisor;

        // Crea un nuevo objeto del tipo Fraccion,
        // al cual se le pasan como parametros los
        // valores de la suma de 2 fracciones.
        Fraccion fResultado = new Fraccion(d1, d2);

        // Retorna el resultado de la suma
        // como el nuevo objeto
        return fResultado;
    }

}







