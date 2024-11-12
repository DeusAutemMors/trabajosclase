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
public class Ejercicio8ConteoDeNumerosPyI {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una lista de números separados por espacios: ");
        String numerosString = scanner.nextLine();
        scanner.close();
        
        String[] numerosArray = numerosString.split(" ");
        int contadorPares = 0;
        int contadorImpares = 0;
        
        for (int i = 0; i < numerosArray.length; i++) {
            int numero = Integer.parseInt(numerosArray[i]);
            
            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);

    
}
}
