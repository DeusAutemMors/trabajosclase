/*
Docente:Magda Pineda
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que representa la informacion del modelo buses 
Fecha: 05 / 04   2024
Autor: Daniel Mauricio Gil Sosa
 */
package modelo;

/**
 *
 * @author Lenovo
 */
public class ModeloBuses {
    
     public static String  Marca, Modelo, Placa, Tipo;

    public static String getMarca() {
        return Marca;
    }

    public static void setMarca(String Marca) {
        ModeloBuses.Marca = Marca;
    }

    public static String getModelo() {
        return Modelo;
    }

    public static void setModelo(String Modelo) {
        ModeloBuses.Modelo = Modelo;
    }

    public static String getPlaca() {
        return Placa;
    }

    public static void setPlaca(String Placa) {
        ModeloBuses.Placa = Placa;
    }

    public static String getTipo() {
        return Tipo;
    }

    public static void setTipo(String Tipo) {
        ModeloBuses.Tipo = Tipo;
    }
    
}
