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
public class Ejercicio5iniciodeSesion {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String usuario;
        String contraseña = "Rekkles";
        String contra2;

        System.out.println("Ingrese su nombre");
        usuario = leer.next();

        System.out.println("Ingrese su contrasena");
        contra2 = leer.next();

        if (contra2.equals(contraseña)) {
            System.out.println("contrasena correcta");
        } else {
            System.out.println("Contrasena incorrecta");
        }

    }
}
