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
public class Ejercicio10CompraYDescuento {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el total de compra: ");
        double totalCompra = scanner.nextDouble();
        scanner.close();

        double descuento = 0.12;
        double descuentoAcumulativo = 0;

        while (totalCompra > 0) {
            double descuentoAplicado = totalCompra * descuento;
            totalCompra -= descuentoAplicado;
            descuentoAcumulativo += descuentoAplicado;
        }

        System.out.println("Descuento acumulativo aplicado: " + descuentoAcumulativo);

    }
}
