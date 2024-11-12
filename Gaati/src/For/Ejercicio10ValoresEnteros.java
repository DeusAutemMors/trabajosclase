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
public class Ejercicio10ValoresEnteros {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNegativos = 0;
        int cantidadPositivos = 0;
        int cantidadMultiplos15 = 0;
        int acumuladoPares = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el valor #" + i + ": ");
            int valor = scanner.nextInt();
            
            if (valor < 0) {
                cantidadNegativos++;
            } else if (valor > 0) {
                cantidadPositivos++;
            }
            
            if (valor % 15 == 0) {
                cantidadMultiplos15++;
            }
            
            if (valor % 2 == 0) {
                acumuladoPares += valor;
            }
        }
        
        scanner.close();
        
        System.out.println("Cantidad de valores negativos: " + cantidadNegativos);
        System.out.println("Cantidad de valores positivos: " + cantidadPositivos);
        System.out.println("Cantidad de múltiplos de 15: " + cantidadMultiplos15);
        System.out.println("Valor acumulado de los números pares: " + acumuladoPares);
    }

    
}
