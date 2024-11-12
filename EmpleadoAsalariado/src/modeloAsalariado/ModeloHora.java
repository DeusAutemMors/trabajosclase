/*
Doncete: Magda Pineda
Universidad Juan De castelllanos
Asignatura: Programacion Orientada A Objetos
Descripcion: Clase que representa la informacion de empleados x hora
Fecha: 1 marzo 24
Autor: Daniel Mauricio Gil Sosa
 */
package modeloAsalariado;

/**
 *
 * @author Lenovo
 */
public class ModeloHora extends Modelo {
    
   int HorasTra, ValorH, resulta;
   int v=37000;

    public int getResulta() {
        return resulta;
    }

    public void setResulta(int resulta) {
        this.resulta = resulta;
    }

   @Override
    public String getNombreE() {
        return NombreE;
    }

   @Override
    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getEdadE() {
        return EdadE;
    }

    public void setEdadE(String EdadE) {
        this.EdadE = EdadE;
    }

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

    public int getHorasTra() {
        return HorasTra;
    }

    public void setHorasTra(int HorasTra) {
        this.HorasTra = HorasTra;
    }

    public int getValorH() {
        return ValorH;
    }

    public void setValorH(int ValorH) {
        this.ValorH = ValorH;
    }
    
    public int multiplicacion (){
         this.resulta=this.HorasTra * this.v;
       
       return this.getResulta();
       
    }
}
