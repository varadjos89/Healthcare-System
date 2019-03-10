/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SupplierRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SupplierOrganization;
import Business.Prescription.WorkQueue.PrescriptionWorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Student.Role.StudentCheckPrescription;
import userinterface.Student.Role.StudentConfirmPrescription;

/**
 *
 * @author varad
 */
public class SupplierCheckPrescription extends javax.swing.JPanel {

    /**
     * Creates new form SupplierCheckPrescription
     */
    private JPanel userProcessContainer;
    private SupplierOrganization supplierOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    
    public SupplierCheckPrescription(JPanel userProcessContainer, UserAccount userAccount, SupplierOrganization supplierOrganization, Enterprise enterprise,EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierOrganization = supplierOrganization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.ecoSystem=ecoSystem;
        populateTable1();
    }
    
    public void populateTable1()
    {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        model.setRowCount(0);
        for (PrescriptionWorkRequest p : supplierOrganization.getPrescriptionWorkQueue().getPrescriptionWorkRequestList()){
            if(p.getResultFromPatient()!=null)
            {
            Object[] row = new Object[5];
            row[0] = p;
            row[1]= p.getAppointmentWorkRequest().getReceiver().getEmployee().getName();
            if(p.getResultFromSupplier()==null)
            {
               row[2]= "-";
               row[3]=p.getSupplierStatus();
            }
            else
            {
                row[2]= p.getSupplier();
                row[3]=p.getResultFromSupplier();
            }
                        
            model.addRow(row);
            }
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Doctor Name", "Patient Name", "Supplier Name", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 60, 494, 201));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 81, 34));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 324, 87, 34));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        PrescriptionWorkRequest prescriptionWorkRequest= (PrescriptionWorkRequest) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SupplierConfirmPrescription", new SupplierConfirmPrescription(userProcessContainer, prescriptionWorkRequest,userAccount,supplierOrganization, enterprise));
        layout.next(userProcessContainer);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            JOptionPane.showMessageDialog(null, "Please select any record");
        }
        
        /*PrescriptionWorkRequest prescriptionWorkRequest= (PrescriptionWorkRequest) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
        prescriptionWorkRequest.setPatientStatus("Confirm by supplier");
        prescriptionWorkRequest.setReceiver(userAccount);
        populateTable1();*/
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
