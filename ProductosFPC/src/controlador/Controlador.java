/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;
import static vista.VistaProductosFPC.NumeroLote;

/**
 *
 * @author Lenovo
 */
public class Controlador implements ActionListener {
    
    private VistaProductosFPC vistaProducto;
    
    private Modelo modeloProducto;
    
    
    public Controlador (VistaProductosFPC vistaProductosFPC, Modelo modelo){
        this.vistaProducto= vistaProductosFPC;
        this.modeloProducto=modelo;
        
        this.vistaProducto.JB_PFrescos.addActionListener(this);
        this.vistaProducto.JB_PRefrigerados.addActionListener(this);
        this.vistaProducto.JB_PCongelados.addActionListener(this);
    }
    
    public void iniciar () {
        vistaProducto.setTitle("ProductosFPC");
        vistaProducto.setLocationRelativeTo(null);
    }
    
    public void actionPerfomed (ActionEvent e){
        modeloProducto.setFechaCaducidad(vistaProducto.JTF_Caducidad.getText());
        modeloProducto.setNumeroLote(vistaProducto.JTF_NumLote.getText());
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet.");

    
}
    
}
