/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;
import vista.*;

/**
 *
 * @author Lenovo
 */
public class ControladorRefrigerado {
    private final VistaRefrigerado VistaRefrigerado;
    private final VistaFRefrigerado VistaFRefrigerado;
    private final  ModeloRefrigerado  modeloRefrigerado;
    
    public ControladorRefrigerado (VistaRefrigerado VistaRefrigerado, VistaFRefrigerado VistaFRefrigerado, ModeloRefrigerado modeloRefrigerado ){
         this.VistaRefrigerado=VistaRefrigerado;
        this.VistaFRefrigerado = VistaFRefrigerado;
        this.modeloRefrigerado= modeloRefrigerado;
        
    }
    
    public void iniciar (){
        VistaRefrigerado.setTitle("Producto Refrigerado ");
        VistaRefrigerado.setLocationRelativeTo(null);
    }
    
}
