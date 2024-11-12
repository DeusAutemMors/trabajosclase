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
public class Ejercicio9ConversionDemoneda {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double n1 = 0;
        double result = 0;

        System.out.println("Que cantidad de Dolares tiene");
        n1 = leer.nextInt();

        result = n1 * 4.950;

        System.out.println("tiene un total de " + result + "euros");

    }
}
