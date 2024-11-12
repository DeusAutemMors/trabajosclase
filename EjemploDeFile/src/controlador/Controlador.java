/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.VistaGeneral;

/**
 *
 * @author Lenovo
 */
public class Controlador {
    
    private VistaGeneral administrador;

    public Controlador(VistaGeneral vistaGeneral) {
        this.administrador = administrador;
    }

    public void iniciar() {
        administrador.setTitle("ADMINISTRADOR");
        administrador.setLocationRelativeTo(null);
    }
}
