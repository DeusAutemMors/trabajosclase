/*
 Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que responde a las acciones realizadas por el usuario en el controlador Buses
Fecha: 5/04  2024
Autor: Daniel Mauricio Gil Sosa
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.ModeloBuses;
import modelo.ModeloTaxi;
import vista.VistaBuses;
import vista.VistaTaxis;

/**
 *
 * @author Lenovo
 */
public class ControladorBuses implements ActionListener {
    
     private final ModeloBuses model;
    private VistaBuses view;

    public ControladorBuses(VistaBuses view) {
        this.view = view;
         this.model = null;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
