
package banksystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Alaa
 */
public class Withdraw extends javax.swing.JFrame {
   
    WithdrawC w = new WithdrawC();
    
    public Withdraw() {
        initComponents();
        otherT.setVisible(false);
    }
public Withdraw(Account a) {
        initComponents();
        otherT.setVisible(false);
     a=a.getData(a.getUserName(), a);
        w.setUserName(a.getUserName());
        w.setNational_ID(a.getNational_ID());
        
        w.setBalance(a.getBalance());
        
    }
 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        kButton4 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        R500 = new javax.swing.JRadioButton();
        R50 = new javax.swing.JRadioButton();
        R100 = new javax.swing.JRadioButton();
        otherR = new javax.swing.JRadioButton();
        R5000 = new javax.swing.JRadioButton();
        R1000 = new javax.swing.JRadioButton();
        otherT = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kButton4.setText("withdraw");
        kButton4.setBorderPainted(false);
        kButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton4.setkBorderRadius(40);
        kButton4.setkEndColor(new java.awt.Color(0, 204, 204));
        kButton4.setkHoverEndColor(new java.awt.Color(205, 0, 205));
        kButton4.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButton4.setkStartColor(new java.awt.Color(205, 0, 205));
        kButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, -1, -1));

        kButton5.setText("Back");
        kButton5.setBorderPainted(false);
        kButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        kButton5.setkBorderRadius(40);
        kButton5.setkEndColor(new java.awt.Color(0, 204, 204));
        kButton5.setkHoverEndColor(new java.awt.Color(205, 0, 205));
        kButton5.setkHoverStartColor(new java.awt.Color(0, 204, 204));
        kButton5.setkStartColor(new java.awt.Color(205, 0, 205));
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        R500.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(R500);
        R500.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        R500.setForeground(new java.awt.Color(0, 0, 0));
        R500.setText("500");
        R500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R500ActionPerformed(evt);
            }
        });
        jPanel1.add(R500, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        R50.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(R50);
        R50.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        R50.setForeground(new java.awt.Color(0, 0, 0));
        R50.setText("50");
        jPanel1.add(R50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 60, -1));

        R100.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(R100);
        R100.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        R100.setForeground(new java.awt.Color(0, 0, 0));
        R100.setText("100");
        jPanel1.add(R100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        otherR.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(otherR);
        otherR.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        otherR.setForeground(new java.awt.Color(0, 0, 0));
        otherR.setText("Other");
        otherR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherRActionPerformed(evt);
            }
        });
        jPanel1.add(otherR, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 350, -1, -1));

        R5000.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(R5000);
        R5000.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        R5000.setForeground(new java.awt.Color(0, 0, 0));
        R5000.setText("5000");
        jPanel1.add(R5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 220, -1, -1));

        R1000.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(R1000);
        R1000.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        R1000.setForeground(new java.awt.Color(0, 0, 0));
        R1000.setText("1000");
        jPanel1.add(R1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 110, -1, -1));

        otherT.setBackground(new java.awt.Color(255, 255, 255));
        otherT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        otherT.setForeground(new java.awt.Color(0, 0, 0));
        otherT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(otherT, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 390, 70));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 67, 1240, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1370, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        // TODO add your handling code here:
        AccountDetails a = new AccountDetails(w.getUserName());
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton4ActionPerformed
        // TODO add your handling code here:
        R50.setActionCommand("50");
        R100.setActionCommand("100");
        R500.setActionCommand("500");
        R1000.setActionCommand("1000");
        R5000.setActionCommand("5000");
        otherR.setActionCommand(otherT.getText());
       
        w.setWAmount(Double.parseDouble(buttonGroup1.getSelection().getActionCommand()));
        if(w.updateBalance())
        {
            w.updatebalance(w);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "your account balance less than amount", "Erorr", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kButton4ActionPerformed

    private void R500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R500ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R500ActionPerformed

    private void otherRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherRActionPerformed
        // TODO add your handling code here:
        otherT.setVisible(true);
    }//GEN-LAST:event_otherRActionPerformed

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton R100;
    private javax.swing.JRadioButton R1000;
    private javax.swing.JRadioButton R50;
    private javax.swing.JRadioButton R500;
    private javax.swing.JRadioButton R5000;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton4;
    private com.k33ptoo.components.KButton kButton5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton otherR;
    private javax.swing.JTextField otherT;
    // End of variables declaration//GEN-END:variables
}
