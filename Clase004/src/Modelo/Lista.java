/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Lista {

    private Nodo cabeza;

    public Lista() {
        this.cabeza = null;

    }

    public void anadirCliente(String Nombre, String Documento, String Servicio) {
        Nodo nuevoNodo = new Nodo(Nombre, Documento, Servicio);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(nuevoNodo);
        }

    }

    public Nodo atenderCliente() {
        if (cabeza == null) {
            return null;

        }
        Nodo clienteAtendido = cabeza;
        cabeza = cabeza.getSiguiente();
        return clienteAtendido;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
}
