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
public class Ejercicio2NumerosPares {

    public static void main(String[] args) {

        int num1 = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Digite un numero ");
        num1 = leer.nextInt();

        if (num1 / 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }

    }
}
