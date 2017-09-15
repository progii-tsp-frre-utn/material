package main.java.com.frre.tsp.estructuralineales;

/**
 * Clase Nodo.
 */
public class Nodo {

    public String valor;
    public Nodo siguiente;

    public Nodo(String valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    // toString() retorna el valor del nodo.
    @Override
    public String toString() {
        return this.valor;
    }
}
