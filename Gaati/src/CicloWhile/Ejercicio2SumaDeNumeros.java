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
public class Ejercicio2SumaDeNumeros {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            
            suma += numero;
        } while (numero != 0);
        
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
    

