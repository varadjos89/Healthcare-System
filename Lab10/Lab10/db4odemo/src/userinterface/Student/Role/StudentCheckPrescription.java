/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Student.Role;

import Business.Appointment.WorkQueue.AppointmentBookingWorkRequest;
import Business.Appointment.WorkQueue.AppointmentWorkRequest;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.Prescription.WorkQueue.PrescriptionWorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author varad
 */
public class StudentCheckPrescription extends javax.swing.JPanel {

    /**
     * Creates new form StudentCheckPrescription
     */
    private JPanel userProcessContainer;
    private StudentOrganization studentOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    
    public StudentCheckPrescription(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.studentOrganization=(StudentOrganization) organization;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        
        populateTable();
    }

     public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (PrescriptionWorkRequest p : studentOrganization.getPrescriptionWorkQueue().getPrescriptionWorkRequestList()){
            if(p.getStudent().equals(userAccount))
            {
            Object[] row = new Object[4];
            
            row[0] = p;
            row[1]= p.getAppointmentWorkRequest().getDate();
            row[2] = p.getAppointmentWorkRequest().getTime();
            if(p.getResultFromPatient()==null)
               row[3] =p.getPatientStatus();
            else
               row[3] =p.getResultFromPatient();
            model.addRow(row);
            }
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Date", "Time", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 126, 465, 97));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 271, 90, 38));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 271, -1, 38));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        PrescriptionWorkRequest prescriptionWorkRequest= (PrescriptionWorkRequest) workRequestJTable.getValueAt(workRequestJTable.getSelectedRow(), 0);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new StudentConfirmPrescription(userProcessContainer, prescriptionWorkRequest,userAccount,studentOrganization, enterprise));
        layout.next(userProcessContainer);   
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "Please select any record");
        }
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
