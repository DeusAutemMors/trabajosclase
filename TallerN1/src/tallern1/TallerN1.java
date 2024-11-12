/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallern1;

import java.util.Scanner;

/**
 * Taller N1 Programacion Orientada a Objetos Daniel Mauricio Gil Sosa
 * Profesor:Ingeniera Magda Pineda Ejercicio Calculadora
 *
 */
public class TallerN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, result = 0;
        int Cond = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Calculadora Daniel Gil Sosa");
        System.out.println("Digite Dos numeros y eligira su operacion");
        System.out.println("Digite el primer numero ");
        num1 = scanner.nextInt();
        System.out.println("Digite el segundo numero ");
        num2 = scanner.nextInt();

        System.out.println("Que operacion deseas realizar , Suma= Digita 1, Resta=Digita 2,Division=Digita3, Multiplicacion=Digita4");
        Cond = scanner.nextInt();

        if (Cond == 1) {

            result = num1 + num2;

            System.out.println("La suma realizada es" + result);

        }
        if (Cond == 2) {

            result = num1 - num2;

            System.out.println("La resta realizada es" + result);

        }

        if (Cond == 3) {

            result = num1 / num2;

            System.out.println("La division realizada es" + result);

        }
        if (Cond == 4) {

            result = num1 * num2;

            System.out.println("La Multiplicacion realizada es" + result);

        }

    }

}
