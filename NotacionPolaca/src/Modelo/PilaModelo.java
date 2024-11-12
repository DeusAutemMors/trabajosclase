/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Stack;

public class PilaModelo {
    private Stack<Integer> pila;

    public PilaModelo() {
        pila = new Stack<>();
    }

   
    public void push(int valor) {
        pila.push(valor);
    }

    
    public int pop() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila esta vacia");
        }
        return pila.pop();
    }

    
    public boolean estaVacia() {
        return pila.isEmpty();
    }
}

