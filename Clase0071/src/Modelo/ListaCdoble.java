/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class ListaCdoble {
    private Nodo cabeza;
    private Nodo cola;
    
    public ListaCdoble (){
        
        cabeza=null;
        cola=null;
        
    }
    
    public boolean esVacia(){
        return cabeza==null;
        
    }
    
    public void agregarInicio(int dato){
        
        Nodo nuevoNodo=new Nodo(dato);
        if(esVacia()){
            cabeza=nuevoNodo;
            cola=nuevoNodo;
            cabeza.siguiente=nuevoNodo;
            cola.anterior=nuevoNodo;
        }else{
            cabeza.anterior=nuevoNodo;
            nuevoNodo.siguiente=cabeza;
            nuevoNodo=cabeza;
            cola.siguiente=cabeza;
        }
    }
        
        public void agregarFinal(int dato){
            Nodo nuevoNodo=new Nodo (dato);
            
            if (esVacia()){
                cabeza=nuevoNodo;
                cola=nuevoNodo;
                cabeza.siguiente=nuevoNodo;
                cola.anterior=nuevoNodo;
            }else{
                cola.siguiente=nuevoNodo;
                nuevoNodo.anterior=cola;
                nuevoNodo=cola;
                cola.siguiente=cabeza;
            }
        }
        
        
        public void mostrarListaDesdeCabeza(){
            if(!esVacia()){
                Nodo actual = cola;
                do{
                    System.out.println(actual.dato+"");
                    actual =actual.anterior;
                    
                }while(actual!=null);
                System.out.println("");
            }
        }

        public void  mostrarListaDesdeCola (){
            
            if(!esVacia()){
                Nodo actual= cola;
                
                do{
                    System.out.println(actual.dato);
                    actual=actual.anterior;
                    
                } while (actual!=cola);
                System.out.println();
                
            }
        }
    }


