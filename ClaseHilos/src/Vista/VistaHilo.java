/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class VistaHilo extends JFrame {
    private JTextField campoHilo, campoHilo2,campoHilo3;
    private JButton BotonIniciar;
    
    
    public VistaHilo (){
        setTitle("Simulacion Hilos");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2));
        
        add(new JLabel("Duracion Hilo(Segundo)"));
        campoHilo=new JTextField();
        add(campoHilo);
        
         add(new JLabel("Duracion Hilo(Segundo)"));
        campoHilo2=new JTextField();
        add(campoHilo2);
        
         add(new JLabel("Duracion Hilo(Segundo)"));
        campoHilo3=new JTextField();
        add(campoHilo3);
        
        
        BotonIniciar=new JButton("Iniciar Simulacion");
        add(BotonIniciar);
        
        setVisible(true);
        
      
        
        
        
    }
    
    public JTextField getCampoHilo1(){
        return campoHilo;
    }
    
    
    public JTextField getCampoHilo2(){
        return campoHilo2;
    }
    
    public JTextField getCampoHilo3(){
        return campoHilo3;
    }
    
    public JButton getBotonIniciar(){
        return BotonIniciar;
    }
    
    
    
}
