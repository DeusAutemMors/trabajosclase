/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Ejercicio6EliminarElemento {
    
    public static void main(String[] args) {
        int[] vector = {10, 5, 15, 8, 20};
        int elementoAEliminar = 15;
        
        // Buscar el índice del elemento a eliminar
        int indice = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == elementoAEliminar) {
                indice = i;
                break;
            }
        }
        
        // Si se encontró el elemento, eliminarlo y redimensionar el vector
        if (indice != -1) {
            int[] nuevoVector = new int[vector.length - 1];
            int contador = 0;
            for (int i = 0; i < vector.length; i++) {
                if (i != indice) {
                    nuevoVector[contador] = vector[i];
                    contador++;
                }
            }
            vector = nuevoVector;
            
            // Imprimir el vector actualizado
            System.out.println("Vector despues de eliminar el elemento " + elementoAEliminar + ":");
            System.out.println(Arrays.toString(vector));
        } else {
            System.out.println("El elemento " + elementoAEliminar + " no se encontro en el vector.");
        }
    }
}


    