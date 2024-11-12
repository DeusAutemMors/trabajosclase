/*
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que responde a las acciones realizadas por el usuario en el controlador 
Fecha: 5/04  2024
Autor: Daniel Mauricio Gil Sosa
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.VistaGeneral;

/**
 *
 * @author Lenovo
 */
public class Controlador implements ActionListener{
    private VistaGeneral vistaGeneral;

    public Controlador(VistaGeneral vistaGeneral) {
        this.vistaGeneral = vistaGeneral;
    }
    

    public Controlador() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
    
    
    
    
}
