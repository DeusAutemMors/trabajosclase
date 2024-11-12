/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JTextArea;

/**
 *
 * @author Lenovo
 */
public class Modelo {
    
    
    String usuario, contraseña;
     
    String nombreUsuario, correoElectronica, contraseña1;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCorreoElectronica() {
        return correoElectronica;
    }

    public void setCorreoElectronica(String correoElectronica) {
        this.correoElectronica = correoElectronica;
    }

    public String getContraseña1() {
        return contraseña1;
    }

    public void setContraseña1(String contraseña1) {
        this.contraseña1 = contraseña1;
    }

    public Modelo(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombreUsuario = nombreUsuario;
        this.correoElectronica = correoElectronica;
        this.contraseña1 = contraseña1;
    }
    
    public class Vista {
    private JTextArea jTextArea; 

        public JTextArea getjTextArea() {
            return jTextArea;
        }

        public void setjTextArea(JTextArea jTextArea) {
            this.jTextArea = jTextArea;
        }

        public Vista(JTextArea jTextArea) {
            this.jTextArea = jTextArea;
        }

    
    public JTextArea getJTextArea() {
        return this.jTextArea;
    }
    }

    
}


