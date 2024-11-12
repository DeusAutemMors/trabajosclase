/*
 Doncete: Magda Pineda
Universidad Juan De castelllanos
Asignatura: Programacion Orientada A Objetos
Descripcion: Clase que representa la informacion general de empleados asalariados 
Fecha: 1 marzo 24
Autor: Daniel Mauricio Gil Sosa
 */
package modeloAsalariado;

/**
 *
 * @author Lenovo
 */
public class ModeloAsalariado extends Modelo {

    public String getSueldoB() {
        return SueldoB;
    }

    public void setSueldoB(String SueldoB) {
        this.SueldoB = SueldoB;
    }

    public String getBonificaCion() {
        return BonificaCion;
    }

    public void setBonificaCion(String BonificaCion) {
        this.BonificaCion = BonificaCion;
    }

    public String getPorcentajeR() {
        return PorcentajeR;
    }

    public void setPorcentajeR(String PorcentajeR) {
        this.PorcentajeR = PorcentajeR;
    }
    
     String SueldoB, BonificaCion, PorcentajeR;
    
}
