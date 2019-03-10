/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PhysioRole;

import Business.Appointment.WorkQueue.AppointmentWorkRequest;
import Business.BodyPartsInfo.WorkQueue.BodyPartsInfoWorkRequest;
import Business.Enterprise.Enterprise;
import Business.GymAppointment.WorkQueue.GymAddAppointmentWorkRequest;
import Business.Organization.PhysiotherapistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author varad
 */
public class PhysioBookTrainerAppointment extends javax.swing.JPanel {

    /**
     * Creates new form PhysioBookTrainerAppointment
     */
    
    private JPanel userProcessContainer;
    private PhysiotherapistOrganization physiotherapistOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private GymAddAppointmentWorkRequest request;
    private BodyPartsInfoWorkRequest bodyPartsInfoWorkRequest;
    private AppointmentWorkRequest appointmentWorkRequest;
    public PhysioBookTrainerAppointment(JPanel userProcessContainer, UserAccount userAccount, PhysiotherapistOrganization physiotherapistOrganization,Enterprise enterprise, GymAddAppointmentWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.physiotherapistOrganization = physiotherapistOrganization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.request=request;
        bodyPartsInfoWorkRequest=request.getBodyPartsInfoWorkRequest();
        appointmentWorkRequest= bodyPartsInfoWorkRequest.getAppointmentWorkRequest();
        populateData();
        
    }

 
    
    public void populateData()
    {
        jTextField1.setText(bodyPartsInfoWorkRequest.getDoctor().getUsername());
        jTextField2.setText(bodyPartsInfoWorkRequest.getStudent().getEmployee().getName());
        jTextField3.setText(bodyPartsInfoWorkRequest.getStudent().getUsername());
        jTextField5.setText(request.getGymnasium().getUsername());
        jTextArea1.setText(bodyPartsInfoWorkRequest.getBodyInfo());
    }

    

     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Doctor Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 29, 155, 35));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Username :-");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 82, 93, 35));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 82, 182, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Patient Details");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 157, 143, 35));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Name :-");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 199, 93, 35));
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 199, 182, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Username :-");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 247, 93, 35));
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 247, 182, 35));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Body Parts Info :-");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 41));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 316, 181, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Excercise Info :-");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 130, 38));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 441, 181, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 695, 116, 37));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 695, 100, 37));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Trainer Details");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 555, 117, 31));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Name :-");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 601, 100, 30));
        add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 599, 182, 35));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 4];
        
        PhysioCheckDoctorRequests dsajp = (PhysioCheckDoctorRequests) component;
        dsajp.populateTable();
        request.getBodyPartsInfoWorkRequest().setTrainerStatus("Booked");
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
