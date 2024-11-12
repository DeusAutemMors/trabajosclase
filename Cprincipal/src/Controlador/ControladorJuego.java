/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaCircular;
import Vista.VistaJuego;

public class ControladorJuego {
    private ListaCircular listaJugadores;
    private VistaJuego vista;

    public ControladorJuego(ListaCircular listaJugadores, VistaJuego vista) {
        this.listaJugadores = listaJugadores;
        this.vista = vista;
    }

    public void iniciarJuego() {
        boolean salir = false;

        while (!salir) {
            vista.mostrarMenu();
            int opcion = vista.leerOpcion();

            switch (opcion) {
                case 1:
                    agregarJugador();
                    break;
                case 2:
                    mostrarJugadores();
                    break;
                case 3:
                    eliminarJugador();
                    break;
                case 4:
                    jugarTurno();
                    break;
                case 5:
                    salir = true;
                    vista.monstrarMensaje("Gracias por jugar.");
                    break;
                default:
                    vista.monstrarMensaje("Opción no válida.");
            }
        }
    }

    private void agregarJugador() {
        vista.monstrarMensaje("Ingrese el nombre del jugador:");
        String nombre = vista.leerNombre();
        listaJugadores.agregarJugador(nombre);
        vista.monstrarMensaje("Jugador " + nombre + " ha sido agregado.");
    }

    private void mostrarJugadores() {
        String jugadores = listaJugadores.mostrarJugadores();
        vista.monstrarMensaje(jugadores);
    }

    private void eliminarJugador() {
        vista.monstrarMensaje("Ingrese el nombre del jugador a eliminar:");
        String nombre = vista.leerNombre();
        boolean eliminado = listaJugadores.eliminarJugador(nombre);
        if (eliminado) {
            vista.monstrarMensaje("Jugador " + nombre + " ha sido eliminado.");
        } else {
            vista.monstrarMensaje("Jugador no encontrado.");
        }
    }

    private void jugarTurno() {
        String mensaje = listaJugadores.jugar();
        vista.monstrarMensaje(mensaje);
    }
}
