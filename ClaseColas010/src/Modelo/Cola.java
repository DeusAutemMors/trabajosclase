/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Cola {
    
   private  Nodo frente; 
   private Nodo fondo;
   
   public Cola(){
       this.fondo=null;
       this.frente=null;
       
   }
            
       public boolean esVacia (){
           
           return frente==null;
       }     
            
            public void encolar (int dato){
                Nodo nuevo=new  Nodo(dato);
                if(esVacia()){
                    frente=fondo=nuevo;
                    fondo=nuevo;
                }
            }
            public int desencolar (){
                if(esVacia()){
                    System.out.println("La cola esta vacia");
                    return -1;
                    
                }else{
                    int dato=frente.dato;
                    if (frente==null){
                        fondo=null;
                    }
                    return dato;
                }
                
                
            } 
            
            public void mostrarCola(){
                if (esVacia()){
                    System.out.println("La lista esta vacia");
                    return;
                }
                Nodo actual=frente;
                
              while (actual!=null){
                  System.out.println(actual.dato+"");
                  actual=actual.siguiente;
              }
                System.out.println();
            }
           
}
