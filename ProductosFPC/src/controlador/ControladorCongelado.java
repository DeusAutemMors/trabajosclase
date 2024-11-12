/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ModeloCongelado;
import modelo.ModeloRefrigerado;
import vista.VistaCongelado;
import vista.VistaFCongelado;
import vista.VistaFRefrigerado;
import vista.VistaRefrigerado;


/**
 *
 * @author Lenovo
 */
public class ControladorCongelado {
    
    private final VistaCongelado vistaCongelado;
   
    private final VistaFCongelado VistaFCongelado;
    private final  ModeloCongelado  modeloCongelado;
    
    public ControladorCongelado(VistaCongelado vistaCongelado,VistaFCongelado vistaFCongelado,ModeloCongelado modeloCongelado){
         this.vistaCongelado = vistaCongelado;
        this.VistaFCongelado = vistaFCongelado;
        this.modeloCongelado= modeloCongelado;
        
    }
    
     public void iniciar (){
        vistaCongelado.setTitle("Producto fresco");
        vistaCongelado.setLocation(null);
    }
    
    
    
}
