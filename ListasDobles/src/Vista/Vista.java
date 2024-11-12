/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Vista {

    private Scanner scanner;

    public Vista() {
        this.scanner = new Scanner(System.in);

    }

    public void MostrarMenu() {
        System.out.println("Menu");
        System.out.println("1. Agregar un elemento al final");
        System.out.println("2. Agregar un elemento al Inicio");
        System.out.println("3. Eliminar elemento ");
        System.out.println("4. Buscar Dato");
        System.out.println("0. Salir ");
        System.out.println("Seleccione una opcion");
    }
    public int obtenerOpcion(){
        return scanner.nextInt();
    }
    
    public int obtenerNumero(String mensaje ){
        System.out.println(mensaje);
        return scanner.nextInt();
    }
public void mostrarMensaje (String mensaje){
    System.out.println(mensaje);
}
}
