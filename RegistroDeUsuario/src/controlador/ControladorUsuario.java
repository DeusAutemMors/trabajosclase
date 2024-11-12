/*
 Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que responde a las acciones realizadas por el usuario en el controlador 
Fecha: 5/04  2024
Autor: Daniel Mauricio Gil Sosa
 */
package controlador;

import modelo.ModeloUsuario;
import vista.VistaUsuario;

/**
 *
 * @author Lenovo
 */
public class ControladorUsuario {
    private final VistaUsuario vistaUsuario;

    public ControladorUsuario(VistaUsuario vistaUsuario, ModeloUsuario modeloUsuario) {
        this.vistaUsuario = vistaUsuario;
    }

    public void iniciar() {
        vistaUsuario.setTitle("EJEMPLO USUARIO");
        vistaUsuario.setLocationRelativeTo(null);
    }

}
