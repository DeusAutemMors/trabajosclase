/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class VistaFile extends javax.swing.JFrame {

    /**
     * Creates new form VistaFile
     */
    public VistaFile() {
        initComponents();
    }
 public static String Usuario = "", password;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPF_Contraseña = new javax.swing.JPasswordField();
        JB_Aceptar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTF_Usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPF_Contraseña.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N
        JPF_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPF_ContraseñaActionPerformed(evt);
            }
        });

        JB_Aceptar.setFont(new java.awt.Font("Segoe UI Variable", 2, 24)); // NOI18N
        JB_Aceptar.setText("Aceptar");
        JB_Aceptar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JB_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AceptarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INICIAR SESION");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 2, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña");

        JTF_Usuario.setFont(new java.awt.Font("SimSun", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTF_Usuario)
                    .addComponent(JPF_Contraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(JB_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTF_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JPF_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addComponent(JB_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JPF_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPF_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPF_ContraseñaActionPerformed

    private void JB_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AceptarActionPerformed
        //Igualamos las variables con el texto que halla digitado el usuario
        Usuario = JTF_Usuario.getText();
        password = JPF_Contraseña.getText();
        //Condicion de que si el usuario no fue ingresado no ejecute la otra vista
        if (password.equals("12") && Usuario.equals("")) {
            JOptionPane.showMessageDialog(this, "Por favor digite un usuario");
            JPF_Contraseña.setText("");
        } else {
            //Si la contraseña es correcta ejecutar la otra vista
            if (password.equals("12")) {
                JOptionPane.showMessageDialog(this, "Bienvenid@ " + Usuario);
                VistaFile vistaFile = new VistaFile();
                vistaFile.setVisible(true);
                this.setVisible(false);
            } else {
                //Si la contraseña no es correcta y el ususario esta vacio los vuelve a pedir nuevamente
                if (!password.equals("12") && Usuario.equals("")) {
                    JOptionPane.showMessageDialog(this, "Por favor digite un usuario");
                    JPF_Contraseña.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                    JPF_Contraseña.setText("");
                }
            }
        }
    }//GEN-LAST:event_JB_AceptarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_Aceptar;
    public javax.swing.JPasswordField JPF_Contraseña;
    public javax.swing.JTextField JTF_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
