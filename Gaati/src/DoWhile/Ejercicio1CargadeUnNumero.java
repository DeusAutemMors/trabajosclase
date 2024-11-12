/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoWhile;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio1CargadeUnNumero {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Ingrese un numero entre 0 y 999 (0 para salir): ");
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            int digitos = contarDigitos(numero);
            System.out.println("El numero tiene " + digitos + " digitos.");
        }
        
        System.out.println("Programa finalizado.");
        scanner.close();
    }
    
    public static int contarDigitos(int numero) {
        if (numero == 0) {
            return 1;
        }
        
        int contador = 0;
        
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        
        return contador;
    }
}

    
