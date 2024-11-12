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
public class Ejercicio8DeDescuento {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int totalfacturas = 0;
        double facturacionTotal = 0;
        double litrosarticulo1 = 0;
        int facturasdemasde1350000 = 0;
        int codigoarticulo = 0;
        double cantidadL = 0;
        double PL = 0;
        double Result = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.println("Ingrese los datos de la factura  " + i);
            System.out.print(" Digite el codigo del articulo,empiece de 1 en adelante: ");
            codigoarticulo = leer.nextInt();
            System.out.print("Cantidad vendida en litros: ");
            cantidadL = leer.nextDouble();
            System.out.print(" Precio por litro: ");
            PL = leer.nextDouble();

            double result = cantidadL * PL;
            facturacionTotal += result;

            if (codigoarticulo == 1) {
                litrosarticulo1 += cantidadL;
            }

            if (result > 1350000) {
                facturasdemasde1350000++;
            }

            totalfacturas++;
        }

        System.out.println("Facturación total: " + facturacionTotal);

        System.out.println("Cantidad en litros vendidos del artículo 1: " + litrosarticulo1);

        System.out.println("Cantidad de facturas emitidas de más de $1.350.000: " + facturasdemasde1350000);
    }
}
