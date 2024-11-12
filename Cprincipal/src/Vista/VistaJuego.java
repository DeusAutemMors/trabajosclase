/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class VistaJuego {
    
    private Scanner Scanner ;
    
    
    public VistaJuego(){
        Scanner = new Scanner (System.in);
        
    }
    
    //menu principal
    public void mostrarMenu(){
        System.out.println("Menu juego de diversion ");
        System.out.println("1 Agregar jugador a la lista");
        System.out.println("2 Mostrar jugadores en la lista ");
        System.out.println("3 Eliminar jugadores en la lista");
        System.out.println("4 Jugar un turno ");
        System.out.println("5 Salir ");
        
        System.out.println("Seleccione una opcion ");
    }
    
    //metodo para leer la opcion ingresada
    
    public int leerOpcion(){
        return Scanner.nextInt();
        
    }
    //metodo para ingresar o leer el nombre del jugador 
    public String leerNombre(){
        System.out.println("Ingrese el nombre del jugador");
        return Scanner.nextLine();
        
    }
    public void monstrarMensaje (String mensaje ){
        System.out.println("mensaje");
    }
}
