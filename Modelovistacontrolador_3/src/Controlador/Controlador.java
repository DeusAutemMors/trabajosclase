/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import static Vista.Vista.Fcaducidad;
import static Vista.Vista.NumeroLote;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


/**
 *
 * @author Lenovo
 */
public class Controlador implements ActionListener {
   private Vista vistaProducto;
    
    private Modelo modeloProducto;

    
     /*Constructores*/
    public Controlador(Vista vistaProducto, Modelo modeloProducto) {
        this.vistaProducto = vistaProducto;
        this.modeloProducto = modeloProducto;
        
        /*Llamada de Botones*/
        this.vistaProducto.JB_ProductosFrescos.addActionListener(this); 
        this.vistaProducto.jBRefrigerado.addActionListener(this);
        this.vistaProducto.JB_ProductosCongelados.addActionListener(this);
        
    }
    
    /*Titulo*/
    public void iniciar(){
        vistaProducto.setTitle("EJEMPLO PRODUCTOS");
        vistaProducto.setLocationRelativeTo(null);
    }
    
    /*Obtiene los datos ingresados y almacena los datos*/
    public void actionPerfomed (ActionEvent e) {
        modeloProducto.setFcaducidad(vistaProducto.JTF_Caducidad.getText());
        modeloProducto.setLNumeroLote(vistaProducto.JTF_NumeroLote.getText());
        
    }

    
    /*Metodos Abstractos*/
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
