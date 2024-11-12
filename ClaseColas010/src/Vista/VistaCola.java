/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class VistaCola {

    private Controlador controlador;
    private Scanner scanner;

    public VistaCola(Controlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);

    }

    public void MiMenu() {
        int opcion;
        do {
            System.out.println("1 Encolar");
            System.out.println("2 Desencolar");
            System.out.println("3 Mostrar Cola");
            System.out.println("4 Salir ");
            System.out.println("Seleccione una opcion valida");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor a encolar");
                    int valor=scanner.nextInt();
                    controlador.encolarElemento(valor);
                    break;
                case 2:
                    
                    controlador.desencolarElemento();
                    break;

                case 3:
                    controlador.mostrarCola();
                    break;

                case 4:
                    System.out.println("Saliendo.........");
                    break;

                default:
                    System.out.println("Ingrese una opcion valida ");
           break;
            }

        } while (opcion != 4);
    }
}
