/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gear_mostafa;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author taver
 */
public class KoPage extends javax.swing.JFrame implements Node {

    /**
     * Creates new form homepage
     */
    public KoPage(HomePage1 HomePage) {
        this.HomePage = HomePage;
        initComponents();
    }
    HomePage1 HomePage;
     private Node parent;
     @Override
    public Node getParentNode() {
        return parent;
    }
    double PowerFactor=0,MachineFactor=0,KoValue=0;
    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }
    /**s
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KoPowerFactor = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        KoMachineFactor = new javax.swing.JComboBox<>();
        koCalcButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Overload Factor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        KoPowerFactor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        KoPowerFactor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uniform Load", "Light Shock", "Medium Shock" }));
        KoPowerFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KoPowerFactorActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Driven machine shock");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Power source shock");

        KoMachineFactor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        KoMachineFactor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uniform Load", "Moderate Shock", "Heavy Shock" }));
        KoMachineFactor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KoMachineFactorActionPerformed(evt);
            }
        });

        koCalcButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        koCalcButton.setText("Calculate");
        koCalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koCalcButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(KoMachineFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KoPowerFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(koCalcButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KoPowerFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KoMachineFactor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(koCalcButton)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void KoPowerFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KoPowerFactorActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_KoPowerFactorActionPerformed

    private void KoMachineFactorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KoMachineFactorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_KoMachineFactorActionPerformed

    private void koCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koCalcButtonActionPerformed
        // TODO add your handling code here:
        switch (KoPowerFactor.getSelectedIndex()) {
            case 0 -> PowerFactor = 0;
            case 1 -> PowerFactor =0.25;
            case 2 -> PowerFactor =0.5;
            default -> {
            }
        }
        switch (KoMachineFactor.getSelectedIndex()) {
            case 0 -> MachineFactor = 0;
            case 1 -> MachineFactor =0.5;
            case 2 -> MachineFactor=0.75;
            default -> {
            }
        }
        HomePage.KoValue = 1 + PowerFactor + MachineFactor;
        //System.out.println("KoValue" + HomePage.KoValue);
        JOptionPane.showMessageDialog(null," Overload factor = " + HomePage.KoValue);
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
        HomePage.KoButton.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
        HomePage.KoButton.setOpaque(true);
        
        
    }//GEN-LAST:event_koCalcButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
         this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(KoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(KoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(KoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(KoPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//          
//     
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> KoMachineFactor;
    private javax.swing.JComboBox<String> KoPowerFactor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton koCalcButton;
    // End of variables declaration//GEN-END:variables
}
