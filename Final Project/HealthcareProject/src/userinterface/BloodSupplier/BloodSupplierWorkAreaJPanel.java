/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.BloodSupplier;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.BloodBankOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sylvester
 */
public class BloodSupplierWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodSupplierWorkAreaJPanel
     */
    private JPanel container;
    private EcoSystem business;
    private UserAccount userAccount;
    Enterprise enterprise;
    Network network;
    private BloodBankOrganization bloodBankOrganization;
    public BloodSupplierWorkAreaJPanel(JPanel container, UserAccount userAccount, Organization organization, Enterprise enterprise,Network network) {
        initComponents();
        this.container=container;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        this.bloodBankOrganization = (BloodBankOrganization)organization;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tblBloodrequest.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : bloodBankOrganization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request.getRequestDate();
            row[1] = request;
            //row[2] = request.getSender();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            
            model.addRow(row);
        }
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
        tblBloodrequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        lblBanner = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tblBloodrequest.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblBloodrequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Date", "Blood Required", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBloodrequest.setRowHeight(30);
        jScrollPane1.setViewportView(tblBloodrequest);
        if (tblBloodrequest.getColumnModel().getColumnCount() > 0) {
            tblBloodrequest.getColumnModel().getColumn(0).setResizable(false);
            tblBloodrequest.getColumnModel().getColumn(1).setResizable(false);
            tblBloodrequest.getColumnModel().getColumn(2).setResizable(false);
            tblBloodrequest.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAssign.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        lblBanner.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblBanner.setText("Blood Supplier Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBanner)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAssign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnProcess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanner)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssign)
                .addGap(18, 18, 18)
                .addComponent(btnProcess)
                .addContainerGap(175, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int selectedRow = tblBloodrequest.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row.");
        }

        WorkRequest request = (WorkRequest)tblBloodrequest.getValueAt(selectedRow, 1);
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
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int selectedRow = tblBloodrequest.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row.");
        }

        WorkRequest request = (WorkRequest)tblBloodrequest.getValueAt(selectedRow, 1);
        if(request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equalsIgnoreCase("Processing") )
        {
        request.setStatus("Processed");
        populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a pending request!!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnProcessActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JTable tblBloodrequest;
    // End of variables declaration//GEN-END:variables
}
