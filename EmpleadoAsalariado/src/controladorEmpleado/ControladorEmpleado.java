/*Docente:Magda Pineda
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que responde a las acciones realizadas por el usuario
Fecha: 1 De Marzo 2024
Autor: Daniel Mauricio Gil Sosa
 
 */
package controladorEmpleado;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modeloAsalariado.*;
import vistaEmpleado.*;


public class ControladorEmpleado implements ActionListener {
     private VistaEmpleado vistaEmpleado;
    
    private Modelo modeloAsalariado;
    
      public ControladorEmpleado (VistaEmpleado vistaEmpleado, Modelo modelo){
        this.vistaEmpleado= vistaEmpleado;
        this.modeloAsalariado=modelo;
        
        this.vistaEmpleado.JB_EmpleadoHora.addActionListener(this);
        this.vistaEmpleado.JB_Asalariado.addActionListener(this);
        
    }
    
    public void iniciar () {
        vistaEmpleado.setTitle("Empleados");
        vistaEmpleado.setLocationRelativeTo(null);
    }
    
    public void actionPerfomed (ActionEvent e){
        modeloAsalariado.setNombreE(vistaEmpleado.JL_Nombre.getText());
        modeloAsalariado.setEdadE(vistaEmpleado.JTF_Edad.getText());
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
