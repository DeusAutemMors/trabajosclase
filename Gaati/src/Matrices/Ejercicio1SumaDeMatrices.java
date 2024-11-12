/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author Lenovo
 */
public class Ejercicio1SumaDeMatrices {
    
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}}; 

        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int[][] matrizSuma = new int[filas][columnas]; 

        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Mostrar la matriz resultado
        System.out.println("Matriz Resultado:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println();
        }
    }
}


    

