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
public class Ejercicio3ContarPiezas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peso;
        int contadorEntre98y102 = 0;
        int contadorMasDe102 = 0;
        int contadorMenosDe98 = 0;
        int contadorTotal = 0;

        do {
            System.out.print("Ingrese el peso de la pieza en kilogramos (0 para finalizar): ");
            peso = scanner.nextInt();

            if (peso > 0) {
                if (peso >= 9.8 && peso <= 10.2) {
                    contadorEntre98y102++;
                } else if (peso > 10.2) {
                    contadorMasDe102++;
                } else {
                    contadorMenosDe98++;
                }

                contadorTotal++;
            }
        } while (peso != 0);

        System.out.println("Cantidad de piezas con peso entre 9.8 Kg. y 10.2 Kg.: " + contadorEntre98y102);
        System.out.println("Cantidad de piezas con peso mas de 10.2 Kg.: " + contadorMasDe102);
        System.out.println("Cantidad de piezas con peso menos de 9.8 Kg.: " + contadorMenosDe98);
        System.out.println("Cantidad total de piezas procesadas: " + contadorTotal);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
