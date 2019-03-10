/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment.WorkQueue;

/**
 *
 * @author varad
 */
public class AppointmentBookingWorkRequest extends AppointmentWorkRequest {
    private String Result;

    public String getBookingResult() {
        return Result;
    }

    public void setBookingResult(String Result) {
        this.Result = Result;
    }
    
    
}
