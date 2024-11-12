/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Modelo;

/**
 *
 * @author Lenovo
 */
public class Controlador {
    public static void realizarOperacion(String num1, String num2, String operacion) {
        try {
            int Numero1 = Integer.parseInt(num1);
            int Numero2 = Integer.parseInt(num2);
            
            if (Numero1 < 0 || Numero2 < 0) {
                throw new IllegalArgumentException("¡Los números no pueden ser negativos!");
            }

            int resultado = Modelo.realizarOperacion(Numero1, Numero2, operacion);
            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos en los campos de entrada");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
