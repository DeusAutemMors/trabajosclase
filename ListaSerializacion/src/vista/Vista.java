/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorUsuario;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modelo.Listas;
import modelo.Modelo;

/**
 *
 * @author Lenovo
 */
public class Vista extends javax.swing.JFrame {
    
    

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        
        
    }
    
   public javax.swing.JTextArea getJTextArea() {
    return jTextArea1;
}

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTF_User = new javax.swing.JTextField();
        JP_Password = new javax.swing.JPasswordField();
        JC_mostrarContraseña = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        JTF_Clave = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JP_Passward = new javax.swing.JPasswordField();
        JTF_NameUser = new javax.swing.JTextField();
        JB_registrar = new javax.swing.JButton();
        JB_aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton1.setText("Guardar Info");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar InfoArchivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        jLabel2.setText("Usuario Nuevo");

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        JTF_User.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_UserKeyTyped(evt);
            }
        });

        JP_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JP_PasswordActionPerformed(evt);
            }
        });
        JP_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JP_PasswordKeyTyped(evt);
            }
        });

        JC_mostrarContraseña.setFont(new java.awt.Font("Segoe UI Variable", 2, 12)); // NOI18N
        JC_mostrarContraseña.setText("Mostrar Contraseña");
        JC_mostrarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JC_mostrarContraseñaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 2, 24)); // NOI18N
        jLabel5.setText("LOGIN");

        JTF_Clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_ClaveActionPerformed(evt);
            }
        });
        JTF_Clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_ClaveKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        jLabel6.setText("Nueva Contraseña:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 2, 24)); // NOI18N
        jLabel7.setText("Crear Usuario");

        JP_Passward.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        JP_Passward.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JP_PasswardKeyTyped(evt);
            }
        });

        JTF_NameUser.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        JTF_NameUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTF_NameUserKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_NameUserKeyTyped(evt);
            }
        });

        JB_registrar.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        JB_registrar.setText("Crear Usuario");
        JB_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_registrarActionPerformed(evt);
            }
        });

        JB_aceptar.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        JB_aceptar.setText("Aceptar");
        JB_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_aceptarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Guardar Info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Guardar InfoArchivo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JP_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(JC_mostrarContraseña))
                            .addComponent(JTF_User, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(JB_aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTF_NameUser, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JP_Passward)))
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(JB_registrar)
                        .addGap(31, 31, 31)
                        .addComponent(jButton3)
                        .addGap(29, 29, 29)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(jLabel4)
                    .addContainerGap(590, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(JTF_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JP_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JC_mostrarContraseña))
                .addGap(24, 24, 24)
                .addComponent(JTF_Clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JB_aceptar)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_NameUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JP_Passward, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JB_registrar))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jLabel4)
                    .addContainerGap(512, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_UserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_UserKeyTyped
        if (!Character.isAlphabetic(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();

        }
        if (JTF_User.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
    }//GEN-LAST:event_JTF_UserKeyTyped

    private void JP_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JP_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JP_PasswordActionPerformed

    private void JP_PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JP_PasswordKeyTyped
        if (JP_Password.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_JP_PasswordKeyTyped

    private void JC_mostrarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JC_mostrarContraseñaActionPerformed
        if (JC_mostrarContraseña.isSelected()) {
            JP_Password.setEchoChar((char) 0);
        } else {
            JP_Password.setEchoChar('*');

        }
    }//GEN-LAST:event_JC_mostrarContraseñaActionPerformed

    private void JTF_ClaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_ClaveKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_ClaveKeyTyped

    private void JP_PasswardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JP_PasswardKeyTyped
        if (JP_Passward.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_JP_PasswardKeyTyped

    private void JTF_NameUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_NameUserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_NameUserKeyPressed

    private void JTF_NameUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_NameUserKeyTyped
        if (!Character.isAlphabetic(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

        if (JTF_NameUser.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_JTF_NameUserKeyTyped

    private void JTF_ClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_ClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_ClaveActionPerformed

    private void JB_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_registrarActionPerformed
        String nombreUsuario = JTF_NameUser.getText();

        String contraseña1 = JTF_Clave.getText();

        // Crear una nueva instancia de ModeloUsuario y asignarla a la variable nuevoUsuario
        Modelo modeloUsuario = new Modelo(nombreUsuario, contraseña1);

        JOptionPane.showMessageDialog(null, "Registrado con éxito");
    }//GEN-LAST:event_JB_registrarActionPerformed

    private void JB_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_aceptarActionPerformed
        String user = this.JTF_User.getText();
        String clave = this.JTF_Clave.getText();
        String userd = Vista.JTF_NameUser.getText();
        String claved = JTF_Clave.getText();

        if(user.equals(userd) && clave.equals(claved)){
            VistaFinal vistaFinal = new VistaFinal();
            vistaFinal.setVisible(true);
            this.setVisible(false);
        }else{

        }

    }//GEN-LAST:event_JB_aceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code h
        Listas lista = new Listas();
        String nombre = JTF_NameUser.getText();
        String identificacion = JP_Passward.getText();

        // Llamar al método para agregar a la lista
        lista.agregarAInicio(nombre + " - " + identificacion);

        // Limpiar el área de texto y mostrar la lista actualizada
        jTextArea1.append(nombre + " - " + identificacion + "\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Vista vista = new Vista();
        ControladorUsuario controlador = new ControladorUsuario(vista);

        String nombre = jTextArea1.getText(); // Obtener el texto del JTextArea
        String identificacion = JTF_NameUser.getText(); // Suponiendo que el identificador está en un JTextField
        controlador.agregarDatos( identificacion);
        controlador.agregarDatos2( nombre);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code h
        Listas lista = new Listas();
        String nombre = JTF_NameUser.getText();
        String identificacion = JP_Passward.getText();

        // Llamar al método para agregar a la lista
        lista.agregarAInicio(nombre + " - " + identificacion);

        // Limpiar el área de texto y mostrar la lista actualizada
        jTextArea1.append(nombre + " - " + identificacion + "\n");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Vista vista = new Vista();
        ControladorUsuario controlador = new ControladorUsuario(vista);

        String nombre = JTF_NameUser.getText(); // Obtener el texto del JTextArea
        String identificacion = JP_Passward.getText(); // Suponiendo que el identificador está en un JTextField
        controlador.agregarDatos( identificacion);
        controlador.agregarDatos2( nombre);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_aceptar;
    public javax.swing.JButton JB_registrar;
    public javax.swing.JCheckBox JC_mostrarContraseña;
    public javax.swing.JPasswordField JP_Passward;
    public javax.swing.JPasswordField JP_Password;
    public javax.swing.JTextField JTF_Clave;
    public static javax.swing.JTextField JTF_NameUser;
    public javax.swing.JTextField JTF_User;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    
}