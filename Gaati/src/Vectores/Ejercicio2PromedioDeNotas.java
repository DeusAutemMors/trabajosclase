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
public class Ejercicio2PromedioDeNotas {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] calificaciones = new int[5];
        int suma = 0;
        
        System.out.println("Ingrese las calificaciones:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Calificacion " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
            suma += calificaciones[i];
        }
        
        double promedio = (double) suma / calificaciones.length;
        
        System.out.println("El promedio de las calificaciones es: " + promedio);
        
        scanner.close();
    }
}


