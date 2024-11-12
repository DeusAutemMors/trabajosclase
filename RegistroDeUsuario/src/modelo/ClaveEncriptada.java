/*
Docente:Magda Pineda
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que representa la informacion de las claves incriptadas 
Fecha: 05 / 04   2024
Autor: Daniel Mauricio Gil Sosa
 */
package modelo;

/**
 *
 * @author Lenovo
 */
public class ClaveEncriptada {
     private final static String caracteresOriginales = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String caracteresEncriptados = "!@#$%^&*()_+{}:\"<>?|[];',./abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static char encriptar(char caracterOriginal) {
        int indice = caracteresOriginales.indexOf(caracterOriginal);
        if (indice != -1) {
            return caracteresEncriptados.charAt(indice);
        } else {
            return caracterOriginal;
        }
    }

    public static String encriptar(String textoOriginal) {
        StringBuilder textoEncriptado = new StringBuilder();
        for (int i = 0; i < textoOriginal.length(); i++) {
            textoEncriptado.append(encriptar(textoOriginal.charAt(i)));
        }
        return textoEncriptado.toString();
    }

    public static char desencriptar(char caracterEncriptado) {
        int indice = caracteresEncriptados.indexOf(caracterEncriptado);
        if (indice != -1) {
            return caracteresOriginales.charAt(indice);
        } else {
            return caracterEncriptado;
        }
    }

    public static String desencriptar(String textoEncriptado) {
        StringBuilder textoDesencriptado = new StringBuilder();
        for (int i = 0; i < textoEncriptado.length(); i++) {
            textoDesencriptado.append(desencriptar(textoEncriptado.charAt(i)));
        }
        return textoDesencriptado.toString();
    }
    
}
