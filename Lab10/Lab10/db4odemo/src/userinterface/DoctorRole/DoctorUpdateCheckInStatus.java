/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Appointment.WorkQueue.AppointmentBookingWorkRequest;
import Business.Appointment.WorkQueue.AppointmentWorkRequest;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author varad
 */
public class DoctorUpdateCheckInStatus extends javax.swing.JPanel {

    /**
     * Creates new form DoctorUpdateCheckInStatus
     */
    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AppointmentWorkRequest awr;
    
    public DoctorUpdateCheckInStatus(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, DoctorOrganization organization, AppointmentWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.awr= request;
        
        jTextField2.setText(awr.getReceiver().getEmployee().getName());
        jTextField3.setText(awr.getAppointmentNumber()+"");
        jTextField4.setText(awr.getDate());
        jTextField1.setText(awr.getTime());
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Appointment Time:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 130, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Appointment Information");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 26, 240, 42));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Patient Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 120, 42));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Appointment ID:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 120, 42));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Appointment Date:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, 42));

        jTextField1.setEditable(false);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 190, 40));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 190, 40));

        jTextField3.setEditable(false);
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 190, 40));

        jTextField4.setEditable(false);
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 190, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("Update Status");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 170, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 70, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AppointmentBookingWorkRequest workRequest=(AppointmentBookingWorkRequest) awr;
        if(workRequest.getBookingResult()==null)
        {
              JOptionPane.showMessageDialog(null, "Appointment is still not booked");
        }
        else
        {
             workRequest.setBookingResult("Checked In");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        
        DoctorScheduleAppointmentsJPanel dsajp = (DoctorScheduleAppointmentsJPanel) component;
        dsajp.populateAppointmentTable();
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
        System.out.println(componentArray.length);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
