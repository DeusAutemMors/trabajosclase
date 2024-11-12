/*Docente:Magda Pineda
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que representa la informacion del modelo Empleados
Fecha: 1 De Marzo 2024
Autor: Daniel Mauricio Gil Sosa
 
 */
package modeloAsalariado;

/**
 *
 * @author Lenovo
 */
public class Modelo {

    String NombreE = "";
    String EdadE;
    String Pro;
    String Dep;

    public String getPro() {
        return Pro;
    }

    public void setPro(String Pro) {
        this.Pro = Pro;
    }

    public String getDep() {
        return Dep;
    }

    public void setDep(String Dep) {
        this.Dep = Dep;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getEdadE() {
        return EdadE;
    }

    public void setEdadE(String EdadE) {
        this.EdadE = EdadE;
    }

}
