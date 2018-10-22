package main.java.com.frre.tsp.estructurasnolineales.Arboles;

public class Main {

    public static void main(String[] args) {

        // Carga un arbol en memoria y lo recorre en Profundidad
        System.out.println("---- Recorrido en Profundidad: In Orden ----");
        recorrerInOrden();

        // Carga un arbol en memoria y lo recorre en Anchura
        System.out.println("---- Recorrido en Anchura ----");
        recorrerEnAnchura();

        // Carga un arbol con metodo agregar, inserta un nuevo nodo y elimina distintos nodos.
        cargaryeliminar();

    }

    private static void recorrerInOrden() {
        /* Se crea el siguiente arbol en memoria
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        NodoABinario nodo50 = new NodoABinario("50");
        NodoABinario nodo30 = new NodoABinario("30");
        NodoABinario nodo70 = new NodoABinario("70");
        NodoABinario nodo20 = new NodoABinario("20");
        NodoABinario nodo40 = new NodoABinario("40");
        NodoABinario nodo60 = new NodoABinario("60");
        NodoABinario nodo80 = new NodoABinario("80");

        nodo50.izq = nodo30;
        nodo50.der = nodo70;

        nodo30.izq = nodo20;
        nodo30.der = nodo40;

        nodo70.izq = nodo60;
        nodo70.der = nodo80;

        ArbolBinario ab = new ArbolBinario();
        ab.construir(nodo50);

        ab.imprimirInOrder();
    }

    private static void recorrerEnAnchura() {

        /* Se crea el siguiente arbol en memoria
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        NodoABinario nodo50 = new NodoABinario("50");
        NodoABinario nodo30 = new NodoABinario("30");
        NodoABinario nodo70 = new NodoABinario("70");
        NodoABinario nodo20 = new NodoABinario("20");
        NodoABinario nodo40 = new NodoABinario("40");
        NodoABinario nodo60 = new NodoABinario("60");
        NodoABinario nodo80 = new NodoABinario("80");

        nodo50.izq = nodo30;
        nodo50.der = nodo70;

        nodo30.izq = nodo20;
        nodo30.der = nodo40;

        nodo70.izq = nodo60;
        nodo70.der = nodo80;

        ArbolBinario ab = new ArbolBinario();
        ab.construir(nodo50);

        ab.imprimirEnAnchura();
    }

    private static void cargaryeliminar() {
        /* Se crea el siguiente arbol
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        ArbolBinario arbol = new ArbolBinario();

        arbol.agregar("50");
        arbol.agregar("30");
        arbol.agregar("20");
        arbol.agregar("40");
        arbol.agregar("70");
        arbol.agregar("60");
        arbol.agregar("80");

        arbol.imprimirInOrder();

        /* Se agrega el nodo '35'
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80
           /
         35            */

        System.out.println("------ Agrega nodo nuevo '35' ------");
        arbol.agregar("35");
        arbol.imprimirInOrder();

        /* Se elimina el nodo hoja '60'
              50
           /     \
          30      70
         /  \       \
       20   40      80
           /
         35            */

        System.out.println("------ Elimina nodo hoja '60' ------");
        arbol.eliminar("60");
        arbol.imprimirInOrder();

         /* Se elimina el nodo padre '70' con hijo '80'
              50
           /     \
          30      80
         /  \
       20   40
           /
         35            */

        System.out.println("------ Elimina nodo padre '70' con hijo '80' ------");
        arbol.eliminar("70");
        arbol.imprimirInOrder();

        /* Se elimina el nodo padre '50' con hijo '30' y '80'
              80
           /
          30
         /  \
       20   40
           /
         35            */

        System.out.println("------ Elimina nodo padre con 2 hijos '50' ------");
        arbol.eliminar("50");
        arbol.imprimirInOrder();
    }
}











