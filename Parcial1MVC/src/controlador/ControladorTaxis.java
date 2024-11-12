/*
 Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que responde a las acciones realizadas por el usuario en el controlador Taxis
Fecha: 5/04  2024
Autor: Daniel Mauricio Gil Sosa
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloTaxi;
import vista.VistaTaxis;

/**
 *
 * @author Lenovo
 */
public class ControladorTaxis implements ActionListener {

   private final ModeloTaxi model;
    private VistaTaxis view;

    public ControladorTaxis(ModeloTaxi model, VistaTaxis view) {
        this.model = model;
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 
}
