/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class ListaCircular {
    private Nodo cabeza=null;
    private Nodo Cola=null;
    //metodo para agregar un jugador final
    public void agregarJugador(String nombre){
        
    
        Nodo nuevo=new Nodo(nombre);
        if  (cabeza==null){
            cabeza=nuevo;
            Cola=nuevo;
            
         nuevo.siguiente=cabeza;
         
        }else{
            Cola.siguiente=nuevo;
            nuevo.siguiente=cabeza;
            Cola =nuevo;
        }
        
    }
   public String mostrarJugadores(){
       if (cabeza==null){
           return"la lista esta vacia";
           
       }else{
           
          StringBuilder resultado=new StringBuilder();
          Nodo actual=cabeza;
          do{
              resultado.append(actual.nombre).append("->");
              actual=actual.siguiente;
          }while    (actual!=cabeza);
          resultado.append("volver al principio");
           return resultado.toString();
           
       }
       
           
       } 
       //metodo para eliminar un jugador de la lista 
      public boolean eliminarJugador(String nombre) {
        if (cabeza == null) {
            return false; 
        }

        Nodo actual = cabeza;
        Nodo anterior = null;

      
        do {
            if (actual.nombre.equals(nombre)) {
                if (actual == cabeza) {
                   
                    if (cabeza == Cola) {
                        cabeza = null;
                        Cola = null;
                    } else {
                      
                        cabeza = cabeza.siguiente;
                        Cola.siguiente = cabeza;
                    }
                } else if (actual == Cola) {
                    
                    Cola = anterior;
                    Cola.siguiente = cabeza;
                } else {
                    
                    anterior.siguiente = actual.siguiente;
                }
                return true; 
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);

        return false; 
    }
      
      //metodo para jugar 
      
      public String jugar(){
          if (cabeza==null){
              return "la lista esta vacia";   
          }
          String  jugadorActual=cabeza.nombre;
          cabeza=cabeza.siguiente;
          return "Turno del jugador "+jugadorActual;
          
      }

}