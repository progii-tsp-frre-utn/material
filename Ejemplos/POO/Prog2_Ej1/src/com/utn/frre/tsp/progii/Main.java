package com.utn.frre.tsp.progii;



public class Main {

    public static void main(String[] args) {

        // Ejemplo de Fracciones
        Fraccion f1 = new Fraccion(3, 4);
        Fraccion f2 = new Fraccion(5, 20);
        Fraccion f3 = f1.sumar(f2);

        System.out.println(f3.getDividendo() + "/" + f3.getDivisor());

        /*
        // Ejemplo de uso de varias clases asociadas
        Materia ma = new Materia(60);
        ma.getProfesor().setNombre("facundo");
        ma.getProfesor().setApellido("matoff");

        System.out.println(ma.getProfesor().nombreCompleto());
        */

        //ma.getAlumnos()[0].setNombre("pepe");

        // Ejemplo de instanciacion de la clase Account
        // con un constructor propio, el cual recibe un valor.
        /*
        Account a1 = new Account(1000);
        Account a2 = new Account(1500);
        System.out.println(a1.getBalance());
        a1.acreditar(2000);

        System.out.println(a1.getBalance());
        System.out.println(a1.getBalanceDolar());

        a1.debitar(500);
        System.out.println(a1.getBalance());

        a2.debitar(200);
        System.out.println(a2.getBalance());
*/



    }
}
