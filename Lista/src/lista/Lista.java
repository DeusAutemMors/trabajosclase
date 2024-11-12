/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Lista {
    
    

    private Nodo cabeza;
    public void lista(){
        
        cabeza= null;
        
       
    }
    
    public void AgregarTarea (String tarea){
        
        Nodo nuevoNodo = new Nodo(tarea);
        
        if(cabeza == null){
            cabeza = nuevoNodo;
        }
        
        
        
       
    }
}

