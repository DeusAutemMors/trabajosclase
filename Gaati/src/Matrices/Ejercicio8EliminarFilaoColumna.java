/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author Lenovo
 */
public class Ejercicio8EliminarFilaoColumna {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Matriz original

        int filaAEliminar = 1; // Fila a eliminar
        int columnaAEliminar = 2; // Columna a eliminar

        // Eliminar la fila
        int[][] matrizSinFila = eliminarFila(matriz, filaAEliminar);

        // Eliminar la columna
        int[][] matrizSinFilaColumna = eliminarColumna(matrizSinFila, columnaAEliminar);

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // Mostrar la matriz sin la fila y columna especificadas
        System.out.println("Matriz sin fila y columna:");
        mostrarMatriz(matrizSinFilaColumna);
    }

    // Método para eliminar una fila de una matriz
    public static int[][] eliminarFila(int[][] matriz, int fila) {
        int[][] nuevaMatriz = new int[matriz.length - 1][matriz[0].length];

        for (int i = 0, k = 0; i < matriz.length; i++) {
            if (i == fila) {
                continue;
            }
            for (int j = 0; j < matriz[0].length; j++) {
                nuevaMatriz[k][j] = matriz[i][j];
            }
            k++;
        }

        return nuevaMatriz;
    }

    // Método para eliminar una columna de una matriz
    public static int[][] eliminarColumna(int[][] matriz, int columna) {
        int[][] nuevaMatriz = new int[matriz.length][matriz[0].length - 1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0, k = 0; j < matriz[0].length; j++) {
                if (j == columna) {
                    continue;
                }
                nuevaMatriz[i][k] = matriz[i][j];
                k++;
            }
        }

        return nuevaMatriz;
    }

    // Método auxiliar para mostrar una matriz en pantalla
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
