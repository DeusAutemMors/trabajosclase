/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author Lenovo
 */
public class VistaProductosFPC extends javax.swing.JFrame {

    /**
     * Creates new form VistaProductosFPC
     */
    public VistaProductosFPC() {
        initComponents();
         this.setLocationRelativeTo(null);
    }
    
     public static String FechaCaducidad="", NumeroLote="",NombProducto="";
 
 
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTF_Caducidad = new javax.swing.JTextField();
        JTF_NumLote = new javax.swing.JTextField();
        JB_PFrescos = new javax.swing.JButton();
        JB_PRefrigerados = new javax.swing.JButton();
        JB_PCongelados = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JTF_NomProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fecha De Caducidad");

        jLabel2.setText("Numero De Lote");

        jLabel3.setText("PRODUCTOSFPC");

        JTF_NumLote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_NumLoteKeyTyped(evt);
            }
        });

        JB_PFrescos.setText("Productos Frescos");
        JB_PFrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_PFrescosActionPerformed(evt);
            }
        });

        JB_PRefrigerados.setText("Productos Refrigerados");
        JB_PRefrigerados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JB_PRefrigeradosMouseClicked(evt);
            }
        });
        JB_PRefrigerados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_PRefrigeradosActionPerformed(evt);
            }
        });

        JB_PCongelados.setText("Productos Congelados");
        JB_PCongelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_PCongeladosActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre Del Producto:");

        JTF_NomProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTF_NomProductoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTF_Caducidad, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(JTF_NumLote)
                            .addComponent(JTF_NomProducto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(JB_PRefrigerados)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JB_PCongelados)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JB_PFrescos)
                        .addGap(136, 136, 136))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTF_Caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTF_NumLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTF_NomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(JB_PFrescos)
                .addGap(18, 18, 18)
                .addComponent(JB_PRefrigerados)
                .addGap(18, 18, 18)
                .addComponent(JB_PCongelados)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_PRefrigeradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_PRefrigeradosActionPerformed
        // TODO add your handling code here:
       FechaCaducidad = JTF_Caducidad.getText();
         NumeroLote = JTF_NumLote.getText();
         NombProducto=JTF_NomProducto.getText();
         
           VistaRefrigerado  vistaRefrigerado = new  VistaRefrigerado();
         vistaRefrigerado.setVisible(true);
         this.setVisible(false);
         
         
    }//GEN-LAST:event_JB_PRefrigeradosActionPerformed

    private void JB_PRefrigeradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JB_PRefrigeradosMouseClicked
        // TODO add your handling code here:
        
         
         
         VistaRefrigerado  vistaRefrigerado = new  VistaRefrigerado();
         vistaRefrigerado.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_JB_PRefrigeradosMouseClicked

    private void JB_PCongeladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_PCongeladosActionPerformed
        
        FechaCaducidad = JTF_Caducidad.getText();
         NumeroLote = JTF_NumLote.getText();
        VistaCongelado vistaCongelado = new  VistaCongelado();
         vistaCongelado.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_JB_PCongeladosActionPerformed

    private void JB_PFrescosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_PFrescosActionPerformed
         FechaCaducidad = JTF_Caducidad.getText();
         NumeroLote = JTF_NumLote.getText();
         VistaFrescos vistaFrescos = new  VistaFrescos();
         vistaFrescos.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_JB_PFrescosActionPerformed

    private void JTF_NumLoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_NumLoteKeyTyped
       if(JTF_NumLote.getText().length() >= 10)
    {
        evt.consume();
    }
    }//GEN-LAST:event_JTF_NumLoteKeyTyped

    private void JTF_NomProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTF_NomProductoKeyTyped
     
        if(JTF_NomProducto.getText().length() >= 15)
    {
        evt.consume();
    }
    {
     
   
        }
    }//GEN-LAST:event_JTF_NomProductoKeyTyped
    
      
           
         
    /**{
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
            java.util.logging.Logger.getLogger(VistaProductosFPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProductosFPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProductosFPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProductosFPC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductosFPC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JB_PCongelados;
    public javax.swing.JButton JB_PFrescos;
    public javax.swing.JButton JB_PRefrigerados;
    public javax.swing.JTextField JTF_Caducidad;
    public javax.swing.JTextField JTF_NomProducto;
    public javax.swing.JTextField JTF_NumLote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
