
package banksystem;

import javax.swing.JOptionPane;
public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        usernameL = new javax.swing.JTextField();
        loginB = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ExitL = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 600));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 0, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        usernameL.setOpaque(false);
        usernameL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameLActionPerformed(evt);
            }
        });
        kGradientPanel1.add(usernameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 400, 40));

        loginB.setText("Login");
        loginB.setBorderPainted(false);
        loginB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginB.setkBorderRadius(40);
        loginB.setkEndColor(new java.awt.Color(0, 204, 204));
        loginB.setkFillButton(false);
        loginB.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        loginB.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        loginB.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        loginB.setkStartColor(new java.awt.Color(255, 255, 255));
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });
        kGradientPanel1.add(loginB, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 150, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Username");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 70, -1));

        jMenu1.setText("Go");

        ExitL.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        ExitL.setText("Exit");
        ExitL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitLActionPerformed(evt);
            }
        });
        jMenu1.add(ExitL);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1330, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameLActionPerformed

    private void ExitLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitLActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitLActionPerformed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
        // TODO add your handling code here:
        int id =Integer.parseInt(usernameL.getText());
           
             Officer o = new Officer();
              if(o.login(id)==1)
              {
                  JOptionPane.showMessageDialog(null, "Login successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                  Login d = new Login();
                  d.setVisible(true);
                  this.dispose();
              }
              
              else if(o.login(id)==-1)
              {
                  JOptionPane.showMessageDialog(null, "MySQL Exception!!", "Erorr", JOptionPane.ERROR_MESSAGE);
              }
              else if(o.login(id)==0)
              {
                  JOptionPane.showMessageDialog(null, "Invaild username", "Erorr", JOptionPane.ERROR_MESSAGE);
              }
            

    }//GEN-LAST:event_loginBActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExitL;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KButton loginB;
    private javax.swing.JTextField usernameL;
    // End of variables declaration//GEN-END:variables
}
