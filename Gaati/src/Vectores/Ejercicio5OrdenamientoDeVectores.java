/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author Lenovo
 */
public class Ejercicio5OrdenamientoDeVectores {

    public static void main(String[] args) {
        int[] vector = {10, 5, 15, 8, 20};

        // Algoritmo de burbuja para ordenar el vector en orden ascendente
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        // Imprimir el vector ordenado
        System.out.println("Vector ordenado en orden ascendente:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
    }
}
