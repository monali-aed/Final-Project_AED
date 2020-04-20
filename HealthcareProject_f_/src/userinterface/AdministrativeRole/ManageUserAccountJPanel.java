/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private EcoSystem business;

    ManageUserAccountJPanel(JPanel userProcessContainer, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        this.business = business;
        popOrganizationComboBox();
        popData();
    }

    public void popOrganizationComboBox() {
        boxOrganization.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            boxOrganization.addItem(organization);
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        boxEmployee.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            boxEmployee.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        boxRole.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            boxRole.addItem(role);
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) tblUser.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) tblUser.getModel()).addRow(row);
            }
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

        jPanel1 = new javax.swing.JPanel();
        btnCreateUser = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        lblEmployee = new javax.swing.JLabel();
        boxEmployee = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblOrganization = new javax.swing.JLabel();
        boxOrganization = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        boxRole = new javax.swing.JComboBox();
        lblBanner = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();

        btnCreateUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnCreateUser.setText("Add User");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        lblUserName.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblUserName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserName.setText("User Name:");

        tblUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUser.setRowHeight(30);
        jScrollPane1.setViewportView(tblUser);

        lblEmployee.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblEmployee.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmployee.setText("Employee:");

        boxEmployee.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEmployeeActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganization.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblOrganization.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrganization.setText("Organization:");

        boxOrganization.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxOrganization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boxOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxOrganizationActionPerformed(evt);
            }
        });

        lblRole.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Role:");

        boxRole.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        boxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblBanner.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        lblBanner.setText("Manage Users");

        lblPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");

        lblPassword1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblPassword1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword1.setText("Re-Type Password");

        txtRePassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtRePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRePasswordKeyPressed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBanner)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblOrganization, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(boxEmployee, 0, 401, Short.MAX_VALUE)
                                .addComponent(boxOrganization, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 255, Short.MAX_VALUE)
                                .addComponent(lblPassword1)
                                .addGap(53, 53, 53))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateUser)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanner)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrganization)
                            .addComponent(boxOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployee)
                            .addComponent(boxEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRole)
                            .addComponent(boxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword1)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCreateUser)
                        .addContainerGap(77, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        String userName = txtName.getText();
        String password = txtPassword.getText();
        if(userName.isEmpty() || password.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please enter some value", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Organization organization = (Organization) boxOrganization.getSelectedItem();
            Employee employee = (Employee) boxEmployee.getSelectedItem();
            Role role = (Role) boxRole.getSelectedItem();
            //organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
            if(business.checkIfUserIsUnique(userName) == true)
            {
                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                JOptionPane.showMessageDialog(null, "User added successfully...!!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Username is already in use.", "Warning", JOptionPane.WARNING_MESSAGE);
            }

            txtName.setText("");
            txtPassword.setText("");
            txtRePassword.setText("");

            popData();
        }
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void boxOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxOrganizationActionPerformed
        Organization organization = (Organization) boxOrganization.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_boxOrganizationActionPerformed

    private void txtRePasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRePasswordKeyPressed
        String check = "" +evt.getKeyChar();
        String confirmPwd = txtRePassword.getText();
        if(!check.isEmpty())
        {
            confirmPwd += check;
            System.out.println("COnfirm Pwd : "+confirmPwd);

        }
        if(txtPassword.getText().equals(confirmPwd))
        {
            txtRePassword.setBackground(Color.white);
            txtRePassword.setBorder(new LineBorder(Color.lightGray, 2));

        }
        else
        {
            txtRePassword.setBackground(Color.red);
            txtRePassword.setBorder(new LineBorder(Color.red, 2));

        }
    }//GEN-LAST:event_txtRePasswordKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void boxEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxEmployeeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxEmployee;
    private javax.swing.JComboBox boxOrganization;
    private javax.swing.JComboBox boxRole;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    // End of variables declaration//GEN-END:variables
}
