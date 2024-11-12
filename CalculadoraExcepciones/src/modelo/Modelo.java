/*
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que representa la informacion del modelo Empleados
Fecha: 7 De mayo 2024
Autor: Daniel Mauricio Gil Sosa
 
 */
package modelo;

/**
 *
 * @author Lenovo
 */
public class Modelo {
    
     public static int realizarOperacion(int numero1, int numero2, String operacion) {
        int resultado = 0;
        switch (operacion) {
            case "suma":
                resultado = numero1 + numero2;
                break;
            case "resta":
                resultado = numero1 - numero2;
                break;
            case "multiplicacion":
                resultado = numero1 * numero2;
                break;
            case "division":
                if (numero2 == 0) {
                    throw new ArithmeticException("¡No se puede dividir por cero!");
                }
                resultado = numero1 / numero2;
                break;
        }
        return resultado;
    }
    
}
