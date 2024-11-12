/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package For;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio7GenerarUnaSerie {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        
         System.out.print("Hasta que numero quiere la serie de Fibonacci: ");
        int longitud = scanner.nextInt();
        scanner.close();
        
        int num1 = 0, num2 = 1;
        System.out.print("Serie de Fibonacci: " + num1 + ", " + num2);
        
        for (int i = 2; i < longitud; i++) {
            int suma = num1 + num2;
            System.out.print(", " + suma);
            num1 = num2;
            num2 = suma;
        }
    }
}

    
