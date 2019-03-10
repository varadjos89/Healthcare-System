/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BodyPartsInfo.WorkQueue;

import Business.Appointment.WorkQueue.AppointmentWorkRequest;
import Business.UserAccount.UserAccount;

/**
 *
 * @author deodh
 */
public class BodyPartsInfoWorkRequest {
    private String bodyInfo;
    
    private String resultFromPatient;
    private String resultFromPhysio;
    private String patientStatus;
    private String physioStatus;
    private String trainerStatus;
    
    private UserAccount student;
    private UserAccount physio;
    private UserAccount doctor;
    private AppointmentWorkRequest appointmentWorkRequest;

    public String getTrainerStatus() {
        return trainerStatus;
    }

    public void setTrainerStatus(String trainerStatus) {
        this.trainerStatus = trainerStatus;
    }

    
    public AppointmentWorkRequest getAppointmentWorkRequest() {
        return appointmentWorkRequest;
    }

    public void setAppointmentWorkRequest(AppointmentWorkRequest appointmentWorkRequest) {
        this.appointmentWorkRequest = appointmentWorkRequest;
    }
    

    public String getBodyInfo() {
        return bodyInfo;
    }

    public void setBodyInfo(String bodyInfo) {
        this.bodyInfo = bodyInfo;
    }

    public String getResultFromPatient() {
        return resultFromPatient;
    }

    public void setResultFromPatient(String resultFromPatient) {
        this.resultFromPatient = resultFromPatient;
    }

    public String getResultFromPhysio() {
        return resultFromPhysio;
    }

    public void setResultFromPhysio(String resultFromPhysio) {
        this.resultFromPhysio = resultFromPhysio;
    }

    public String getPatientStatus() {
        return patientStatus;
    }

    public void setPatientStatus(String patientStatus) {
        this.patientStatus = patientStatus;
    }

    public String getPhysioStatus() {
        return physioStatus;
    }

    public void setPhysioStatus(String physioStatus) {
        this.physioStatus = physioStatus;
    }

    public UserAccount getStudent() {
        return student;
    }

    public void setStudent(UserAccount student) {
        this.student = student;
    }

    public UserAccount getPhysio() {
        return physio;
    }

    public void setPhysio(UserAccount physio) {
        this.physio = physio;
    }

    public UserAccount getDoctor() {
        return doctor;
    }

    public void setDoctor(UserAccount doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return getDoctor().getUsername();
    }
    
    
    
}

