
package banksystem;


import javax.swing.table.DefaultTableModel;

public class AccountDetails extends javax.swing.JFrame {

    /**
     * Creates new form AccountDetails
     */
  
    public AccountDetails() {
        initComponents();
     
    }
      Account D = new Account();
    public AccountDetails(String username) {
        
        initComponents();
      
        D =D.getData(username,D); 
        usernameAD.setText(D.getUserName());
        addressAD.setText(D.getAddress());
        nidAD.setText(D.getNational_ID());
        balanceAD.setText(Double.toString(D.getBalance()));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        depositAD = new com.k33ptoo.components.KButton();
        withdrawAD = new com.k33ptoo.components.KButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LogoAD = new com.k33ptoo.components.KButton();
        usernameAD = new javax.swing.JTextField();
        balanceAD = new javax.swing.JTextField();
        nidAD = new javax.swing.JTextField();
        addressAD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome Sir");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Username");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Balance");

        depositAD.setText("deposit");
        depositAD.setBorderPainted(false);
        depositAD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        depositAD.setkBorderRadius(40);
        depositAD.setkEndColor(new java.awt.Color(0, 204, 204));
        depositAD.setkHoverEndColor(new java.awt.Color(205, 0, 205));
        depositAD.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        depositAD.setkStartColor(new java.awt.Color(205, 0, 205));
        depositAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositADActionPerformed(evt);
            }
        });

        withdrawAD.setText("Withdraw");
        withdrawAD.setBorderPainted(false);
        withdrawAD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        withdrawAD.setkBorderRadius(40);
        withdrawAD.setkEndColor(new java.awt.Color(0, 204, 204));
        withdrawAD.setkHoverEndColor(new java.awt.Color(205, 0, 205));
        withdrawAD.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        withdrawAD.setkStartColor(new java.awt.Color(205, 0, 205));
        withdrawAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawADActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("National ID");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Adress");

        LogoAD.setText("log Out");
        LogoAD.setBorderPainted(false);
        LogoAD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoAD.setkBorderRadius(40);
        LogoAD.setkEndColor(new java.awt.Color(0, 204, 204));
        LogoAD.setkHoverEndColor(new java.awt.Color(205, 0, 205));
        LogoAD.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        LogoAD.setkStartColor(new java.awt.Color(205, 0, 205));
        LogoAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoADActionPerformed(evt);
            }
        });

        usernameAD.setBackground(new java.awt.Color(255, 255, 255));
        usernameAD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameAD.setForeground(new java.awt.Color(0, 0, 0));
        usernameAD.setBorder(null);
        usernameAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameADActionPerformed(evt);
            }
        });

        balanceAD.setBackground(new java.awt.Color(255, 255, 255));
        balanceAD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        balanceAD.setForeground(new java.awt.Color(0, 0, 0));
        balanceAD.setBorder(null);
        balanceAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceADActionPerformed(evt);
            }
        });

        nidAD.setBackground(new java.awt.Color(255, 255, 255));
        nidAD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nidAD.setForeground(new java.awt.Color(0, 0, 0));
        nidAD.setBorder(null);
        nidAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nidADActionPerformed(evt);
            }
        });

        addressAD.setBackground(new java.awt.Color(255, 255, 255));
        addressAD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addressAD.setForeground(new java.awt.Color(0, 0, 0));
        addressAD.setBorder(null);
        addressAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressADActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(485, 485, 485))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameAD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balanceAD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressAD, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nidAD, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 397, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(depositAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogoAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nidAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(balanceAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(withdrawAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(depositAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogoAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoADActionPerformed
        // TODO add your handling code here:
        Login g = new Login();
        g.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoADActionPerformed

    private void withdrawADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawADActionPerformed
        // TODO add your handling code here:
        Withdraw w = new Withdraw(D);
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_withdrawADActionPerformed

    private void depositADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositADActionPerformed
        // TODO add your handling code here:
        deposit d = new deposit(D);
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_depositADActionPerformed

    private void addressADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressADActionPerformed

    private void nidADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nidADActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nidADActionPerformed

    private void balanceADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceADActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_balanceADActionPerformed

    private void usernameADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameADActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_usernameADActionPerformed

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
            java.util.logging.Logger.getLogger(AccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccountDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton LogoAD;
    private javax.swing.JTextField addressAD;
    private javax.swing.JTextField balanceAD;
    private com.k33ptoo.components.KButton depositAD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField nidAD;
    private javax.swing.JTextField usernameAD;
    private com.k33ptoo.components.KButton withdrawAD;
    // End of variables declaration//GEN-END:variables
}
