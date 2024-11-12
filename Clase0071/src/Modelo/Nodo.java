/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Nodo {
    
    int dato ;
    Nodo siguiente;
    Nodo anterior;
    
    
    public Nodo(int valor){
        this.siguiente=null;
        this.anterior=null;
        this.dato=valor;
        
    }
           
    
}
