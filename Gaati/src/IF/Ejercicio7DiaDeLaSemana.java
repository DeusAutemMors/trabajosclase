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
public class Ejercicio7DiaDeLaSemana {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int n1;

        System.out.println("Digite un numero del 1 al 7");
        n1 = leer.nextInt();

        if (n1 == 1) {
            System.out.println("El dia es Lunes");
        }

        if (n1 == 2) {
            System.out.println("El dia es Martes");
        }

        if (n1 == 3) {
            System.out.println("El dia es Miercoles");
        }

        if (n1 == 4) {
            System.out.println("El dia es jueves");
        }

        if (n1 == 5) {
            System.out.println("El dia es viernes");
        }

        if (n1 == 6) {
            System.out.println("El dia es Sabado");
        }

        if (n1 == 7) {
            System.out.println("El mes es Domingo");
        }

    }
}
