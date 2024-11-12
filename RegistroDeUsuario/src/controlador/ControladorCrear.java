/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.ModeloCrear;
import vista.VistaCrear;

/**
 *
 * @author Lenovo
 */
public class ControladorCrear {
    
    private final VistaCrear vistaCrear;

    public ControladorCrear(VistaCrear vistaCrear,
            ModeloCrear modeloCrear) {
        this.vistaCrear = vistaCrear;
    }

    public void iniciar() {
        vistaCrear.setTitle("EJEMPLO CREAR USUARIO");
        vistaCrear.setLocation(null);
    }
    
}
