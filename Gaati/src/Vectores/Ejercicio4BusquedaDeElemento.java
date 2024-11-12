/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author Lenovo
 */
public class Ejercicio4BusquedaDeElemento {
    public static void main(String[] args) {
        int[] vector = {10, 5, 15, 8, 20};
        int elementoBuscado = 15;
        int posicion = -1;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == elementoBuscado) {
                posicion = i;
                break;
            }
        }
        
        if (posicion != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la posicion " + posicion);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el vector");
        }
    }
}


    

