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
public class Ejercicio9PatronDeAsteriscos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int filas;

        System.out.println("Ingrese la cantidad de filas");
        filas = leer.nextInt();
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print("");
            }
            
            
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
