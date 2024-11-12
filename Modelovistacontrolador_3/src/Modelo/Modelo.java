/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import static Vista.Vista.NumeroLote;

/**
 *
 * @author Lenovo
 */
public class Modelo {
   String Fcaducidad,NumeroLote;

    public String getFcaducidad() {
        return Fcaducidad;
    }

    public void setFcaducidad(String Fcaducidad) {
        this.Fcaducidad = Fcaducidad;
    }

    public String getNumeroLote() {
        return NumeroLote;
    }

    public void setNumeroLote(String NumeroLote) {
        this.NumeroLote = NumeroLote;
    }

    public void setLNumeroLote(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
