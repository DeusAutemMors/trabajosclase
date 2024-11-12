/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author Lenovo
 */
public class Ejercicio10MultiplicacionPorUnEscalar {
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int scalar = 2;
        
        int[][] result = multiplyMatrixByScalar(matrix, scalar);
        
        System.out.println("Matriz resultante:");
        printMatrix(result);
    }
    
    public static int[][] multiplyMatrixByScalar(int[][] matrix, int scalar) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        
        int[][] result = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
        
        return result;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}


