/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author Lenovo
 */
public class Ejercicio3TranspuestaDeUnaMatriz {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Matriz original

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int[][] matrizTraspuesta = new int[columnas][filas]; // Matriz traspuesta

        // Calcular la matriz traspuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar la matriz traspuesta
        System.out.println("Matriz Traspuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizTraspuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}
