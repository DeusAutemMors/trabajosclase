/*
 Docente:Magda Pineda
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que representa la informacion del Modelo Crear 
Fecha: 05 / 04   2024
Autor: Daniel Mauricio Gil Sosa
 */
package modelo;

/**
 *
 * @author Lenovo
 */
public class ModeloCrear {
    
    String nombreUsuario, correoElectronica, contraseña1;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoElectronica() {
        return correoElectronica;
    }

    public void setCorreoElectronica(String correoElectronica) {
        this.correoElectronica = correoElectronica;
    }

    public String getContraseña1() {
        return contraseña1;
    }

    public void setContraseña1(String contraseña1) {
        this.contraseña1 = contraseña1;
    }
    
}
