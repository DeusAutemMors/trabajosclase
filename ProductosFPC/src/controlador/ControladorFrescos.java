/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ModeloFrescos;
import modelo.ModeloRefrigerado;
import vista.VistaFFrescos;
import vista.VistaFrescos;
import vista.*;





/**
 *
 * @author Lenovo
 */
public class ControladorFrescos {
    private final VistaFrescos VistaFrescos;
    private final VistaFFrescos VistaFFrescos;
    private final  ModeloFrescos  modeloFrescos;
    
    private final VistaFrescos vistaFrescos = null;
    
    public ControladorFrescos (VistaFrescos vistaFrescos, VistaFFrescos vistaFFrescos, ModeloFrescos modeloFrescos){
     
        this.VistaFFrescos= vistaFFrescos;
        this.VistaFrescos= vistaFrescos;
        this.modeloFrescos= modeloFrescos;
        
    }
    
    public void iniciar (){
        vistaFrescos.setTitle("Producto fresco");
        vistaFrescos.setLocation(null);
    }
    
}
