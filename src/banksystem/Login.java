
package banksystem;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        usernameL = new javax.swing.JTextField();
        passwordL = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registerLB = new com.k33ptoo.components.KButton();
        loginB = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ExitL = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

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
        kGradientPanel1.add(usernameL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 400, 40));

        passwordL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordL.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        passwordL.setOpaque(false);
        kGradientPanel1.add(passwordL, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 400, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Password");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 70, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("OR");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, 30, -1));

        registerLB.setText("Register");
        registerLB.setBorderPainted(false);
        registerLB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        registerLB.setkBorderRadius(40);
        registerLB.setkEndColor(new java.awt.Color(0, 204, 204));
        registerLB.setkHoverEndColor(new java.awt.Color(204, 0, 204));
        registerLB.setkHoverForeGround(new java.awt.Color(255, 204, 255));
        registerLB.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        registerLB.setkStartColor(new java.awt.Color(204, 0, 204));
        registerLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerLBActionPerformed(evt);
            }
        });
        kGradientPanel1.add(registerLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 150, 40));

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
        kGradientPanel1.add(loginB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 150, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("username");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 100, -1));

        jMenu1.setText("Go");

        ExitL.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        ExitL.setText("Exit");
        ExitL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitLActionPerformed(evt);
            }
        });
        jMenu1.add(ExitL);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setText("home");
        jMenu1.add(jMenuItem1);

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
        String  username =usernameL.getText();
            String pass=passwordL.getText();
            Integer p;
            p = Integer.parseInt(pass);
           
             Account D = new Account();
              if(D.login(username ,p)==1)
              {
                  JOptionPane.showMessageDialog(null, "Login successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                  AccountDetails d = new AccountDetails(username); 
                  d.setVisible(true);
                  this.dispose();   
              }
              else if(D.login(username, p)==-1)
              {
                  JOptionPane.showMessageDialog(null, "MySQL Exception!!", "Erorr", JOptionPane.ERROR_MESSAGE);
              }
              else if(D.login(username, p)==0)
              {
                  JOptionPane.showMessageDialog(null, "Invaild username or password", "Erorr", JOptionPane.ERROR_MESSAGE);
              }
            

    }//GEN-LAST:event_loginBActionPerformed

    private void registerLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerLBActionPerformed
        // TODO add your handling code here:
        firstone f = new firstone();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerLBActionPerformed

 
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExitL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KButton loginB;
    private javax.swing.JPasswordField passwordL;
    private com.k33ptoo.components.KButton registerLB;
    private javax.swing.JTextField usernameL;
    // End of variables declaration//GEN-END:variables
}
