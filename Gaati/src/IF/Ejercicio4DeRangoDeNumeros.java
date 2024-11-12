/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IF;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio4DeRangoDeNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        // Verificar si el número está en el rango de 1 a 9999
        if (numero >= 1 && numero <= 9999) {
            // Obtener la cantidad de cifras del número
            int cifras = obtenerCantidadCifras(numero);

            // Determinar la posición del número
            String posicion = determinarPosicion(numero);

            System.out.println("El numero tiene " + cifras + " cifra(s) y corresponde a las " + posicion);
        } else {
            System.out.println("El número está fuera del rango válido.");
        }
    }

    public static int obtenerCantidadCifras(int numero) {
        if (numero == 0) {
            return 1;
        }

        int cifras = 0;

        while (numero != 0) {
            numero /= 10;
            cifras++;
        }

        return cifras;
    }

    public static String determinarPosicion(int numero) {
        int unidades = numero % 10;
        int decenas = (numero / 10) % 10;
        int centenas = (numero / 100) % 10;
        int unidadesMil = (numero / 1000) % 10;

        if (unidadesMil > 0) {
            return "unidades de mil";
        } else if (centenas > 0) {
            return "centenas";
        } else if (decenas > 0) {
            return "decenas";
        } else {
            return "unidades";
        }
    }
}
