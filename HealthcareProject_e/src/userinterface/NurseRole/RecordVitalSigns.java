/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author monal
 */
public class RecordVitalSigns extends javax.swing.JPanel {

    /**
     * Creates new form RecordVitalSigns
     */
    JPanel container;
    public RecordVitalSigns() {
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

        txtPulseRate = new javax.swing.JTextField();
        btnRecord = new javax.swing.JButton();
        txtBloodPressure = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        txtBodyTemp = new javax.swing.JTextField();
        txtRespRate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        txtPulseRate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtPulseRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPulseRateFocusLost(evt);
            }
        });
        txtPulseRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPulseRateKeyTyped(evt);
            }
        });

        btnRecord.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnRecord.setText("Record");
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        txtBloodPressure.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtBloodPressure.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBloodPressureFocusLost(evt);
            }
        });
        txtBloodPressure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBloodPressureKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Body Temperature:");

        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Respiration Rate:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Pulse Rate:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Blood Pressure:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Comments:");

        txtComments.setColumns(20);
        txtComments.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtComments.setRows(5);
        txtComments.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCommentsFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(txtComments);

        txtBodyTemp.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtBodyTemp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBodyTempFocusLost(evt);
            }
        });
        txtBodyTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBodyTempActionPerformed(evt);
            }
        });
        txtBodyTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBodyTempKeyReleased(evt);
            }
        });

        txtRespRate.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtRespRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespRateFocusLost(evt);
            }
        });
        txtRespRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRespRateKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("RECORD VITAL SIGN:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(btnRecord)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBodyTemp)
                            .addComponent(txtRespRate)
                            .addComponent(txtPulseRate)
                            .addComponent(txtBloodPressure)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBodyTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRespRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPulseRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPulseRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPulseRateFocusLost

        try
        {
        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_txtPulseRateFocusLost

    private void txtPulseRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPulseRateKeyTyped
    
    }//GEN-LAST:event_txtPulseRateKeyTyped

    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordActionPerformed
        // TODO add your handling code here:
 if(txtBodyTemp[JTextField].getText().isEmpty() || txtRespRate[JTextField].getText().isEmpty()
            || txtPulseRate[JTextField].getText().isEmpty() || txtBloodPressure[JTextField].getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter all the fields!","Warning",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try {
                RecordVitalSigns.setManufacturer(txtBodyTemp[JTextField].getText());
                RecordVitalSigns.setYearOfManufacture(Integer.parseInt(txtRespRate[JTextField].getText()));
                RecordVitalSigns.setModel(Integer.parseInt(txtPulseRate[JTextField].getText()));
                RecordVitalSigns.setSerialNumber(Long.parseLong(txtBloodPressure[JTextField].getText()));

                JOptionPane.showMessageDialog(null,"Patient Details Recorded Successfully!");
                disableFields();
                btnRecord[JButton].setEnabled(true);
            }
            catch(NumberFormatException exc)
            {
                JOptionPane.showMessageDialog(null, "Only Numbers Allowed");
                return;
            }
        }
      
       
    }//GEN-LAST:event_btnRecordActionPerformed

    private void txtBloodPressureFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBloodPressureFocusLost

     
    }//GEN-LAST:event_txtBloodPressureFocusLost

    private void txtBloodPressureKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBloodPressureKeyTyped
         // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtCommentsFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCommentsFocusLost

    }//GEN-LAST:event_txtCommentsFocusLost

    private void txtBodyTempFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBodyTempFocusLost
        
    }//GEN-LAST:event_txtBodyTempFocusLost

    private void txtBodyTempKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBodyTempKeyReleased
       
// TODO add your handling code here:
    }//GEN-LAST:event_txtBodyTempKeyReleased

    private void txtRespRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRespRateFocusLost

    }//GEN-LAST:event_txtRespRateFocusLost

    private void txtRespRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRespRateKeyTyped
         // TODO add your handling code here:
    }//GEN-LAST:event_txtRespRateKeyTyped

    private void txtBodyTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBodyTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBodyTempActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtBodyTemp;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtPulseRate;
    private javax.swing.JTextField txtRespRate;
    // End of variables declaration//GEN-END:variables
}
