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
public class Ejercicio6ConteoDeDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        
        int cantidadDigitos = contarDigitos(numero);
        
        System.out.println("El numero " + numero + " tiene " + cantidadDigitos + " digitos.");
    }
    
    public static int contarDigitos(int numero) {
        int contador = 0;
        
        while (numero != 0) {
            numero /= 10;
            contador++;
        }
        
        return contador;
    }
}


