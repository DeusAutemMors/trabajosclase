/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modelovistacontrolador;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Vista;


/**
 *
 * @author Lenovo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo mod= new Modelo();
        Vista ver = new Vista ();  
        Controlador control= new Controlador (ver, mod);
        control.iniciar ();
        ver.setVisible(true);
        // TODO code application logic here
    }
    
}
