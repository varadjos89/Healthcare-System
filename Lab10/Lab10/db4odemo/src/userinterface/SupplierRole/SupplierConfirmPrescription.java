/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierRole;

import Business.Appointment.WorkQueue.AppointmentBookingWorkRequest;
import Business.Appointment.WorkQueue.AppointmentWorkRequest;
import Business.DeliveryRequest.WorkQueue.DeliveryRequestWorkRequest;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.StudentOrganization;
import Business.Organization.SupplierOrganization;
import Business.Prescription.WorkQueue.PrescriptionWorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;

/**
 *
 * @author varad
 */
public class SupplierConfirmPrescription extends javax.swing.JPanel {

    /**
     * Creates new form SupplierConfirmPrescription
     */
    private JPanel userProcessContainer;
    private SupplierOrganization supplierOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private UserAccount receiverUserAccount;
    private PrescriptionWorkRequest prescriptionWorkRequest;
    private AppointmentWorkRequest appointmentWorkRequest;
    private DeliveryOrganization deliveryOrganization;
    
    public SupplierConfirmPrescription(JPanel userProcessContainer, PrescriptionWorkRequest prescriptionWorkRequest, UserAccount userAccount, SupplierOrganization supplierOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.prescriptionWorkRequest=prescriptionWorkRequest;
        this.supplierOrganization = supplierOrganization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.appointmentWorkRequest= prescriptionWorkRequest.getAppointmentWorkRequest();
        
        populate();
    }
    public void populate()
    {
        for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if (organization instanceof DeliveryOrganization){
                deliveryOrganization= (DeliveryOrganization) organization;
            for (UserAccount account : organization.getUserAccountDirectory().getUserAccountList()) {
                jComboBox2.addItem(account.getUsername());
                 }
            }
        }
        jTextField1.setText(appointmentWorkRequest.getSender().getEmployee().getName());
        jTextField3.setText(appointmentWorkRequest.getSender().getEmployee().getId()+"");
        
        jTextField2.setText(appointmentWorkRequest.getReceiver().getEmployee().getName());
        jTextField4.setText(appointmentWorkRequest.getReceiver().getEmployee().getId()+"");
        
        jTextArea1.setText(prescriptionWorkRequest.getPrescription());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Doctor Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 166, 37));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 108, 67, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 155, 67, 29));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 108, 119, 29));

        jTextField2.setEditable(false);
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 268, 119, 29));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Patient Details");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 218, 150, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 268, 76, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("ID:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 316, 76, 27));

        jTextField3.setEditable(false);
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 155, 119, 29));

        jTextField4.setEditable(false);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 315, 119, 29));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Perscription");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 378, 106, 29));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 425, 207, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 636, 108, 34));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 636, 84, 34));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Select Supplier");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 539, 112, 31));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 588, 207, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(prescriptionWorkRequest.getResultFromSupplier()==null)
        {
        prescriptionWorkRequest.setResultFromSupplier("Confirmed");
        prescriptionWorkRequest.setSupplier(userAccount);
        
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 2];
        SupplierCheckPrescription dwjp = (SupplierCheckPrescription) component;
        dwjp.populateTable1();
        
        
        String name = (String) jComboBox2.getSelectedItem();
        
        for(UserAccount ua:deliveryOrganization.getUserAccountDirectory().getUserAccountList())
        {
            if(ua.getUsername().equals(name))
            {
                receiverUserAccount=ua;
            }
        }
        
        DeliveryRequestWorkRequest  request = new DeliveryRequestWorkRequest();
        request.setDelivery(receiverUserAccount);
        request.setSupplier(userAccount);
        request.setStudent(appointmentWorkRequest.getReceiver());
        request.setAppointmentWorkRequest(appointmentWorkRequest);
        request.setPrescriptionWorkRequest(prescriptionWorkRequest);
        request.setStatus("Pending");
        
        Organization orgDelivery = null;
        Organization orgSupplier=null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DeliveryOrganization){
                orgDelivery = organization;
                break;
            }
        }
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof SupplierOrganization){
                orgSupplier = organization;
                break;
            }
        }
        if (orgDelivery!=null){
            orgDelivery.getDeliveryRequestWorkQueue().getDeliveryRequestWorkRequests().add(request);
            receiverUserAccount.getDeliveryRequestWorkQueue().getDeliveryRequestWorkRequests().add(request);
        }
        
         if (orgSupplier!=null){
            orgSupplier.getDeliveryRequestWorkQueue().getDeliveryRequestWorkRequests().add(request);
            userAccount.getDeliveryRequestWorkQueue().getDeliveryRequestWorkRequests().add(request);
        }
        
        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Prescription is already alloted to supplier "+prescriptionWorkRequest.getSupplier());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
