/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Nodo;
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

    public int mostrarMenu() {

        System.out.println("Centro de servicio");
        System.out.println("Registrar Cliente");
        System.out.println("Atender Cliente");
        System.out.println("Mostrar Lista De espera");
        System.out.println(" Salir");
        System.out.println("Seleccione una opcion: ");

        return scanner.nextInt();

    }

    public String pedirNombre() {
        System.out.println("ingrese el nombre del cliente");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String pedirDocumento() {
        System.out.println("Ingrese el documento del cliente");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public int seleccionarServicio() {
        System.out.println("Seleccione un Servicio");
        System.out.println("1. Atencion al cliente");
        System.out.println("2. Pago servicios");
        System.out.println("3. Registro PQRS");
        System.out.println("4. Seleccione una opcion: ");
        return scanner.nextInt();
    }

    public void mostrarClienteAtendido(Nodo cliente) {
        if (cliente != null) {
            System.out.println("Atendido a:" + cliente.getNombreCliente() + "-" + "servicio" + cliente.getServicio());
        } else {
            System.out.println("No hay clientes en espera");
        }
    }

    public void mostraListaEspera(Nodo cabeza) {

        if (cabeza == null) {
            System.out.println("La lista de espera esta vacia");
        } else {
            Nodo actual = cabeza;
            System.out.println("Lista de espera");
            while (actual != null) {
                System.out.println("Nombre: " + actual.getNombreCliente() + "documento" + actual.getDocumentoCliente() + "servicio" + actual.getServicio());
                actual = actual.getSiguiente();
            }
        }

    }
}
