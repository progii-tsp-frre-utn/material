package main.java.com.frre.tsp.estructuralineales;

/**
 * Clase Lista enlazada circular.
 */
public class ListaCircular {

    private Nodo primero;
    private Nodo ultimo;
    public int tamaño;

    public void Lista() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor) {

        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
            this.ultimo = nuevo;
            this.ultimo.siguiente = this.primero;
        } else {
            // usa los puntores a "primero" y "ultimo"
            this.ultimo.siguiente = nuevo;
            nuevo.siguiente = this.primero;
            ultimo = nuevo;
        }
        this.tamaño++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux = null;

            this.tamaño--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = this.primero;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}
