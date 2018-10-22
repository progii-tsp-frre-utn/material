package main.java.com.frre.tsp.estructurasnolineales.Arboles;

/**
 * Nodo Arbol Binario
 */
public class NodoABinario {

    public String valor;

    public NodoABinario izq;
    public NodoABinario der;

    public NodoABinario(String valor) {
        this.valor = valor;
        this.izq = null;
        this.der = null;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
