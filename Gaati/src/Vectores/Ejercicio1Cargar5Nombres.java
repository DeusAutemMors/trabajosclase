/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vectores;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio1Cargar5Nombres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] edades = new int[5];

        System.out.println("Ingrese los nombres y edades de las personas:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();

            System.out.print("Edad: ");
            edades[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            System.out.println();
        }

        System.out.println("Personas mayores de edad:");

        for (int i = 0; i < 5; i++) {
            if (edades[i] >= 18) {
                System.out.println(nombres[i]);
            }
        }

        scanner.close();
    }
}
