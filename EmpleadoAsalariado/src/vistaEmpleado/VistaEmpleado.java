/*
Doncente: Magda Pineda
Universidad Juan de castellanos 
Asignatura: Programacion Orientada A Objetos
Descripcion:Clase que reprenseta la interfaz Principal De usuario
Fecha:1 Marzo 24
Autor: Daniel Mauricio Gil Sosa
 */
package vistaEmpleado;

import vistaEmpleado.EmpleadoHora;

import vistaEmpleado.EmpleadoHora;

import vistaEmpleado.EmpleadoHora;

/**
 *
 * @author Lenovo
 */
public class VistaEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form VistaEmpleado
     */
    public VistaEmpleado() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public static String NombreE = "", EdadE = "", Pro = "", Dep = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JL_Nombre = new javax.swing.JTextField();
        JTF_Edad = new javax.swing.JTextField();
        JB_EmpleadoHora = new javax.swing.JButton();
        JB_Asalariado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JTF_Pro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTF_Dep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("EMPLEADO ");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Edad:");

        JL_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JL_NombreActionPerformed(evt);
            }
        });
        JL_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JL_NombreKeyTyped(evt);
            }
        });

        JTF_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_EdadActionPerformed(evt);
            }
        });
        JTF_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_EdadKeyTyped(evt);
            }
        });

        JB_EmpleadoHora.setText("Empleado x Hora");
        JB_EmpleadoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_EmpleadoHoraActionPerformed(evt);
            }
        });

        JB_Asalariado.setText("Empleado Con Salario");
        JB_Asalariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_AsalariadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Profesion:");

        JTF_Pro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_ProKeyTyped(evt);
            }
        });

        jLabel5.setText("Departamento: ");

        JTF_Dep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_DepKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(JB_EmpleadoHora)
                .addGap(93, 93, 93)
                .addComponent(JB_Asalariado)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JL_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(JTF_Edad)
                    .addComponent(JTF_Pro)
                    .addComponent(JTF_Dep))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JL_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JTF_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JTF_Pro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JTF_Dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JB_EmpleadoHora)
                    .addComponent(JB_Asalariado))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_EmpleadoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_EmpleadoHoraActionPerformed
        NombreE = JL_Nombre.getText();
        EdadE = JTF_Edad.getText();
        Pro = JTF_Pro.getText();
        Dep = JTF_Dep.getText();

        EmpleadoHora empleadoHora = new EmpleadoHora();
        empleadoHora.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JB_EmpleadoHoraActionPerformed

    private void JTF_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_EdadActionPerformed

    private void JL_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JL_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JL_NombreActionPerformed

    private void JB_AsalariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_AsalariadoActionPerformed
        NombreE = JL_Nombre.getText();
        EdadE = JTF_Edad.getText();
        Pro = JTF_Pro.getText();
        Dep = JTF_Dep.getText();

        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado();
        empleadoAsalariado.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JB_AsalariadoActionPerformed

    private void JL_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JL_NombreKeyTyped
        if(JL_Nombre.getText().length()>=30)
       {
           evt.consume();
       }
    }//GEN-LAST:event_JL_NombreKeyTyped

    private void JTF_ProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_ProKeyTyped
        if(JTF_Pro.getText().length()>=15)
       {
           evt.consume();
       }
    }//GEN-LAST:event_JTF_ProKeyTyped

    private void JTF_DepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_DepKeyTyped
         if(JTF_Dep.getText().length()>=15)
       {
           evt.consume();
       }
    }//GEN-LAST:event_JTF_DepKeyTyped

    private void JTF_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_EdadKeyTyped
        if(JTF_Edad.getText().length()>=2)
       {
           evt.consume();
       }
    }//GEN-LAST:event_JTF_EdadKeyTyped

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
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_Asalariado;
    public javax.swing.JButton JB_EmpleadoHora;
    public javax.swing.JTextField JL_Nombre;
    private javax.swing.JTextField JTF_Dep;
    public javax.swing.JTextField JTF_Edad;
    private javax.swing.JTextField JTF_Pro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
