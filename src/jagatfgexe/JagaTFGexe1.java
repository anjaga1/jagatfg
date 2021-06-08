package jagatfgexe;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 * Sotware desarrollado para el TFE en Ingenieria de Sistemas en UNIR
 * @author Angel Jaen Galan
 */
public class JagaTFGexe1 extends javax.swing.JFrame {

  
    public JagaTFGexe1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setForeground(new java.awt.Color(0, 153, 51));
        jButton1.setText("VPN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(0, 153, 51));
        jScrollPane1.setFont(new java.awt.Font("Calibri", 2, 24)); // NOI18N

        jTextPane1.setEditable(false);
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 153, 51));
        jTextPane1.setText("SeguriTFG");
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, -1));

        jButton2.setForeground(new java.awt.Color(0, 153, 51));
        jButton2.setText("Firewall");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        jButton3.setForeground(new java.awt.Color(0, 153, 51));
        jButton3.setText("Proxy");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jButton5.setForeground(new java.awt.Color(0, 153, 51));
        jButton5.setText("Documentacion");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Soldados.jpg"))); // NOI18N
        jLabel1.setText("SeguriTFG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 500, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ejecutar_vpn ();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ejecutar_firewall (); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ejecutar_proxy ();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        documentacion ();
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void ejecutar_vpn(){
    Runtime app = Runtime.getRuntime();
    try {
    app.exec("C://Program Files//OpenVPN//bin//openvpn-gui.exe");
    }
        catch (Exception e){
        }
    }
    
    public static void documentacion(){
    try {
     File path = new File ("C://Compartida//TFG//Entregar Final//Documentos entrega//Jaen_Galan_Angel_TFE_2021_bueno_final.pdf");
     Desktop.getDesktop().open(path);
    }
    catch (IOException ex) {
     ex.printStackTrace();
}
    }
    
    
    public static void ejecutar_firewall(){
    Runtime app = Runtime.getRuntime();
    try {
    app.exec("C://Program Files (x86)//CheckPoint//ZoneAlarm//zatray.exe");
    }
        catch (Exception e){
        }
    }
    
    public static void ejecutar_proxy(){
    Runtime app = Runtime.getRuntime();
    try {
    app.exec("C://Program Files (x86)//Hand-Crafted Software//FreeProxy//FreeProxyClient.exe");
    }
        catch (Exception e){
        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JagaTFGexe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JagaTFGexe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JagaTFGexe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JagaTFGexe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JagaTFGexe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
