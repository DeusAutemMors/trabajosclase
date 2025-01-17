/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Pila {
    
    private Nodo cima;
    
    
    public Pila(){
        this.cima=null;
    }
    
    //metodo para apilar o ingresar a la pila
    
    public void apilar(char valor ){
        
        Nodo nuevoNodo= new Nodo( valor);
        nuevoNodo.siguiente=new Nodo(valor);
        nuevoNodo.siguiente=cima;
        cima=nuevoNodo;
        
    }
    public char desapilar(){
        if (esVacia()){
            System.out.println("La pila esta vacia");
} 
        
        char valor=cima.dato;
        cima=cima.siguiente;
        return valor;
    }
    
    public char verCima(){
        if(esVacia()){
            System.out.println("La pila esta vacia");
        }
        
        return cima.dato;
    }
    
           
    
    public boolean esVacia (){
        return cima==null;
    }
}
