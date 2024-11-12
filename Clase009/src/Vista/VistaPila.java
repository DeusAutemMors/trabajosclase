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
    private Scanner scanner;
    
    public VistaPila(){
        scanner=new Scanner (System.in );
    }
    public String pedirExpresion(){
        System.out.println("ingrese la expresion ");
        return scanner.nextLine();
    }
    
    public void mostrarResultados(boolean balanceado){
        if(balanceado){
            System.out.println("La expresion esta balanceada");
        }else{
            System.out.println("La expresion no esta balanceada");
        }
        
    }
}
