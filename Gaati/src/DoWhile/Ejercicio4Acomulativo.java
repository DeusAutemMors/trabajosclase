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
public class Ejercicio4Acomulativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;
        int acumulador = 0;

        do {
            System.out.print("Ingrese un valor (9999 para finalizar): ");
            valor = scanner.nextInt();

            if (valor != 9999) {
                acumulador += valor;
            }
        } while (valor != 9999);

        System.out.println("Valor acumulado: " + acumulador);

        if (acumulador == 0) {
            System.out.println("El valor acumulado es cero.");
        } else if (acumulador > 0) {
            System.out.println("El valor acumulado es mayor a cero.");
        } else {
            System.out.println("El valor acumulado es menor a cero.");
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
