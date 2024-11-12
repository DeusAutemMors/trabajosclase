/*
Docente:Magda Pineda
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que representa la informacion del modelo taxis
Fecha: 05 / 04   2024
Autor: Daniel Mauricio Gil Sosa
 */
package modelo;

/**
 *
 * @author Lenovo
 */
public class ModeloTaxi {
    
    String  Marca, Modelo, Placa, Tipo;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
