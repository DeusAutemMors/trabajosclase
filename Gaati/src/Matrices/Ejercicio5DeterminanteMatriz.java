/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author Lenovo
 */
public class Ejercicio5DeterminanteMatriz {
    
    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {3, 4}}; 

        int determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];

        
        System.out.println("El determinante de la matriz es: " + determinante);
    }
}

    
