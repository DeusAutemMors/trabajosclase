/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.Vista;

/**
 *
 * @author Lenovo
 */
public class Validar {
    
    private PilaModelo pila;
    private Vista vista;

    public Validar (PilaModelo pila, Vista vista) {
        this.pila = pila;
        this.vista = vista;
    }

    public void evaluar(String expresion) {
        String[] tokens = expresion.split(" ");

        for (String token : tokens) {
            if (esOperando(token)) {
                pila.apilar(Integer.parseInt(token));
            } else if (esOperador(token)) {
                int operando2 = pila.desaPilar();
                int operando1 = pila.desaPilar();
                int resultado = realizarOperacion(operando1, operando2, token);
                pila.apilar(resultado);
                vista.mostrarOperaciones(operando1 + " " + token + " " + operando2 + " = " + resultado);
            }
        }

        int resultadoFinal = pila.desaPilar();
        vista.mostrarResultado(resultadoFinal);
    }

    private boolean esOperando(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private int realizarOperacion(int operando1, int operando2, String operador) {
        switch (operador) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                return operando1 / operando2;
            default:
                throw new RuntimeException("Operador no soportado: " + operador);
        }
    }
}
    
    

