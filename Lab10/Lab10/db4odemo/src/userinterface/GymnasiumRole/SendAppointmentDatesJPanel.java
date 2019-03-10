/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GymnasiumRole;

import Business.Enterprise.Enterprise;
import Business.GymAppointment.WorkQueue.GymAddAppointmentWorkRequest;
import Business.Organization.GymnasiumOrganization;
import Business.Organization.Organization;
import Business.Organization.PhysiotherapistOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author varad
 */
public class SendAppointmentDatesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SendAppointmentDatesJPanel
     */
    private JPanel userProcessContainer;
    private GymnasiumOrganization gymnasiumOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    public SendAppointmentDatesJPanel(JPanel userProcessContainer, UserAccount userAccount, GymnasiumOrganization gymnasiumOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.gymnasiumOrganization = gymnasiumOrganization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
    }

    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Date date=new Date();
        SpinnerDateModel sm=
        new SpinnerDateModel(date,null,null, Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        requestTestJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDateChooser1.setDateFormatString(" dd MMM yyyy");
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 140, 30));

        jSpinner1.setModel(sm);

        JSpinner.DateEditor de=new JSpinner.DateEditor(jSpinner1, "HH:mm:ss");
        jSpinner1.setEditor(de);
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 140, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Time");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 53, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Date");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 56, 53, 30));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        requestTestJButton.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        requestTestJButton.setText("Update");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        GymnasiumAddAppointmentJPanel appointmentsJPanel = (GymnasiumAddAppointmentJPanel) component;
        appointmentsJPanel.populateAppointmentTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        /*String date = messageJTextField.getText();
        String time = messageJTextField1.getText();*/

        try{
            GymAddAppointmentWorkRequest request = new GymAddAppointmentWorkRequest();
            Date date=jDateChooser1.getDate();
            Date date1= (Date) jSpinner1.getValue();

            DateFormat sdf=new SimpleDateFormat("dd MMM YYYY");
            DateFormat df=new SimpleDateFormat("HH:MM:ss");

            if(date.compareTo(Calendar.getInstance().getTime())>=0)
            {

                request.setDate(sdf.format(date));
                request.setTime(df.format(date1) );
                request.setStatus("Available");
                request.setGymnasium(userAccount);

                Organization org = null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof PhysiotherapistOrganization){
                        org = organization;
                        break;
                    }
                }
                
                if (org!=null){
                    org.getGymAddAppointmentWorkQueue().getGymAppointmentWorkRequestList().add(request);
                    userAccount.getGymAddAppointmentWorkQueue().getGymAppointmentWorkRequestList().add(request);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please select proper date");
            }
        }
        catch(NullPointerException e)
        {
            JOptionPane.showMessageDialog(null, "Please select date and time");
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton requestTestJButton;
    // End of variables declaration//GEN-END:variables
}