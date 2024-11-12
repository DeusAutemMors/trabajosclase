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
public class Ejercicio6DeTriangulo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;

        System.out.println("Digite el primer lado");
        a = leer.nextInt();
        System.out.println("Digite el segundo lado");
        b = leer.nextInt();
        System.out.println("Digite el tercer lado");
        c = leer.nextInt();

        if (a == b && a == c) {

            System.out.println("Es un triangulo Equilatero ");

        }

        if (a == b || a == c || b == c) {
            System.out.println("Es un triangulo isoceles ");

        } else {
            System.out.println("Es un triangulo Escaleno");
        }

    }
}
