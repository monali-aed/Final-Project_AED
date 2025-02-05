/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
//import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author sylvester
 */
public class SystemAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminJPanel
     */
    JPanel container;
    EcoSystem system;
    Network network;
    public SystemAdminJPanel(JPanel container, EcoSystem system, Network network) {
        initComponents();
        this.container=container;
        this.system=system;
        this.network = network;
        
        populateTree();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        panRight = new javax.swing.JPanel();
        banner = new javax.swing.JLabel();
        btnManageNetwork = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManageEnterpriseAdmin = new javax.swing.JButton();
        lblSelectedNode = new javax.swing.JLabel();
        lblCheckSelectedNode = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        splitPane.setDividerLocation(200);

        tree.setBackground(new java.awt.Color(0, 153, 204));
        tree.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                treeFocusGained(evt);
            }
        });
        tree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                treeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tree);

        splitPane.setLeftComponent(jScrollPane1);

        panRight.setBackground(new java.awt.Color(0, 153, 204));

        banner.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        banner.setText("System Admin Work Area");

        btnManageNetwork.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnManageNetwork.setText("Manage Network");
        btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageNetworkActionPerformed(evt);
            }
        });

        btnManageEnterprise.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnManageEnterprise.setText("Manage Enterprise");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnManageEnterpriseAdmin.setText("Manage Enterprise Admin");
        btnManageEnterpriseAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminActionPerformed(evt);
            }
        });

        lblSelectedNode.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblSelectedNode.setText("Selected Node:");

        lblCheckSelectedNode.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblCheckSelectedNode.setText("check selected node");

        javax.swing.GroupLayout panRightLayout = new javax.swing.GroupLayout(panRight);
        panRight.setLayout(panRightLayout);
        panRightLayout.setHorizontalGroup(
            panRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnManageEnterpriseAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEnterprise, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(banner)
                    .addGroup(panRightLayout.createSequentialGroup()
                        .addComponent(lblSelectedNode)
                        .addGap(18, 18, 18)
                        .addComponent(lblCheckSelectedNode)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        panRightLayout.setVerticalGroup(
            panRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(banner)
                .addGap(18, 18, 18)
                .addGroup(panRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectedNode)
                    .addComponent(lblCheckSelectedNode))
                .addGap(97, 97, 97)
                .addComponent(btnManageNetwork)
                .addGap(38, 38, 38)
                .addComponent(btnManageEnterprise)
                .addGap(38, 38, 38)
                .addComponent(btnManageEnterpriseAdmin)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(panRight);

        add(splitPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    
    public void populateTree()
    {
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();

        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();

            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }

        model.reload();
    }
    
    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        ManageNetworkJPanel manageNetworkJPanel= new ManageNetworkJPanel(container, system);
        CardLayout layout= (CardLayout) container.getLayout();
        container.add("ManageNetworkJPanel", manageNetworkJPanel);
        layout.next(container);
    }//GEN-LAST:event_btnManageNetworkActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
       ManageEnterpriseJPanel manageEnterpriseJPanel= new ManageEnterpriseJPanel(container, system);
        CardLayout layout= (CardLayout) container.getLayout();
        container.add("ManageEnterpriseJPanel", manageEnterpriseJPanel);
        layout.next(container);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageEnterpriseAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminActionPerformed
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(container, system);
        CardLayout layout= (CardLayout) container.getLayout();
        container.add("ManageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);
        layout.next(container);
    }//GEN-LAST:event_btnManageEnterpriseAdminActionPerformed

    private void treeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_treeFocusGained
        // TODO add your handling code here:
        valueChange();
    }//GEN-LAST:event_treeFocusGained

    private void treeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_treeValueChanged
        // TODO add your handling code here:
        valueChange();
    }//GEN-LAST:event_treeValueChanged

    private void valueChange()
    { 
     DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            lblCheckSelectedNode.setText(selectedNode.toString());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel banner;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageEnterpriseAdmin;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCheckSelectedNode;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JPanel panRight;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables

   
}
