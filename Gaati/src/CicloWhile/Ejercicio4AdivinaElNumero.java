/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CicloWhile;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio4AdivinaElNumero {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroUsuario;
        
        System.out.println("Adivina el número entre 1 y 100.");
        
        do {
            System.out.print("Ingrese un número: ");
            numeroUsuario = scanner.nextInt();
            
            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número ingresado es menor. Intenta nuevamente.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número ingresado es mayor. Intenta nuevamente.");
            }
            
            intentos++;
        } while (numeroUsuario != numeroAleatorio);
        
        System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
    }
}


