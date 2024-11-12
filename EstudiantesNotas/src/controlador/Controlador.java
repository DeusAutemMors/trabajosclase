/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.modelo;
import vista.Vista;

/**
 *
 * @author Lenovo
 */
public class Controlador {

    private modelo modelo;
    private Vista Vista;

    public Controlador(modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.Vista = vista;

    }

   public void iniciar() {
    int numeroestudiante = Vista.solicitarNumero("Ingrese el numero de estudiantes: ");
    int numeromaterias = Vista.solicitarNumero("Ingrese el numero de materias: ");
    
   
    
    
    modelo = new modelo(numeroestudiante, numeromaterias);
    
    
    for (int i = 0; i < numeroestudiante; i++) {
        for (int j = 0; j < numeromaterias; j++) {
            int calificacion = Vista.solicitarNumero("Ingrese la calificacion del estudiante " + (i + 1) + " para la materia " + (j + 1) + ": ");
            modelo.setCalificaciones(i, calificacion, j); 
        }
    }

   
    Vista.mostrarCalificaciones(modelo.getCalificaciones());

  
    for (int i = 0; i < numeroestudiante; i++) {
        double promedioestudiantes = modelo.calcularpromedioestudiante(i); 
        Vista.mostrarpromedioestudiante(i + 1, promedioestudiantes); 
    }
   
    for (int j = 0; j < numeromaterias; j++) {
        double promediomaterias = modelo.calculopromediomateria(j);
        Vista.mostrarpromediomateria(j + 1, promediomaterias); 
    }
      int[] estudiantesMayorMenor = modelo.encontrarEstudianteMayorYMenorPromedio();
    Vista.mostrarmensaje("El estudiante con el mayor promedio es el numero " + (estudiantesMayorMenor[0] + 1));
    Vista.mostrarmensaje("El estudiante con el menor promedio es el numero " + (estudiantesMayorMenor[1] + 1));
}
   
   
   
}
