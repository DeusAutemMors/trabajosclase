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
public class Ejercicio8SumaDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        
        int suma = sumarDigitos(numero);
        
        System.out.println("La suma de los digitos del numero " + numero + " es: " + suma);
    }
    
    public static int sumarDigitos(int numero) {
        int suma = 0;
        
        while (numero != 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }
        
        return suma;
    }
}

    

