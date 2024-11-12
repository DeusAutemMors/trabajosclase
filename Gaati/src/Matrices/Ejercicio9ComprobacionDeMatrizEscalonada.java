/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author Lenovo
 */
public class Ejercicio9ComprobacionDeMatrizEscalonada {
    
     public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {0, 5, 6, 7},
            {0, 0, 8, 9}
        };
        
        boolean isEscalonada = esMatrizEscalonada(matrix);
        
        if (isEscalonada) {
            System.out.println("La matriz es escalonada.");
        } else {
            System.out.println("La matriz no es escalonada.");
        }
    }
    
    public static boolean esMatrizEscalonada(int[][] matrix) {
        int previousZerosCount = Integer.MAX_VALUE;
        
        for (int[] row : matrix) {
            int zerosCount = countZeros(row);
            
            if (zerosCount >= previousZerosCount) {
                return false;
            }
            
            previousZerosCount = zerosCount;
        }
        
        return true;
    }
    
    public static int countZeros(int[] row) {
        int count = 0;
        
        for (int num : row) {
            if (num == 0) {
                count++;
            }
        }
        
        return count;
    }
}