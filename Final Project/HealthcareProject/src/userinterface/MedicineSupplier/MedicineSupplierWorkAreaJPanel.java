/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicineSupplier;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.MedicineVaccineSupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicineSupplierWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monal
 */
public class MedicineSupplierWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicineSupplierWorkAreaJPanel
     */
    private JPanel container;
    private EcoSystem business;
    private UserAccount userAccount;
   
   private Network network;
    public MedicineSupplierWorkAreaJPanel() {
        initComponents();
        populateTable();
    }
   public void populateTable(){
            }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSupplierWorkRequests = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();

        tblSupplierWorkRequests.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblSupplierWorkRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSupplierWorkRequests.setRowHeight(30);
        jScrollPane1.setViewportView(tblSupplierWorkRequests);

        assignJButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        lblBanner.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblBanner.setText("Medicine Supplier Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBanner)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(assignJButton)
                                .addGap(18, 18, 18)
                                .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 361, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanner)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(processJButton))
                .addContainerGap(169, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
     int selectedRow = tblSupplierWorkRequests.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row.");
        }
        else
        {
        WorkRequest request = (WorkRequest)tblSupplierWorkRequests.getValueAt(selectedRow, 0);
        if(!request.getStatus().equalsIgnoreCase("Processing") && !request.getStatus().equalsIgnoreCase("Completed"))
        {
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
        }
        
        else
        {
         JOptionPane.showMessageDialog(null, "This request is either processed or completed. Please select other request!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        }
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

          int selectedRow = tblSupplierWorkRequests.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row.");
        }
        else
        {
        MedicineSupplierWorkRequest request = (MedicineSupplierWorkRequest)tblSupplierWorkRequests.getValueAt(selectedRow, 0);

        request.setComments("Proceed");
        populateTable();

        }
    }//GEN-LAST:event_processJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable tblSupplierWorkRequests;
    // End of variables declaration//GEN-END:variables
}
