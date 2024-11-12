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
public class Ejercicio7SecuenciaDeFibonacci {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el numero de terminos: ");
        int n = scanner.nextInt();
        
        int primero = 0;
        int segundo = 1;
        
        int contador = 0;
        
        System.out.println("Los primeros " + n + " terminos de la secuencia de Fibonacci son:");
        
        while (contador < n) {
            System.out.print(primero + " ");
            
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            
            contador++;
        }
    }
}


    
