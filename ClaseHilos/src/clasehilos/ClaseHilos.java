/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasehilos;

import Controlador.ControladorHilos;
import ModeoHilo.ModeloHilo;

import Vista.VistaHilo;
import vista.VistaEjecucion;

/**
 *
 * @author Lenovo
 */
public class ClaseHilos {

    public static void main(String[] args) {
        VistaHilo vistaHilo = new VistaHilo();
        VistaEjecucion vistaEjecucion = new VistaEjecucion();
        ModeloHilo modeloHilo = new ModeloHilo();
        new ControladorHilos(vistaHilo, vistaEjecucion, modeloHilo);
    }
    
}
