/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pla;
import Vista.VistaPila;



/**
 *
 * @author Lenovo
 */
public class FilaControlador {
    private VistaPila vista;
    private Pla pila;
    
    public FilaControlador (VistaPila vista, Pla pila){
        this.vista=vista;
     this.pila= pila;
    }
    
    public void iniciar (){
        boolean continuar= true;
        
        while (continuar ){ 
            int opcion=vista.mostrarMenu();
            
            switch (opcion){
                case 1:
                    int numero=vista.perdirNumero();
                    pila.apilar(numero);
                    vista.mostrarMensaje("Numero apilado correctamente");
                    break;
                    
                case 2:
                   int quitar=pila.desaPilar();
                   vista.mostrarMensaje ("Numero desapilado"+quitar);
                   break;
                   
                case 3:
                    int cima=pila.ultimo();
                    vista.mostrarMensaje("ultimo dato de l pila"+ cima);
                    break;
                    
                case 4:
                    pila.mostrarPila();
                    break;
                    
                case 5:
                    continuar=false;
                    vista.mostrarMensaje("saliendo");
                    break;
                    
                default:
                    
                   vista.mostrarMensaje("opcion no valida");
                   break;
                   
                 
                 
            }
        }
    }

}
