/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CicloWhile;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio3FactorialDeUnNumero {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();
        
        int factorial = 1;
        int contador = 1;
        
        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}

    

