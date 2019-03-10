/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LabTest.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class LabTestWorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public LabTestWorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}