/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodo;

/**
 *
 * @author Lenovo
 */
public class ListaSimple {
    
    private Nodo1 cabeza;
    
    public ListaSimple (){
        this.cabeza=null;
        
    }
    
    
    public void  agregar (int valor ){
        Nodo1 nuevoNodo=new Nodo1 ( valor);
        
        if (cabeza==null){
           cabeza=nuevoNodo;
            
        }else{
            Nodo1 temp = cabeza;
            
          while (temp.Siguiente !=null){
              temp=temp.Siguiente;
          }
          
          temp.Siguiente=nuevoNodo;
        }
        
    }
    
    public void  eliminar (){
        
        if (cabeza!=null){
            cabeza=cabeza.Siguiente;
            
        }else{
            System.out.println("Lista vacia");
        }
        
    }
    
   public void mostralLista(){
       Nodo1 temp=cabeza;
       while (temp !=null){
           System.out.println(temp.dato + "->");
           temp=temp.Siguiente;
           
       }
       System.out.println("Null");
   }
}
