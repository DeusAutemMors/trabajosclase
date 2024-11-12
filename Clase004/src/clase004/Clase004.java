/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase004;

import Controlador.Controlador;
import Modelo.Lista;
import Modelo.Nodo;
import Vista.Vista;

/**
 *
 * @author Lenovo
 */
public class Clase004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lista lista=new Lista();
       Vista vista= new Vista();
       Controlador controlador= new Controlador(lista, vista);
       controlador.iniciar();
    }
    
}
