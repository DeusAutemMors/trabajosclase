/*
  Doncente: Magda Pineda
Universidad Juan de castellanos 
Asignatura: Programacion Orientada A Objetos
Descripcion:Clase que reprenseta la interfaz  De Usuario Registro De libros
Fecha:9/05/2024
Autor: Daniel Mauricio Gil Sosa
 */
package vista;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import modelo.ModeloRegistroLibros;
import modelo.ModeloSesion;

/**
 *
 * @author Lenovo
 */
public class vista_RegistroLibros extends javax.swing.JFrame {

    /**
     * Creates new form vista_RegistroLibros
     */
    public vista_RegistroLibros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTF_TituloL = new javax.swing.JTextField();
        JTF_AñoPublicacion = new javax.swing.JTextField();
        JTF_ISBN = new javax.swing.JTextField();
        JB_registrar = new javax.swing.JButton();
        JTF_Autor = new javax.swing.JTextField();
        JB_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE LIBROS");

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        jLabel3.setText("Autor");

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        jLabel2.setText("Titulo");

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        jLabel4.setText("Año de Publicacion");

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        jLabel5.setText("ISBN");

        JTF_TituloL.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        JTF_TituloL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTF_TituloLKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_TituloLKeyTyped(evt);
            }
        });

        JTF_AñoPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_AñoPublicacionActionPerformed(evt);
            }
        });
        JTF_AñoPublicacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_AñoPublicacionKeyTyped(evt);
            }
        });

        JTF_ISBN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_ISBNKeyTyped(evt);
            }
        });

        JB_registrar.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        JB_registrar.setText("Registrar Libro");
        JB_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_registrarActionPerformed(evt);
            }
        });

        JTF_Autor.setFont(new java.awt.Font("Segoe UI Variable", 2, 18)); // NOI18N
        JTF_Autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTF_AutorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_AutorKeyTyped(evt);
            }
        });

        JB_back.setFont(new java.awt.Font("Sitka Display", 3, 14)); // NOI18N
        JB_back.setText("ATRAS");
        JB_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTF_ISBN)
                            .addComponent(JTF_TituloL)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTF_AñoPublicacion)
                                .addGap(14, 14, 14))
                            .addComponent(JTF_Autor, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(JB_back)
                                .addGap(53, 53, 53)
                                .addComponent(JB_registrar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 147, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTF_TituloL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JTF_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTF_AñoPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTF_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JB_back)
                    .addComponent(JB_registrar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTF_TituloLKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_TituloLKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_TituloLKeyPressed

    private void JTF_TituloLKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_TituloLKeyTyped
        if (!Character.isAlphabetic(evt.getKeyChar()) || Character.isWhitespace(evt.getKeyChar())) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

        if (JTF_TituloL.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_JTF_TituloLKeyTyped

    private void JTF_AñoPublicacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_AñoPublicacionKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

        if (JTF_AñoPublicacion.getText().length() >= 4) {
            evt.consume();
        }

    }//GEN-LAST:event_JTF_AñoPublicacionKeyTyped

    private void JTF_ISBNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_ISBNKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }

        if (JTF_ISBN.getText().length() >= 13) {
            evt.consume();
        }
    }//GEN-LAST:event_JTF_ISBNKeyTyped

    private void JB_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_registrarActionPerformed
        String TituloL = JTF_TituloL.getText();

        String autor = JTF_Autor.getText();
        String añoPublicacion = JTF_AñoPublicacion.getText();
        String isbn = JTF_ISBN.getText();

       
        ModeloRegistroLibros modeloRegistroLibros = new ModeloRegistroLibros(TituloL, autor, añoPublicacion, isbn);
        JOptionPane.showMessageDialog(null, "Registrado con éxito");
        
    }//GEN-LAST:event_JB_registrarActionPerformed

    private void JTF_AutorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_AutorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_AutorKeyPressed

    private void JTF_AutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_AutorKeyTyped
        if (JTF_Autor.getText().length() >= 10) {
            evt.consume();
        }

    }//GEN-LAST:event_JTF_AutorKeyTyped

    private void JTF_AñoPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_AñoPublicacionActionPerformed

    }//GEN-LAST:event_JTF_AñoPublicacionActionPerformed

    private void JB_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_backActionPerformed
        VistaDeUsuariosIngresados VistaDeUsuariosIngresados = new VistaDeUsuariosIngresados();
       VistaDeUsuariosIngresados.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JB_backActionPerformed

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
            java.util.logging.Logger.getLogger(vista_RegistroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista_RegistroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista_RegistroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista_RegistroLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_RegistroLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_back;
    public javax.swing.JButton JB_registrar;
    public static javax.swing.JTextField JTF_Autor;
    public static javax.swing.JTextField JTF_AñoPublicacion;
    public static javax.swing.JTextField JTF_ISBN;
    public static javax.swing.JTextField JTF_TituloL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
