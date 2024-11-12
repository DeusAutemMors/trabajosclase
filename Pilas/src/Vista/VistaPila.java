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
public class VistaPila {
    
    private Scanner entrada;
    
    public VistaPila (){
        entrada=new Scanner (System.in);
        
    }
    public int mostrarMenu (){
        System.out.println("Menu pila");
        System.out.println("Apilar");
        System.out.println("Desapilar");
        System.out.println("ver pila ");
        System.out.println("Salir");
        System.out.println(" ingrese una opcion valida ");
        return entrada.nextInt();
        
        
        
    }
    
    public int perdirNumero(){
        System.out.println("ingresa el dato");
        return entrada.nextInt();
    }
    
    public  void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    
    public void monstrarNumero (int numero){
        System.out.println("El numero es :"+ numero );
        
    }
}
