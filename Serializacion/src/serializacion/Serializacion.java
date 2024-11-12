/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializacion;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class Serializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
    }
    
    public class Persona implements Serializable {
        private String nombre;
        private int edad;
        
    }
    
  try (
    FileOutputStream fileOut = new FileOutputStream("persona.ser");
    ObjectOutputStream out = new ObjectOutputStream(fileOut);
) {
    
    
}
    
}
