/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matrices;

/**
 *
 * @author Lenovo
 */
public class Ejercicio6SumaDiagoMatriz {

    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; 

        int sumaDiagonalPrincipal = 0;
        int sumaDiagonalSecundaria = 0;

     
        for (int i = 0; i < matriz.length; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
            sumaDiagonalSecundaria += matriz[i][matriz.length - 1 - i];
        }

        
        System.out.println("La suma de la diagonal principal es: " + sumaDiagonalPrincipal);
        System.out.println("La suma de la diagonal secundaria es: " + sumaDiagonalSecundaria);
    }
}
