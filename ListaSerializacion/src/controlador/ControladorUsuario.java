/*
   Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que responde a las acciones realizadas por el usuario en el controlador 
Fecha: 5/04  2024
Autor: Daniel Mauricio Gil Sosa
 */
package controlador;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.Modelo;
import vista.Vista;


public class ControladorUsuario {
    private final Vista vista;
    private String archivo = "datos.txt";
    private final ArrayList<Object> listaIdentificaciones;

    public ControladorUsuario(Vista vista) {
        this.vista = vista;
        this.listaIdentificaciones = new ArrayList<>();
    }

    public void iniciar() {
        vista.setTitle("EJEMPLO USUARIO");
        vista.setLocationRelativeTo(null);
    }

    public void agregarDatos(String identificacion) {
        try (FileOutputStream archivoSalida = new FileOutputStream(archivo, true);
             ObjectOutputStream salida = new ObjectOutputStream(archivoSalida)) {
            salida.writeObject(identificacion);
            listaIdentificaciones.add(identificacion); 
            actualizarTextArea(); 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void actualizarTextArea() {
        StringBuilder sb = new StringBuilder();
        for (Object identificacion : listaIdentificaciones) {
            sb.append(identificacion).append("\n");
        }
        vista.getJTextArea().setText(sb.toString()); 
    }

    public void cargarDatos() {
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader lectorBuffer = new BufferedReader(lector);
            vista.getJTextArea().setText(""); 
            String linea;
            while ((linea = lectorBuffer.readLine()) != null) {
                vista.getJTextArea().append(linea + "\n"); 
            }
            lectorBuffer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void agregarDatos2(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}