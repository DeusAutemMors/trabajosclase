/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Pla {

    private Nodo cima;
    int size;

    public Pla() {
        cima = null;
        this.size = 0;

    }

    public boolean pilaVacia() {

        return cima == null;
    }

    public void apilar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (pilaVacia()) {
            nuevoNodo = cima;
        } else {
            nuevoNodo.siguiente = cima;
            cima = nuevoNodo;

        }
        size++;

    }
        //metodo para eliminar una pila 
    
    public int desaPilar(){
        
        if (pilaVacia()){
            throw new RuntimeException ("la pila esta vacia ");
        }
        
        int valor= cima.dato;
        cima=cima.siguiente;
        return valor;
    }
       public void mostrarPila(){
           if(pilaVacia()){
               System.out.println("La pila esta vacia");
               return;
           }else{
               Nodo actual=cima;
               while(actual!=null){
                   System.out.println(actual.dato);
                   actual=actual.siguiente;
                   
               }
           }
        
        
    }
       
       public int ultimo(){
           if(pilaVacia()){
               throw new RuntimeException ("pila esta vacia");
               
           }else{
               return cima.dato; 
           }
       }
       
       public void Apilarr (int dato) {
           
           Nodo nuevoNodo=new Nodo(dato);
           
           if(cima==null){
               
               cima=nuevoNodo;
               
           } else {
               
               if (dato==cima.dato+1){
                   nuevoNodo.siguiente=cima;
                   cima=nuevoNodo;
                   
               } else {
                   System.out.println("El dato no cumple con la condicion");
               }
           }
    
}
    
   
    
    

}
