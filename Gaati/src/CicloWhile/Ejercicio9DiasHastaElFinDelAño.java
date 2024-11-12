/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CicloWhile;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio9DiasHastaElFinDelAño {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una fecha en formato Año-Mes-Dia: ");
        String fechaIngresada = scanner.nextLine();
        
        LocalDate fecha = LocalDate.parse(fechaIngresada);
        LocalDate finDeAnio = LocalDate.of(fecha.getYear(), 12, 31);
        
        long diasRestantes = ChronoUnit.DAYS.between(fecha, finDeAnio);
        
        System.out.println("Faltan " + diasRestantes + " dias para el fin del año.");
    }
}

    

