/*
 Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que responde a las acciones realizadas por el usuario en el controlador empleado Asalariado 
Fecha: 1 De Marzo 2024
Autor: Daniel Mauricio Gil Sosa
 */
package controladorEmpleado;

import modeloAsalariado.ModeloAsalariado;
import modeloAsalariado.ModeloHora;
import vistaEmpleado.EmpleadoAsalariado;
import vistaEmpleado.EmpleadoHora;

/**
 *
 * @author Lenovo
 */
public class ControladorAsalariado {
    
     private ModeloAsalariado model;
    private EmpleadoAsalariado view;
    
private final EmpleadoAsalariado  empleadoAsalariado ;
    public ControladorAsalariado(vistaEmpleado.EmpleadoAsalariado empleadoAsalariado, ModeloAsalariado modeloAsalariado) {
        this.empleadoAsalariado = empleadoAsalariado;
    }
    
    public void iniciar (){
        empleadoAsalariado.setTitle("Empleado Asalariado");
        empleadoAsalariado.setLocation(null);
    }
    
    
    
    
}
