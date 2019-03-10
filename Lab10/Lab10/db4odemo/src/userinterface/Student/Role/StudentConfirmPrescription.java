/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Student.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.StudentOrganization;
import Business.Prescription.WorkQueue.PrescriptionWorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorScheduleAppointmentsJPanel;

/**
 *
 * @author varad
 */
public class StudentConfirmPrescription extends javax.swing.JPanel {

    /**
     * Creates new form StudentConfirmPrescription
     */
    private JPanel userProcessContainer;
    private StudentOrganization studentOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PrescriptionWorkRequest prescriptionWorkRequest;
    
    public StudentConfirmPrescription(JPanel userProcessContainer, PrescriptionWorkRequest prescriptionWorkRequest, UserAccount userAccount, StudentOrganization studentOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.studentOrganization= studentOrganization;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        this.prescriptionWorkRequest= prescriptionWorkRequest;
        populate();
    }

    public void populate()
    {
        jTextField1.setText(prescriptionWorkRequest.getAppointmentWorkRequest().getSender().getEmployee().getName());
        jTextField2.setText(prescriptionWorkRequest.getAppointmentWorkRequest().getDate());
        jTextField3.setText(prescriptionWorkRequest.getAppointmentWorkRequest().getTime());
        jTextArea1.setText(prescriptionWorkRequest.getPrescription());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Doctor Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 88, 109, 28));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 88, 104, 28));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Appointment Date:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 129, 135, 30));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 129, 104, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Appointment Time:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 177, 135, 28));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 177, 104, 28));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Prescription:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 223, 135, 28));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 223, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("Confrim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 386, 97, 34));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 386, 74, 34));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        prescriptionWorkRequest.setResultFromPatient("Confirmed");
        prescriptionWorkRequest.setSupplierStatus("Available");
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        StudentCheckPrescription checkPrescription = (StudentCheckPrescription) component;
        checkPrescription.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
