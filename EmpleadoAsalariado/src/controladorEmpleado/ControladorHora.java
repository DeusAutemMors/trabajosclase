/*
 Estudiante:Daniel Mauricio Gil Sosa
Universidad: Juan de castellanos
Descripcion:Clase que responde a las acciones realizadas por el usuario en el controlador Hora 
Fecha: 1 De Marzo 2024
Autor: Daniel Mauricio Gil Sosa
 */
package controladorEmpleado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modeloAsalariado.Modelo;
import modeloAsalariado.ModeloHora;
import vistaEmpleado.EmpleadoHora;
import vistaEmpleado.VistaEmpleado;

/**
 *
 * @author Lenovo
 */
public class ControladorHora {

    private final EmpleadoHora empleadoHora;
    private ModeloHora model;
    private EmpleadoHora view;

    public ControladorHora(vistaEmpleado.EmpleadoHora empleadoHora, ModeloHora modelo) {
        this.empleadoHora = empleadoHora;
        this.view = view;
        this.model = model;
        this.view.btnejecuta.addActionListener((ActionListener) this);
        this.view.JB_EmpleadoFH.addActionListener((ActionListener) this);
    }

    public void inicar() {
        empleadoHora.setTitle("Ejemplos Empleados por Hora ");
        empleadoHora.setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent e) {
        model.setHorasTra(Integer.parseInt(view.JTF_HorasTra.getText()));
        model.setValorH(Integer.parseInt(view.JTF_ValorH.getText()));
        model.multiplicacion();
        view.txtresultado.setText(String.valueOf(model.getResulta()));
    }

}
