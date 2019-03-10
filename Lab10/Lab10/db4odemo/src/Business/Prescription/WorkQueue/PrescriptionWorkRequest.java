/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription.WorkQueue;

import Business.Appointment.WorkQueue.AppointmentBookingWorkRequest;
import Business.Appointment.WorkQueue.AppointmentWorkRequest;
import Business.UserAccount.UserAccount;

/**
 *
 * @author varad
 */
public class PrescriptionWorkRequest{
    
    private String prescription;
    private AppointmentWorkRequest appointmentWorkRequest;
    private String resultFromPatient;
    private String resultFromSupplier;
    private String patientStatus;
    private String supplierStatus;
    private UserAccount student;
    private UserAccount supplier;
    private UserAccount doctor;

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public AppointmentWorkRequest getAppointmentWorkRequest() {
        return appointmentWorkRequest;
    }

    public void setAppointmentWorkRequest(AppointmentWorkRequest appointmentWorkRequest) {
        this.appointmentWorkRequest = appointmentWorkRequest;
    }

    public String getResultFromPatient() {
        return resultFromPatient;
    }

    public void setResultFromPatient(String resultFromPatient) {
        this.resultFromPatient = resultFromPatient;
    }

    public String getResultFromSupplier() {
        return resultFromSupplier;
    }

    public void setResultFromSupplier(String resultFromSupplier) {
        this.resultFromSupplier = resultFromSupplier;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public String getSupplierStatus() {
        return supplierStatus;
    }

    public void setSupplierStatus(String supplierStatus) {
        this.supplierStatus = supplierStatus;
    }

    public UserAccount getStudent() {
        return student;
    }

    public void setStudent(UserAccount student) {
        this.student = student;
    }

    public UserAccount getSupplier() {
        return supplier;
    }

    public void setSupplier(UserAccount supplier) {
        this.supplier = supplier;
    }

    

    

    @Override
    public String toString() {
        return appointmentWorkRequest.getSender().getEmployee().getName();
    }
    
    
    
}
