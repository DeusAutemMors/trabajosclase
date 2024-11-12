/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cola;

/**
 *
 * @author Lenovo
 */
public class Controlador {
    private Cola cola;
    
    public Controlador() {
        this.cola = new Cola();
    }
    
    
    public void encolarElemento(int dato) {
        cola.encolar(dato);
        System.out.println("Elemento " + dato + " encolado.");
    }
    
   
    public void desencolarElemento() {
        int elemento = cola.desencolar();
        if (elemento != -1) {
            System.out.println("Elemento " + elemento + " desencolado.");
        }
    }
    
   
    public void mostrarCola() {
        System.out.println("Contenido de la cola:");
        cola.mostrarCola();
    }
    
    
    public boolean colaVacia() {
        boolean vacia = cola.esVacia();
        if (vacia) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("La cola no está vacía.");
        }
        return vacia;
    }
}
    

