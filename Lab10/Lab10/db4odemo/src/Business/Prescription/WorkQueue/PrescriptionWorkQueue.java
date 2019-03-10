/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription.WorkQueue;

import Business.Appointment.WorkQueue.AppointmentWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author varad
 */
public class PrescriptionWorkQueue {
     private ArrayList<PrescriptionWorkRequest> prescriptionWorkRequestList;

    public PrescriptionWorkQueue() {
        prescriptionWorkRequestList = new ArrayList();
    }

    public ArrayList<PrescriptionWorkRequest> getPrescriptionWorkRequestList() {
        return prescriptionWorkRequestList;
    }
    
    
}
