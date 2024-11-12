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
public class Ejercicio3TablaDeMultiplicar {
    
     Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        int numero=5;
       for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            
        }
    
}
}