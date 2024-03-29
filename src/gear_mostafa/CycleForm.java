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
public class CycleForm extends javax.swing.JFrame implements Node {

    /**
     * Creates new form CycleForm
     */
    public CycleForm(HomePage1 aThis) {
         this.HomePage = aThis;
        initComponents();
    }
    HomePage1 HomePage;
     private Node parent;
     @Override
    public Node getParentNode() {
        return parent;
    }
    @Override
    public void setParentNode(Node node) {
        this.parent = node;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumberText1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        numberButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Stress Cycle Factor");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        NumberText1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NumberText1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumberText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberText1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Number of hours of operation");

        numberButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numberButton.setText("Calculate");
        numberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NumberText1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(numberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumberText1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(numberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NumberText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberText1ActionPerformed

    private void numberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberButtonActionPerformed
        // TODO add your handling code here:
         try{
        double x = Double.parseDouble(NumberText1.getText());
        double cycles = HomePage.Speed *60 *x;//83333
        if (cycles <=Math.pow(10, 6.2)){
            HomePage.cycleFactor = 6.1514*Math.pow(cycles, -0.1192);
        
        }else {
            HomePage.cycleFactor = 1.3558*Math.pow(cycles, -0.0178); 
        }
        String result2 = String.format("%.2f",HomePage.cycleFactor);
        JOptionPane.showMessageDialog(null, "Stress Cycle Factor is " + result2);
        HomePage.CycleButton.setBorder(BorderFactory.createLineBorder(Color.GREEN,3));
        HomePage.CycleButton.setOpaque(true);
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please enter number of hours as a number");
        }
        
    }//GEN-LAST:event_numberButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:\
        this.setVisible(false);
        ((JFrame)getParentNode()).setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NumberText1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton numberButton;
    // End of variables declaration//GEN-END:variables
}
