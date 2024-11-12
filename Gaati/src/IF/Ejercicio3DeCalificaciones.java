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
public class Ejercicio3DeCalificaciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;
        int resultado = 0;

        System.out.println("Digite su primer nota");
        nota1 = leer.nextInt();
        System.out.println("Digite su segunda nota");
        nota2 = leer.nextInt();
        System.out.println("Digite su tercera nota");
        nota3 = leer.nextInt();
        System.out.println("Digite su Cuarta nota");
        nota4 = leer.nextInt();

        resultado = (nota1 + nota2 + nota3 + nota4) / 4;

        if (resultado > 30) {
            System.out.println("aprobo la materia" + resultado);
        }
        if (resultado < 30) {
            System.out.println("Repobro la materia" + resultado);
        }

    }
}
