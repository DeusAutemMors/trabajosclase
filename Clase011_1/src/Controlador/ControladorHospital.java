/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ColaPaciente;

/**
 *
 * @author Lenovo
 */
public class ControladorHospital {
    private ColaPaciente colaEmergencia,colaUrgencias,colaNourgente;
    
    public ControladorHospital (){
        colaEmergencia=new ColaPaciente ();
        colaUrgencias=new ColaPaciente();
        colaNourgente=new ColaPaciente();
        
    }
    public void registrarpaciente (String nombre, int nivel){
        
        switch (nivel){
            case 1:
                colaEmergencia.encolar(nombre, nivel);
                System.out.println("Paciente"+nombre+"registrado en Emergencias");
                break;
            case 2:
                colaUrgencias.encolar(nombre, nivel);
                System.out.println("Paciente"+nombre+"registrado en Urgencias");
                break;
            case 3:
                colaNourgente.encolar(nombre, nivel);
                break;
            default:
                System.out.println("Nivel incorrecto");
        }
        
        
    }
}
