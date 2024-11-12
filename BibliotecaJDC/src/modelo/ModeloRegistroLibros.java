/*
 Docente:Magda Pineda
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que representa la informacion del modelo libros
Fecha: 9 / 05  2024
Autor: Daniel Mauricio Gil Sosa
 */
package modelo;

/**
 *
 * @author Lenovo
 */
public class ModeloRegistroLibros {
    
    String Titulo;
    String autor;
    String AñoPublicacion;
    String ISBN;

    public ModeloRegistroLibros(String Titulo, String autor, String AñoPublicacion, String ISBN) {
        this.Titulo = Titulo;
        this.autor = autor;
        this.AñoPublicacion = AñoPublicacion;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAñoPublicacion() {
        return AñoPublicacion;
    }

    public void setAñoPublicacion(String AñoPublicacion) {
        this.AñoPublicacion = AñoPublicacion;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    
}
