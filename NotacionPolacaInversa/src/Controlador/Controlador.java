/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PilaModelo;
import Modelo.Validar;
import Vista.Vista;

/**
 *
 * @author Lenovo
 */
class Controlador {
   
    public void evaluar(String expresion) {
        String[] tokens = expresion.split(" "); // Divide la expresión por espacios
        
        for (String token : tokens) {
            if (esNumero(token)) {
                pila.push(Integer.parseInt(token)); // Si es un número, apilarlo
            } else {
                // Si es un operador, desapilar los operandos y realizar la operación
                int b = pila.pop();
                int a = pila.pop();
                int resultado = realizarOperacion(a, b, token);
                pila.push(resultado); // Apilar el resultado
            }
        }

        // Mostrar el resultado final usando la vista
        vista.mostrarResultado(pila.pop());
    }

    // Método auxiliar para verificar si el token es un número
    private boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Método para realizar las operaciones básicas
    private int realizarOperacion(int a, int b, String operador) {
        switch (operador) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }
}


