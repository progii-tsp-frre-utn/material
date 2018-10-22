package main.java.com.frre.tsp.estructurasnolineales.Arboles;

//// Nodo para TAD Cola para Recorrido en Anchura de Árbol Binario.
public class NodoColaRecorridoAnchura {

    //// define un atributo para apuntar recursivamente a otro nodo de la cola.
    public NodoColaRecorridoAnchura siguiente;

    //// define un atributo para almacenar un valor del tipo Nodo Arbol Binario.
    public NodoABinario valor;

    public NodoColaRecorridoAnchura(NodoABinario valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}
