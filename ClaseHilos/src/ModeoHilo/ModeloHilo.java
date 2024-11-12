/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeoHilo;

/**
 *
 
 */
public class ModeloHilo {
    public void ejecutarHilo(int duracion,  String nombreHilo, Runnable actualizar){
        new Thread (()->{
            
            try {
                for(int i=0; i<duracion; i++){
                    Thread.sleep(1000);
                    actualizar.run();
                
            }
            
            System.out.println(nombreHilo +"finaizado");
        }catch(InterruptedException e){
                e.printStackTrace();
                
        }
        
        
    }).start();
                
                
                
                
                
                
                
                
                
                
                
                
    }
}