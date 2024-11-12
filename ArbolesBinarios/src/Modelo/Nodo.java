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

    int valor;
    Nodo izquierdo;
    Nodo derecho;

    public Nodo(int valor) {

        this.derecho = null;
        this.izquierdo = null;
        this.valor = valor;
    }

}
