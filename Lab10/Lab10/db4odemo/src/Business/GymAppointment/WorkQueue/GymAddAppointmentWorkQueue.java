/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GymAppointment.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author varad
 */
public class GymAddAppointmentWorkQueue {
    
    private ArrayList<GymAddAppointmentWorkRequest> gymAppointmentWorkRequestList;

    public GymAddAppointmentWorkQueue() {
        gymAppointmentWorkRequestList = new ArrayList();
    }

    public ArrayList<GymAddAppointmentWorkRequest> getGymAppointmentWorkRequestList() {
        return gymAppointmentWorkRequestList;
    }

  
    
}
