/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author Lenovo
 */
public class ejercicio1SumaDeElementos {
    public static void main(String[] args) {
        int[] vector = {5, 10, 15, 20, 25};
        int suma = 0;
        
        for (int i = 0; i < vector.length; i++) {
            suma += vector[i];
        }
        
        System.out.println("La suma de los elementos del vector es: " + suma);
    }
}


    
    

