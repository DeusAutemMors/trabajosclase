/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Modelo.ListaCdoble;

/**
 *
 * @author Lenovo
 */
public class ControladorLista {
    private ListaCdoble model;
    
    public ControladorLista(ListaCdoble lista){
        this.model=lista;
    }
    
    public void agregarInicio (int valor){
        model.agregarInicio(valor);
    }
    
    public void agregarFinal(int dato){
        model.agregarFinal(dato);
    }
    
}
