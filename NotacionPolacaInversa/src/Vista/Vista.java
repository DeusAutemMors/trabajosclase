/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Vista {
     private Scanner scanner;
     
     
     public void mostrarResultado (int resultado){
         System.out.println("");
     }
     
     public void mostrarOperaciones(String operaciones){
         System.out.println("Evaluando"+ operaciones );
     }
     
    public String pedirExpresion(){
        
        System.out.println("Ingresa la expresion");
        return scanner.nextLine();
        
    }
         
     
}
