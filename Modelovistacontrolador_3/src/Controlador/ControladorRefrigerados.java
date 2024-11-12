/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*; 

import Modelo.ModeloProRefrigerado;
import Vista.PFRefrigerados;
import Vista.ProRefrigerados;

/**
 *
 * @author Lenovo
 */
public class ControladorRefrigerados {
    
     private ProRefrigerados ProRefrigerados;
    private PFRefrigerados  PFRefrigerados;
    private  ModeloProRefrigerado ModeloProRefrigerado;
    
    
    /*Controlador*/
    public Controlador Refrigerado(ProRefrigerados ProRefrigerados, PFRefrigerados  PFRefrigerados, ModeloProRefrigerado ModeloProRefrigerado) {
        this.ProRefrigerados = ProRefrigerados;
        this.PFRefrigerados = PFRefrigerados;
        this.ModeloProRefrigerado = ModeloProRefrigerado;
         return null;

    }
    /*Titulo*/
    public void iniciar(){
        ProRefrigerados.setTitle("PRRODUCTO REFRIGERADO");
       ProRefrigerados.setLocationRelativeTo(null);
    }
    

    
    
}
