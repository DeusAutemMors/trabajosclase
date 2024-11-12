/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

/**
 *
 * @author Lenovo
 */
public class Ejercicio10Criba {
    
     public static void main(String[] args) {
        int limite = 100; // Límite hasta el cual se buscarán los números primos

        boolean[] esPrimo = new boolean[limite + 1];

        // Inicializar todos los elementos como primos
        for (int i = 2; i <= limite; i++) {
            esPrimo[i] = true;
        }

        // Marcar los múltiplos como no primos
        for (int i = 2; i * i <= limite; i++) {
            if (esPrimo[i]) {
                for (int j = i * i; j <= limite; j += i) {
                    esPrimo[j] = false;
                }
            }
        }

        // Mostrar los números primos encontrados
        System.out.println("Numeros primos hasta el lumite " + limite + ":");
        for (int i = 2; i <= limite; i++) {
            if (esPrimo[i]) {
                System.out.print(i + " ");
            }
        }
    }
}



