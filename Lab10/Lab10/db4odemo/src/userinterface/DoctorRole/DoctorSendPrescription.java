/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Appointment.WorkQueue.AppointmentBookingWorkRequest;
import Business.Appointment.WorkQueue.AppointmentWorkRequest;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.StoreEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.Organization.SupplierOrganization;
import Business.Prescription.WorkQueue.PrescriptionWorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author varad
 */
public class DoctorSendPrescription extends javax.swing.JPanel {

    /**
     * Creates new form DoctorSendPrescription
     */
    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AppointmentWorkRequest appointmentWorkRequest;
    private EcoSystem ecoSystem;
    
    public DoctorSendPrescription(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise,AppointmentWorkRequest appointmentWorkRequest,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.appointmentWorkRequest=appointmentWorkRequest;
        this.ecoSystem= ecoSystem;
        jTextField2.setText(this.appointmentWorkRequest.getReceiver().getEmployee().getName());
        jTextField1.setText(this.appointmentWorkRequest.getReceiver().getUsername());
    }


    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Patient Details:-");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 57, 120, 45));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 152, 93, 33));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Username");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 203, 93, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Prescription");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 256, 118, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 256, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("Send Prescription");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 170, -1));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 170, -1));

        jTextField2.setEditable(false);
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 170, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String pres= jTextArea1.getText();
        PrescriptionWorkRequest request=new PrescriptionWorkRequest();
        request.setPrescription(pres);
        request.setAppointmentWorkRequest(appointmentWorkRequest);
        request.setPatientStatus("Given");
        request.setDoctor(userAccount);
        request.setStudent(appointmentWorkRequest.getReceiver());
        
        Organization studentOrg = null;
        Organization supplierOrg=null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof StudentOrganization){
                studentOrg = organization;
                break;
            }
        }
        for(Network network :ecoSystem.getNetworkList())
        {
            for(Enterprise e: network.getEnterpriseDirectory().getEnterpriseList())
            {
                if(e  instanceof StoreEnterprise)
                {
                     for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof SupplierOrganization){
                      supplierOrg = organization;
                      break;
                      }
                    }
                 }
            }
        }
        
        if (studentOrg!=null){
            studentOrg.getPrescriptionWorkQueue().getPrescriptionWorkRequestList().add(request);
            userAccount.getPrescriptionWorkQueue().getPrescriptionWorkRequestList().add(request);
        }
        if (supplierOrg!=null){
            supplierOrg.getPrescriptionWorkQueue().getPrescriptionWorkRequestList().add(request);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
