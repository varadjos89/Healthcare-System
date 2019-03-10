/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GymAppointment.WorkQueue;

import Business.BodyPartsInfo.WorkQueue.BodyPartsInfoWorkRequest;
import Business.UserAccount.UserAccount;

/**
 *
 * @author varad
 */
public class GymAddAppointmentWorkRequest {
    private static int id=1;
    private UserAccount gymnasium;
    private UserAccount physio;
    private String date;
    private String time;
    private String status;
    private String statusResult;
    private BodyPartsInfoWorkRequest bodyPartsInfoWorkRequest;
    private int appointmentNumber;

    public GymAddAppointmentWorkRequest() {
        appointmentNumber = id;
        id++;
    }
    
    

    public BodyPartsInfoWorkRequest getBodyPartsInfoWorkRequest() {
        return bodyPartsInfoWorkRequest;
    }

    public void setBodyPartsInfoWorkRequest(BodyPartsInfoWorkRequest bodyPartsInfoWorkRequest) {
        this.bodyPartsInfoWorkRequest = bodyPartsInfoWorkRequest;
    }

    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public UserAccount getGymnasium() {
        return gymnasium;
    }

    public void setGymnasium(UserAccount gymnasium) {
        this.gymnasium = gymnasium;
    }

    public UserAccount getPhysio() {
        return physio;
    }

    public void setPhysio(UserAccount physio) {
        this.physio = physio;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusResult() {
        return statusResult;
    }

    public void setStatusResult(String statusResult) {
        this.statusResult = statusResult;
    }

    @Override
    public String toString() {
        return appointmentNumber+"";
    }
    
    
    
    
}
