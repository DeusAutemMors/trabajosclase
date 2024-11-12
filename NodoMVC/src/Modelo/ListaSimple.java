/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class ListaSimple {

    private Nodo cabeza;
    private int tamano;

    public ListaSimple() {
        this.cabeza = cabeza;
        this.tamano = 0;
    }

    public void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;

        } else {
            Nodo temp = cabeza;
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
                tamano++;

            }
            temp.setSiguiente(nuevoNodo);

        }
    }

    public void eliminar() {
        if (cabeza != null) {
            cabeza = cabeza.getSiguiente();

        } else {
            System.out.println("Lista vacia");
        }

    }

    public Nodo getCabeza() {

        return cabeza;
    }

    public int buscar(int dato) {
        Nodo actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getDato() == dato) {
                return actual.getDato();
            }
        }
        return -1;
    }

    public void eliminarUltD() {
        if (cabeza != null) {
            if (tamano == 1) {
                cabeza = null;
            } else {
                Nodo temp = cabeza;

                for (int i = 0; i < tamano - 1; i++) {
                    temp = temp.getSiguiente();

                }
                temp.setSiguiente(null);
            }
        }
    }

}
