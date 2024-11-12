/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package IF;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        
        int edad;
        
   
        System.out.println("Digite su Edad ");
        edad=leer.nextInt();
        
        if (edad < 18){
            System.out.println("Es menor de edad");
        }
     if (edad >=18){
         System.out.println("Es mayor de edad");
         
     }
        // TODO code application logic here
    }
    
}
