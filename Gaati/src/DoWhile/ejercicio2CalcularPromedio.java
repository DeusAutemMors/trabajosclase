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
public class ejercicio2CalcularPromedio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero;

        do {
            System.out.print("Ingrese un numero (0 para finalizar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                suma += numero;
                contador++;
            }
        } while (numero != 0);

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("El promedio de los numeros ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron numeros.");
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
