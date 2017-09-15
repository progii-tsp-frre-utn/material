package main.java.com.frre.tsp.estructuralineales;

/**
 *  Clase pila.
 */
public class Pila {

    private Nodo ultimo;
    private int tamaño;

    public Pila() {
        this.tamaño = 0;
        this.ultimo = null;
    }

    public boolean vacia() {
        return this.ultimo == null;
    }

    // push
    public void apilar(String valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {

            this.ultimo = nuevo;

        } else {

            nuevo.siguiente = this.ultimo;
            this.ultimo = nuevo;
        }

        this.tamaño++;
    }

    // pop
    public String desapilar() {
        if (vacia()) {
            return "Pila vacia";
        } else {

            //String aux = this.ultimo.valor;
            Nodo aux = new Nodo(this.ultimo.valor);

            this.ultimo = this.ultimo.siguiente;
            this.tamaño--;

            return aux.valor;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Pila vacia");
        } else {
            Nodo aux = this.ultimo;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}







