/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class PilaModelo {
    
    
    private Nodo cima;
    int size;

    public PilaModelo() {
        cima = null;
        this.size = 0;

    }
    
    
 public void apilar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (pilaVacia()) {
            nuevoNodo = cima;
        } else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;

        }
        size++;

    }
 
  public boolean pilaVacia() {

        return cima == null;
    }
  
  public int desaPilar(){
        
        if (pilaVacia()){
            throw new RuntimeException ("la pila esta vacia ");
        }
        
        int valor= cima.dato;
        cima=cima.siguiente;
        return valor;
    }
 
 
}
