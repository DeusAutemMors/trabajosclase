/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodomvc;

import Controlador.ListaControlador;
import Modelo.ListaSimple;
import Vista.ListaVista;

/**
 *
 * @author Lenovo
 */
public class NodoMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaSimple modelo= new ListaSimple();
        ListaVista vista=new ListaVista();
        ListaControlador controlador=new ListaControlador (modelo, vista);
        
        
        controlador.agregarelemento(1);
        controlador.agregarelemento(6);
        controlador.agregarelemento(9);
        controlador.agregarelemento(25);
        
        
        vista.mostrarMensaje("lista despues de agregar un elemento");
        controlador.mostrarLista();
        
        //eliminar un elemento 
        controlador.eliminarelemento();
        vista.mostrarMensaje("lista despues de eliminar un elemento");
        controlador.mostrarLista();
    }
    
}
