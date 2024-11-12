/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


/**
 *
 * @author Lenovo
 */
public class Controlador implements ActionListener {

    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnejecuta.addActionListener(this);
    }

    public void iniciar() {
        view.setTitle("Operar Sumas");
        view.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        model.setNum1(Integer.parseInt(view.txtvalor1.getText()));
        model.setNum2(Integer.parseInt(view.txtvalor2.getText()));
        model.suma();
        view.txtresultado.setText(String.valueOf(model.getResulta()));

    }

}
