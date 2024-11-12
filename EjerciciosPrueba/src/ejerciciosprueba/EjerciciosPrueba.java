/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosprueba;

/**
 *
 * @author Lenovo
 */
public class EjerciciosPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nodo primer = new Nodo ("Ejemplo");
        Nodo Dos= new Nodo (45);
        Nodo tres= new Nodo ("Hola");
        
        
        primer.enlazar(Dos);
        primer.ObtenerSiguiente(Dos).enlazar(tres);
        System.out.println(primer.ObtenerSiguiente(Dos).toString());        // TODO code application logic here
    }
    
}
