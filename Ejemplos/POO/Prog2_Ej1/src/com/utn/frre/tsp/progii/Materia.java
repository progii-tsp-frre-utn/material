package com.utn.frre.tsp.progii;

public class Materia {

    private String nombre;
    private Profesor profesor;
    private Alumno[] alumnos;

    public Materia(int cantidadAlumnos) {
        // La clase Materia posee una asociacion con la clase Profesor
        // a traves de un atributo interno. El constructor de la clase
        // Materia crea una instancia de la clase Profesor y se la
        // asigna a su atributo interno.
        this.profesor = new Profesor();

        // La clase Materia posee un arreglo de variables de la clase Alumno
        // y inicializa una instancia del arreglo con la cantidad de alumnos
        // que recibe desde un parametro del constructor de la clase materia.
        this.alumnos = new Alumno[cantidadAlumnos];

        // El objeto arreglo no inicializa los objetos de la clase Alumno
        // que lo conforman, por lo tanto, se incluye un bucle que recorre
        // el arreglo de alumnos inicializando cada objeto del mismo.
        for (int i = 0; i < cantidadAlumnos; i++) {
            this.alumnos[i] = new Alumno();
        }
    }

    public void setProfesor(Profesor p) {
        this.profesor = p;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Alumno[] getAlumnos() {
        return this.alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
