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
public class AreaCirculo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radio, result = 0;
        double v = 3.1416;

        System.out.println("ingrese  valor del radio ");
        radio = scanner.nextInt();

        result = radio * radio * v;

        System.out.println("El area del circulo es" + result);

    }

}
