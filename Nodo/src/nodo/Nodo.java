/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodo;

/**
 *
 * @author Lenovo
 */
public class Nodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimple  lista=new  ListaSimple();
        
        lista.agregar(2);
        lista.agregar(5);
        lista.agregar(10);
        
        System.out.println("Lista despues de agregar elementos");
        lista.mostralLista();
        
        lista.eliminar();
        System.out.println("Lista despues de eliminar elemento");
        lista.mostralLista();
    }
    
}
