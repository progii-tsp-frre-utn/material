package com.utn.frre.tsp.progii;
public class Account {

    private int nroCuenta = 1000;
    private double balance = 0.0;
    private double balanceDolar = 0.0;


    public Account(double pesos) {
        this.balance = pesos;
        conectarInternet();
        this.balanceDolar
                = obtenerValorDolar(pesos);
        obtenerValorTasaAnual();
    }

    public void setNroCuenta(int n) {
        nroCuenta = n;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getBalanceDolar() {
        return this.balanceDolar;
    }

    public void acreditar(double monto) {
        if (monto > 0) {
            balance += monto;
            conectarInternet();
            balanceDolar = obtenerValorDolar(balance);
        }
    }

    public void debitar(double monto) {
        if (monto > 0 && monto <= balance) {
            balance -= monto;
        }
    }

    private void conectarInternet() {
    }

    private double obtenerValorDolar(double pesos){
        return pesos * 30.34;
    }

    private void obtenerValorTasaAnual(){
    }








}
