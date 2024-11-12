/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pila;
import Modelo.Validar;
import Vista.VistaPila;

/**
 *
 * @author Lenovo
 */
public class ControldorPila {
   private VistaPila vista;
   private Validar validar;
   
   
 public ControldorPila (VistaPila vista, Validar validar){
     this.validar=validar;
     this.vista=vista;
     
     
   }
 
 public void iniciar (){
     String expresion=vista.pedirExpresion();
     boolean balanceado = validar.esBaleanceado(expresion);
     vista.mostrarResultados(balanceado);
     
 }
    
}