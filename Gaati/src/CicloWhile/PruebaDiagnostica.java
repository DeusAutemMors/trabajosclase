/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CicloWhile;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class PruebaDiagnostica {

    private static Object scanner;
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        String nombre = "Daniel Mauricio Gil Sosa"; 
        int edad =0;
        int n1=0;
        int n2=0;
       
        
        System.out.println("Digite su nombre");
        nombre= scanner.next();
        System.out.println("Digite su edad");
        edad = scanner.nextInt();
        if (edad >= 18 ) {
            System.out.println("Se puede matricular");
        } else { 
            System.out.println("No se puede matricular");
        
        
        }
        
        System.out.println("Digite al semestre que ingresara");
   
        n1 = scanner.nextInt();
        
        if (n1<= 5){
            System.out.println("Su semestre esta en 2000");
        }
        if (n1>5  ){
            System.out.println("Su semestre esta en 5000");
        
    } 
        if (n1>9){
            System.out.println("Su semestre esta en 10000");
        }
        
        System.out.println("Tiene hermanos con los que estudiara en la universidad (si=1) (no=2)");
        n2= scanner.nextInt();
        if (n2==1){
            System.out.println("La matricula le dara un descuento del 50%");
        }
        if (n2==2){
            System.out.println("La matricula no tendra descuento");
        }
        
        
       
    }
    
}
