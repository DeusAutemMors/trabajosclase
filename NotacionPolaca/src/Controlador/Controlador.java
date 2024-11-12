/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PilaModelo;
import Vista.Vista;

public class Controlador {
    private PilaModelo pila;
    private Vista vista;

 
    public Controlador(PilaModelo pila, Vista vista) {
        this.pila = pila;
        this.vista = vista;
    }

 
    public void evaluar(String expresion) {
        String[] tokens = expresion.split(" "); 
        
        for (String token : tokens) {
            if (esNumero(token)) {
                pila.push(Integer.parseInt(token)); 
            } else {
               
                int b = pila.pop();
                int a = pila.pop();
                int resultado = realizarOperacion(a, b, token);
                pila.push(resultado);
            }
        }

 
        vista.mostrarResultado(pila.pop());
    }

    
    private boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    
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
                throw new IllegalArgumentException("Operador no valido: " + operador);
        }
    }
}
