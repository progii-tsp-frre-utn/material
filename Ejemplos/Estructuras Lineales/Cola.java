package main.java.com.frre.tsp.estructuralineales;

/**
 * Clase cola.
 */
public class Cola {

    private Nodo primero;
    private Nodo ultimo;
    private int tamaño;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    // enqueue
    public void encolar(String valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {

            this.ultimo.siguiente = nuevo;
            this.ultimo = nuevo;
        }
        this.tamaño++;
    }

    // dequeue
    public String desencolar() {

        if (vacia()) {
            return "Cola vacía";
        } else {

            String aux = this.primero.valor;
            this.primero = this.primero.siguiente;
            this.tamaño--;

            return aux;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Cola vacia");
        } else {

            Nodo aux = this.primero;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}
















