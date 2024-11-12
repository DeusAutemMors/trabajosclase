/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author Lenovo
 */
public class Ejercicio9InvertirUnVector {

    public static void main(String[] args) {
        int[] vector = {1, 2, 3, 4, 5};

        System.out.println("Vector original:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        int[] vectorInvertido = new int[vector.length];
        int indice = 0;

        for (int i = vector.length - 1; i >= 0; i--) {
            vectorInvertido[indice] = vector[i];
            indice++;
        }

        System.out.println("\nVector invertido:");
        for (int i = 0; i < vectorInvertido.length; i++) {
            System.out.print(vectorInvertido[i] + " ");
        }
    }
}
