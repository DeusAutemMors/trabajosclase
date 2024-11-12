/*
Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que responde a las acciones realizadas por el usuario en el controlador
Fecha: 9/05/2024
Autor: Daniel Mauricio Gil Sosa
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ModeloSesion;
import vista.vista_InicioSesion;
import vista.vista_RegistroUsuario;

public class Controlador implements ActionListener {
    
    private final vista_RegistroUsuario vista;

    public Controlador(vista_RegistroUsuario vista) {
        this.vista = vista;
        this.vista.JB_registrar.addActionListener(this);
        this.vista.JB_back.addActionListener(this);
        this.vista.JB_back1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.JB_registrar) {
            registrarUsuario();
        } else if (e.getSource() == vista.JB_back || e.getSource() == vista.JB_back1) {
            volverAInicioSesion();
        }
    }

    private void registrarUsuario() {
        String nombreUsuario = vista.JTF_NameUser.getText();
        String contraseña = vista.JTF_NumCel.getText();

        // Crear una nueva instancia de ModeloSesion y asignarla a la variable modelo
        ModeloSesion modelo = new ModeloSesion(nombreUsuario, contraseña);

        // Aquí puedes realizar operaciones adicionales, como guardar el usuario en la base de datos, etc.

        // Mostrar un mensaje de éxito
        JOptionPane.showMessageDialog(vista, "Usuario registrado con éxito");
    }

    private void volverAInicioSesion() {
        vista_InicioSesion vistaInicio = new vista_InicioSesion();
        vistaInicio.setVisible(true);
        vista.dispose(); // Cierra la ventana actual
    }
}