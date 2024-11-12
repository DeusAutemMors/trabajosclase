/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareas;

/**
 *
 * @author Lenovo
 */
public class Tareas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaEnlazada lista= new ListaEnlazada();
        Vista mivista= new Vista();
        Controlador micontrolador = new Controlador(lista,mivista);
        micontrolador.iniciar();
    }
    
}
