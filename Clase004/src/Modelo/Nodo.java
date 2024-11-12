/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Nodo {
    
    private String nombreCliente;
    private String documentoCliente;
    private String servicio; 
    private Nodo siguiente;
            
            public Nodo(String nombre,String documento, String servicio){
                
                this.documentoCliente=nombre;
                this.nombreCliente=documento;
                this.servicio=servicio;
                this.siguiente=null;
                
                
            }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {// parametros son los que van dentro del parentesis 
        this.siguiente = siguiente;
    }
            
           
    
}
