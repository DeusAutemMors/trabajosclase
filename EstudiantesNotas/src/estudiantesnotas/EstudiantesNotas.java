/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiantesnotas;

import Modelo.modelo;
import controlador.Controlador;
import vista.Vista;

/**
 *
 * @author Lenovo
 */
public class EstudiantesNotas {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
     modelo model= new modelo (0,0);
     Vista view = new Vista();
     Controlador control= new Controlador(model, view);
     control.iniciar();
    }
    
}
