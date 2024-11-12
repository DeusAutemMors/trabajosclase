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
    private String nombre;
    int nivel;
    Nodo siguiente;
    
    public Nodo (String nombre, int nivel){
        this.nombre=nombre;
        this.nivel=nivel;
        this.siguiente=null;
    }
         
    
}
