/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryRequest.WorkQueue;

import Business.Appointment.WorkQueue.AppointmentWorkRequest;
import Business.Prescription.WorkQueue.PrescriptionWorkRequest;
import Business.UserAccount.UserAccount;

/**
 *
 * @author varad
 */
public class DeliveryRequestWorkRequest {
    private UserAccount Supplier;
    private UserAccount Delivery;
    private UserAccount Student;
    private static int id=1;
    private PrescriptionWorkRequest prescriptionWorkRequest;
    private AppointmentWorkRequest appointmentWorkRequest;
    private String status;
    private String statusresult;
    private String DeliveryStatus;
    private int deliveryNumber; 

    public DeliveryRequestWorkRequest() {
        deliveryNumber = id;
        id++;
    }
   
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        DeliveryRequestWorkRequest.id = id;
    }

    public int getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(int deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }
    
    

    public String getDeliveryStatus() {
        return DeliveryStatus;
    }

    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }

    public UserAccount getSupplier() {
        return Supplier;
    }

    public void setSupplier(UserAccount Supplier) {
        this.Supplier = Supplier;
    }

    public UserAccount getDelivery() {
        return Delivery;
    }

    public void setDelivery(UserAccount Delivery) {
        this.Delivery = Delivery;
    }

    public UserAccount getStudent() {
        return Student;
    }

    public void setStudent(UserAccount Student) {
        this.Student = Student;
    }

    public PrescriptionWorkRequest getPrescriptionWorkRequest() {
        return prescriptionWorkRequest;
    }

    public void setPrescriptionWorkRequest(PrescriptionWorkRequest prescriptionWorkRequest) {
        this.prescriptionWorkRequest = prescriptionWorkRequest;
    }

    public AppointmentWorkRequest getAppointmentWorkRequest() {
        return appointmentWorkRequest;
    }

    public void setAppointmentWorkRequest(AppointmentWorkRequest appointmentWorkRequest) {
        this.appointmentWorkRequest = appointmentWorkRequest;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusresult() {
        return statusresult;
    }

    public void setStatusresult(String statusresult) {
        this.statusresult = statusresult;
    }

    
    @Override
    public String toString() {
        return appointmentWorkRequest.getReceiver().getEmployee().getName();
    }
    
    
    
    
}
