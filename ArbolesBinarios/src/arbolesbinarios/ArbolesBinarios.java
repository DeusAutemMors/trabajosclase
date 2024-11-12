/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arbolesbinarios;

import Controlador.ControladorArbol;
import Modelo.ArbolBinario;
import Vista.VistaArbol;

/**
 *
 * @author Lenovo
 */
public class ArbolesBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArbolBinario modelo= new ArbolBinario();
       VistaArbol view= new VistaArbol();
       ControladorArbol Con=new ControladorArbol(modelo,view);
       Con.mostrar();
        
        // TODO code application logic here
    }
    
}
