/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Nodo <T> {
     
    T dato;
    Nodo <T> siguiente;
    Nodo <T> anterior;
    
    
    public Nodo (T dato){
        this.siguiente=null;
        this.anterior=null;
        this.dato=dato;
    }
    
    
}
