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
public class Ppalindromas {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String palabra;
        char[] palindromo;
        int izq, der;
        System.out.println("Escriba la palabra");
        palabra = s.nextLine();
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        palindromo = palabra.toCharArray();
        izq = 0;
        der = palindromo.length - 1;

        while (izq < der) {
            if (palindromo[izq] == palindromo[der]) {
                der--;
                izq++;
            } else {
                System.out.println("La palabra no es un palindromo");
                break;
            }
        }

        if (izq == der) {
            System.out.println("La palabra es un palindromo");
        }
    }

}
