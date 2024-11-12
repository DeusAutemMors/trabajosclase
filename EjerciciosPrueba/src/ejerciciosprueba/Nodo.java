/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosprueba;

/**
 *
 * @author Lenovo
 */
public class Nodo {
    
    Object valor;
    Nodo siguiente;
    
    public Nodo (Object valor){
        this.valor=valor;
        this.siguiente=null;
    }
    
    public Object OptenerValor(){
        return valor;
    }
    public void enlazar (Nodo n ){
        
       this.siguiente=n;
    }
    
    public Nodo ObtenerSiguiente (Nodo n1){
        return siguiente;
    }
    
}
