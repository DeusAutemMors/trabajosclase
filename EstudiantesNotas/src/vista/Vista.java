/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import javax.swing.JFrame;

public class Vista {

    private Scanner scanner;

    public Vista() {

        scanner = new Scanner(System.in);

    }

    public int solicitarNumero(String Mensaje) {
        System.out.println(Mensaje);
        return scanner.nextInt(10);
    }

    public void mostrarmensaje(String Mensaje) {
        System.out.println(Mensaje);

    }

    public void mostrarCalificaciones(int[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < calificaciones[i].length; j++) {
                System.out.println(calificaciones[i][j] + " ");
            }

            System.out.println();

        }
    } 
     public void mostrarpromedioestudiante(int estudiante, double promedio) {
        System.out.println("Promedio Estudiante " + (estudiante + 1) + ":" + promedio);
    }


    

    public void mostrarpromediomateria(int materia, double promedio) {
        System.out.println("Promedio materia " + (materia + 1) + ":" + promedio);
    }

   
    
    

   
}
