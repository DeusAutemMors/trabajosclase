/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainTareas {
    
     public static void main(String[] args) {
    
           Scanner leer = new Scanner(System.in); 
        boolean Salir = false;
        while(!Salir){
            System.out.println("|Bienvenido a Aplicacion De tareas Daniel|");
           
            System.out.println("1. Agregar Tarea:");
            System.out.println("2. Completar Tarea:");
            System.out.println("3. Listar Tareas:");
            System.out.println("4. Eliminar Tareas:");
            System.out.println("5. Contar Tareas:");
            System.out.println("6. Salir:");
            System.out.print("Seleccione una opcion:");
            int Opcion = leer.nextInt();
            leer.nextLine();

                    switch(Opcion){
                        case 1:
                            System.out.println("Agregar Tarea:");
                            String Tarea = leer.nextLine();
                            Lista lista = new Lista();
                            lista.AgregarTarea(Tarea);
                            break;
               }

     
    
    
        }
     }
}
     
