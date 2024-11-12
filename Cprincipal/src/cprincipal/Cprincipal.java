/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cprincipal;

import Controlador.ControladorJuego;
import Modelo.ListaCircular;
import Vista.VistaJuego;

/**
 *
 * @author Lenovo
 */
public class Cprincipal {

  public static void main(String[] args) {
      
        ListaCircular listaJugadores = new ListaCircular();
        VistaJuego vista = new VistaJuego();

       
        ControladorJuego controlador = new ControladorJuego(listaJugadores, vista);
        controlador.iniciarJuego();
    }
}