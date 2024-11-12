/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class ListaEnlazada <T> {

    
    
    private Nodo <T> cabeza;
    private Nodo <T> Cola;
    private  int tamanio;
    
    public ListaEnlazada(){
        this.cabeza=null;
        this.Cola=null;
        this.tamanio=0;
        
        
    }
    
    public void agregarAlFinal(T dato){
        Nodo <T> nuevoNodo=new Nodo <>(dato);
        
        if (cabeza ==null) {
            cabeza=Cola=nuevoNodo;
          
            
        }else{
            Cola.siguiente=nuevoNodo;
            nuevoNodo.anterior=Cola;
            Cola=nuevoNodo;
            
        }
        tamanio++;
    }
    public void agregarAlInicio(T dato){
        
        Nodo<T> nuevoNodo=new Nodo <>(dato);
     
        if (cabeza==null) {
            cabeza=Cola=nuevoNodo;
        }else{
            nuevoNodo.siguiente=cabeza;
            cabeza.anterior=nuevoNodo;
            cabeza=nuevoNodo;
            
                  
        }
        tamanio++;
        
    }
    public void eliminar (T dato){
        Nodo <T> actual=cabeza;
        while   (actual!=null){
            if (actual.dato.equals(dato)) {
                
                if(actual.anterior==null){
                    cabeza=actual.siguiente;
                    if (cabeza!=null) {
                        cabeza.anterior=null;
                      
                    }
                    else if (actual.siguiente==null) {
                        Cola=actual.anterior;
                        Cola.siguiente=null;
                    }else {
                        actual.anterior.siguiente=actual.siguiente;
                        actual.siguiente.anterior=actual.anterior;
                    
                    }
                    tamanio --;
                    return;
                }
                actual=actual.siguiente;
                
                
            }
        }
          
          
        
    }
    public boolean buscar (T dato){
        Nodo<T> actual=cabeza;
        while (actual!=null){
            if (actual.dato.equals(dato)) {
                return true;
                
            }else{
                actual=actual.siguiente;
            }
        }
        return false;
    }
    
    
    
}
