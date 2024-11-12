/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ArbolBinario;
import Modelo.Nodo;
import Vista.VistaArbol;

/**
 *
 * @author Lenovo
 */
public class ControladorArbol {

    private ArbolBinario modelo;
    private VistaArbol vista;

    public ControladorArbol(ArbolBinario model, VistaArbol vista) {

        this.modelo = modelo;
        this.vista = vista;

    }
    
    public void agregaValor (int valor, Nodo actual ){
        modelo.agregar(valor);
        vista.mostrarmensaje("valor"+valor +"agregado al arbol");
    }
    
    public void eliminar (int valor ){
        modelo.eliminarR(valor);
        vista.mostrarmensaje("valor"+ valor + "eliminado del arbol");
        
    }
public void mostrar (){
    StringBuilder pre=new StringBuilder();
    modelo.imprimirPreorden();
}
}
