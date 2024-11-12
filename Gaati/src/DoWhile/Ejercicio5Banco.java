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
public class Ejercicio5Banco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroCuenta;
        double saldo;

        System.out.println("Ingrese los datos de las cuentas corrientes (ingrese un numero negativo en el numero de cuenta para finalizar):");

        do {
            System.out.print("Numero de cuenta: ");
            numeroCuenta = scanner.nextInt();

            if (numeroCuenta >= 0) {
                System.out.print("Saldo actual: $");
                saldo = scanner.nextDouble();

                // Aquí puedes procesar los datos de la cuenta corriente como desees
                System.out.println("Datos ingresados correctamente.");
            }
        } while (numeroCuenta >= 0);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
