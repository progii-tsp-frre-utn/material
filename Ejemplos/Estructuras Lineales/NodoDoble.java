package main.java.com.frre.tsp.estructuralineales;

/**
 * Clase Nodo doble enlazado.
 */
public class NodoDoble {

    public NodoDoble anterior;
    public NodoDoble siguiente;
    public String valor;

    public NodoDoble(String valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }

    // toString() retorna el valor del nodo.
    @Override
    public String toString() {
        return this.valor;
    }
}
