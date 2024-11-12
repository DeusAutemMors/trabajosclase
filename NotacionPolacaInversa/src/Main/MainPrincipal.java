/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Modelo.PilaModelo;
import Vista.Vista;

/**
 *
 * @author Lenovo
 */
public class MainPrincipal {
    
    
    public static void main(String[] args) {
        PilaModelo pila = new PilaModelo();
        Vista vista = new Vista();
        Controlador  controlador = new Controlador(pila, vista);

        
        String expresion = "3 4 + 5 *";
        controlador.evaluar(expresion);
    }
}
    

