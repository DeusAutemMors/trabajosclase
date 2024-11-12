/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;

    }
    public void agregar (int valor){
        raiz=agregarR(raiz,valor);
    }

    public Nodo agregarR(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }
        if (valor < actual.valor) {
            actual.derecho = agregarR(actual.derecho, valor);
        }
        return actual;
    }

    public void eliminarR(int valor) {
        raiz = eliminarR(raiz, valor);

    }

    public Nodo eliminarR(Nodo actual, int valor) {
        if (actual == null) {
            return null;
        }
        if (valor == actual.valor) {
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }

            if (actual.izquierdo == null) {
                return actual.derecho;
            }
            if (actual.derecho == null) {
                return actual.izquierdo;

            }

            int valorMenor = encontrarValor(actual.derecho);
            actual.valor = valorMenor;
            actual.derecho = eliminarR(actual.derecho, valorMenor);
            return actual;
        }
        if (valor < actual.valor) {
            actual.izquierdo = eliminarR(actual.izquierdo, valor);
            return actual;
        }

        return eliminarR(actual, valor);
    }

    private int encontrarValor(Nodo Raiz) {
        return raiz.izquierdo == null ? raiz.valor : encontrarValor(Raiz.izquierdo);
    }

    public void recorridoInorden(Nodo actual) {
        if (actual != null) {
            recorridoInorden(actual.izquierdo);
            System.out.print(actual.valor + " ");
            recorridoInorden(actual.derecho);
        }
    }

    public void recorridoPostorden(Nodo actual) {
        if (actual != null) {
            recorridoPostorden(actual.izquierdo);
            recorridoPostorden(actual.derecho);
            System.out.print(actual.valor + " ");
        }
    }

    public void recorridoPreorden(Nodo actual) {
        if (actual != null) {
            System.out.print(actual.valor + " ");
            recorridoPreorden(actual.izquierdo);
            recorridoPreorden(actual.derecho);
        }
    }
    
    public void imprimirPreorden (){
        imprimirR(raiz);
    }
    
   public void imprimirR (Nodo nodo){
       if(nodo !=null){
           System.out.println(nodo.valor+"");
           imprimirR(nodo.izquierdo);
           imprimirR(nodo.derecho);
       }
   }

    //hacer metodo para recorrido inorden 
    //preorden
    //posorden
}
