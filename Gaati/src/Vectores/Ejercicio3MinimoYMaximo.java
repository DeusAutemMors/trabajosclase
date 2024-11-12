/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author Lenovo
 */
public class Ejercicio3MinimoYMaximo {
    
      public static void main(String[] args) {
        int[] vector = {10, 5, 15, 8, 20};
        int min = vector[0];
        int max = vector[0];
        
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
            
            if (vector[i] > max) {
                max = vector[i];
            }
        }
        
        System.out.println("El valor minimo del vector es: " + min);
        System.out.println("El valor maximo del vector es: " + max);
    }
}

    
