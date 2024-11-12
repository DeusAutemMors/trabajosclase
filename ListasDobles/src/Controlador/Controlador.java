/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ListaEnlazada;
import Vista.Vista;

/**
 *
 * @author Lenovo
 */
public class Controlador <T> {
    private ListaEnlazada<T>modelo;
    private Vista vista;
    
    public Controlador (ListaEnlazada<T> lista, Vista vista){
        this.modelo=modelo;
        this.vista=vista;
        
        
    }
    
    public void iniciar (){
        int opcion;
        
        do{
            vista.MostrarMenu();
            opcion=vista.obtenerOpcion();
          
        }while (opcion!=0);
        
    }
    public void procesar (int opcion){
        switch (opcion){
            case 1:
                agregarAlFinal();
                break;
                
            case 2:
                agregarAlInicio();
                break;
                
            case 3:
                eliminar();
                break;
                
            case 4:
                buscar();
                break;
                
            case 0:
                System.out.println("Saliendo programa");
                break;
                
                default:
                    vista.MostrarMenu();
                
        
      
        }
    }
    
    private void agregarAlFinal(){
        T elemento =  (T) Integer.valueOf(vista.obtenerNumero("Ingrese el elemento a agregar al final de la lista"));
        modelo.agregarAlFinal(elemento);
        vista.mostrarMensaje("elemento agregado al final");
    }
    
    private void agregarAlInicio(){
        T elemento =  (T) Integer.valueOf(vista.obtenerNumero("Ingrese el elemento a agregar al inicio de la lista"));
        modelo.agregarAlInicio(elemento);
        vista.mostrarMensaje("elemento agregado al inicio   ");
        
    }
    
    private void eliminar (){
        T elemento =  (T) Integer.valueOf(vista.obtenerNumero("Ingrese el elemento a eliminar"));
        modelo.eliminar(elemento);
        vista.mostrarMensaje("elemento eliminado");
    }
    
    private void buscar(){
        T elemento =  (T) Integer.valueOf(vista.obtenerNumero("Ingrese el dato a buscar"));
        modelo.buscar(elemento);
        vista.mostrarMensaje("Buscar elemento");
    }
}
