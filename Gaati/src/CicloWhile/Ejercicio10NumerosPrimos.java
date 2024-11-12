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
public class Ejercicio10NumerosPrimos {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        boolean esPrimo = true;
        int divisor = 2;
        
        while (divisor <= numero / 2) {
            if (numero % divisor == 0) {
                esPrimo = false;
                break;
            }
            
            divisor++;
        }
        
        if (esPrimo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }
}

    

