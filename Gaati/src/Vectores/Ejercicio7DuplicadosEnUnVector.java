/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

import java.util.HashSet;

/**
 *
 * @author Lenovo
 */
public class Ejercicio7DuplicadosEnUnVector {
    
      public static void main(String[] args) {
        int[] vector = {10, 5, 15, 8, 20, 15, 10};
        
        // Utilizar un HashSet para almacenar los elementos duplicados
        HashSet<Integer> elementosDuplicados = new HashSet<>();
        
        // Recorrer el vector y verificar si cada elemento está duplicado
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[i] == vector[j]) {
                    elementosDuplicados.add(vector[i]);
                    break;
                }
            }
        }
        
        // Mostrar los elementos duplicados
        System.out.println("Elementos duplicados en el vector:");
        for (int elemento : elementosDuplicados) {
            System.out.println(elemento);
        }
    }
}


