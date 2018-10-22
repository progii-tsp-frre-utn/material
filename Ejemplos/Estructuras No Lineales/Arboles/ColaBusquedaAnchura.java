package main.java.com.frre.tsp.estructurasnolineales.Arboles;

//// TAD Cola para Recorrido en Anchura para Árbol Binario
public class ColaBusquedaAnchura {

    private NodoColaRecorridoAnchura primero;
    private NodoColaRecorridoAnchura ultimo;
    private int tamaño;

    public ColaBusquedaAnchura() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    //// enqueue
    public void encolar(NodoABinario valor) {

        NodoColaRecorridoAnchura nuevo = new NodoColaRecorridoAnchura(valor);

        if (vacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        }
        else {
            this.ultimo.siguiente = nuevo;
            this.ultimo = nuevo;
        }

        this.tamaño++;
    }

    //// dequeue
    public NodoABinario desencolar() {

        if (vacia()) {
            return null;
        }
        else {
            //NodoCola aux = new NodoCola(this.primero.valor);

            NodoABinario aux = this.primero.valor;

            this.primero = this.primero.siguiente;
            this.tamaño--;

            return aux;
        }
    }
}
