/*
  Docente:Magda Pineda
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que representa la informacion del modelo Registro Usuarios
Fecha: 9 / 05  2024
Autor: Daniel Mauricio Gil Sosa
 */
package modelo;

/**
 *
 * @author Lenovo
 */
public class ModeloRegistroUsuarios {
    
    String nombre;
    String identificacion;
    int contacto;

    public ModeloRegistroUsuarios(String nombre, String identificacion, int contacto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }
    
    
}
