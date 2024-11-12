/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Validar {
    
   private Pila pila;
   
    public Validar(){
        pila=new Pila();
        
    }
    
    //metodo para validar si la expresion esta balanceada 
    
    public boolean esBaleanceado (String expresion){
        for (int i = 0; i < expresion.length(); i++) {
           char caracter=expresion.charAt(i);
        
        
        if( caracter=='('||caracter == '{' || caracter =='['){
            pila.apilar(caracter);
            
        }
        
         if(caracter==')'||caracter== '}' || caracter ==']'){
            if(pila.esVacia()){
                return false;
            }
            char cima=pila.desapilar();
            if (!iguales (cima,caracter)){
                return false;
            } 
     
        }
        }
       return pila.esVacia(); 
    }
    
    public boolean iguales (char apertura,char cierre){
        return (apertura=='('&& cierre ==')')||
                (apertura=='{' && cierre =='}')||
                (apertura=='[' && cierre ==']');
    }
    
}

