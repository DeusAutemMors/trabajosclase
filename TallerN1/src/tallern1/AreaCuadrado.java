/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallern1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class AreaCuadrado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lado = 0, result = 0;

        System.out.println("Ingrese el valor del lado del cuadrado");
        lado = scanner.nextInt();

        result = lado * lado;

        System.out.println("El area del cuadrado es" + result);

    }

}
