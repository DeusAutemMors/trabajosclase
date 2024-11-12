/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase009;

import Controlador.ControldorPila;
import Modelo.Validar;
import Vista.VistaPila;

/**
 *
 * @author Lenovo
 */
public class Clase009 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validar validar= new Validar();
        VistaPila vista= new VistaPila();
        ControldorPila controlador= new ControldorPila(vista, validar);
       controlador.iniciar();
        
        // TODO code application logic here
    }
    
}
