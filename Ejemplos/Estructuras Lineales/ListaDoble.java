package main.java.com.frre.tsp.estructuralineales;

/**
 * Lista doblemente enlazada
 */
public class ListaDoble {

    private NodoDoble primero;
    private NodoDoble ultimo;
    private int tamaño;

    public ListaDoble() {
        this.primero = null;
        this.ultimo = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor) {

        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {

            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            NodoDoble aux = primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }

            // asigna primero y ultimo
            aux.siguiente = nuevo;
            nuevo.anterior = aux;
            this.ultimo = nuevo;
        }

        this.tamaño++;
    }

    public void agregarInicio(String valor){
        NodoDoble nuevo = new NodoDoble(valor);

        if(vacia()){
            this.primero=nuevo;
        } else {
            nuevo.siguiente = this.primero;
            this.primero.anterior = nuevo;
            this.primero = nuevo;
        }
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            NodoDoble aux = primero;
            NodoDoble nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces hago primero y ultimo null para indicar que la lista esta vacia.
            if (aux == this.primero) {
                this.primero = null;
                this.ultimo = null;
            } else {
                this.ultimo = nodoAnterior;
                nodoAnterior.siguiente = null;
                aux.anterior = null;
            }

            this.tamaño--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {

            NodoDoble aux = primero;

            for(int i=0;i<this.tamaño;i++){
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    public void imprimirInverso() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {

            NodoDoble aux = ultimo;

            for(int i=0;i<this.tamaño;i++){
                System.out.println(aux.valor);
                aux = aux.anterior;
            }
        }
    }
}
