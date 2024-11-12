/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CicloWhile;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Pruebanumero1 {

    Scanner scanner = new Scanner(System.in);
}

class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInteres;

    public void asignarNombre(String nom) {
        if (nom.length() == 0) {
            System.out.println("Error: Cadena vacía");
            return;
        }
        nombre = nom;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void asignarCuenta(String cue) {
        if (cue.length() == 0) {
            System.out.println("Error: cuenta no valida");
            return;
        }
        cuenta = cue;
    }

    public String obtenerCuenta() {
        return cuenta;

    }

    public double estado() {
        return saldo;
    }

    public void ingreso(double cantidad) {
        if (cantidad < 0) {
            System.out.println("Error: cantidad negativa");
            return;
        }
        saldo = saldo + cantidad;
    }

    public void reintegro(double cantidad) {
        if (saldo - cantidad < 0) {

            System.out.println("Error: no dispone de saldo");
            return;

        }
        saldo = saldo - cantidad;
    }

    public void asignarTipoDeInteres(double tipo)
    {
    if (tipo < 0)
    {
        System.out.println("Error: tipo no valido ");
        return;
    }
    tipoDeInteres = tipo;
    }
    public double obtenerTipoDeInteres()
    {
        return tipoDeInteres;
    }
    }
