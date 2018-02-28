/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipd12_java3_payslips;

import javax.swing.JOptionPane;

/**
 *
 * @author 1796138
 */
public class EPMSMainWindow extends javax.swing.JFrame {

    /**
     * Creates new form EPMSMainWindow
     */
    public EPMSMainWindow() {
        initComponents();
        initDialogs();
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
        jPanel1 = new javax.swing.JPanel();
        btAllowDeduct = new javax.swing.JButton();
        btSearchPrint = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Payroll Management System");

        jLabel1.setText("Admin last login 2018-02-27 16:33:30");
        jLabel1.setMaximumSize(new java.awt.Dimension(34, 24));
        jLabel1.setMinimumSize(new java.awt.Dimension(34, 24));
        jLabel1.setPreferredSize(new java.awt.Dimension(34, 24));
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btAllowDeduct.setBackground(new java.awt.Color(255, 255, 255));
        btAllowDeduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/size_employee.PNG"))); // NOI18N
        btAllowDeduct.setText("Manage Employee         ");
        btAllowDeduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAllowDeductActionPerformed(evt);
            }
        });

        btSearchPrint.setBackground(new java.awt.Color(255, 255, 255));
        btSearchPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/size_payment.png"))); // NOI18N
        btSearchPrint.setText("Search / Print Payment");
        btSearchPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchPrintActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/size_allowance.png"))); // NOI18N
        jButton3.setText("Allowance/Deduction    ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/f6ecc1f583a4e36dc787adc4086e10c5e25e8062.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(488, 488, 488)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSearchPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAllowDeduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(117, 117, 117))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(30, 30, 30)
                .addComponent(btAllowDeduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSearchPrint)
                .addGap(47, 47, 47))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenuItem6.setText("Generate/Print Slip");
        jMenu1.add(jMenuItem6);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manage");

        jMenuItem2.setText("Employee");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Update Salary");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Allowance");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Deduction");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Search");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initDialogs() {
       dlgEmploeeManage = new EmployeeManageDialog(this, true);
       dlgAllowanceDeduction = new AllowanceDeductionDialog(this, true);
       dlgSearchPrintSlip = new SearchPrintSlipDialog(this, true);
    }
    
    private void btAllowDeductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAllowDeductActionPerformed
         dlgEmploeeManage.setVisible(true);
    }//GEN-LAST:event_btAllowDeductActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dlgAllowanceDeduction.pack();
        dlgAllowanceDeduction.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btSearchPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchPrintActionPerformed
        dlgSearchPrintSlip.pack();
        dlgSearchPrintSlip.setVisible(true);
    }//GEN-LAST:event_btSearchPrintActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
Object[] options = {"Exit", "Cancel"};
        int decision = JOptionPane.showOptionDialog(this,
                "Are you sure exit from EPMS?",
                "Confirm Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null, //do not use a custom Icon
                options, //the titles of buttons
                options[1]); //default button title

        if (decision == JOptionPane.YES_OPTION) {   
            System.exit(1);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(EPMSMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EPMSMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EPMSMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EPMSMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EPMSMainWindow().setVisible(true);
            }
        });
    }


    private EmployeeManageDialog  dlgEmploeeManage;
    private AllowanceDeductionDialog dlgAllowanceDeduction;
    private SearchPrintSlipDialog dlgSearchPrintSlip;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAllowDeduct;
    private javax.swing.JButton btSearchPrint;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
