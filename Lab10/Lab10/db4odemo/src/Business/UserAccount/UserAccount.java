/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;
import javax.xml.bind.DatatypeConverter;
import Business.Appointment.WorkQueue.AppointmentWorkQueue;
import Business.BodyPartsInfo.WorkQueue.BodyPartsInfoWorkQueue;
import Business.DeliveryRequest.WorkQueue.DeliveryRequestWorkQueue;
import Business.Employee.Employee;
import Business.GymAppointment.WorkQueue.GymAddAppointmentWorkQueue;
import Business.Prescription.WorkQueue.PrescriptionWorkQueue;
import Business.Role.Role;
import Business.LabTest.WorkQueue.LabTestWorkQueue;
import java.security.MessageDigest;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private LabTestWorkQueue workQueue;
    private AppointmentWorkQueue appointmentWorkQueue;
    private PrescriptionWorkQueue prescriptionWorkQueue;
    private DeliveryRequestWorkQueue deliveryRequestWorkQueue;
    private BodyPartsInfoWorkQueue bodyPartsInfoWorkQueue;
    private GymAddAppointmentWorkQueue gymAddAppointmentWorkQueue;

    public UserAccount() {
        workQueue = new LabTestWorkQueue();
        appointmentWorkQueue=new AppointmentWorkQueue();
        prescriptionWorkQueue=new PrescriptionWorkQueue();
        deliveryRequestWorkQueue=new DeliveryRequestWorkQueue();
        bodyPartsInfoWorkQueue=new BodyPartsInfoWorkQueue();
        gymAddAppointmentWorkQueue=new GymAddAppointmentWorkQueue();
    }


    
    public BodyPartsInfoWorkQueue getBodyPartsInfoWorkQueue() {
        return bodyPartsInfoWorkQueue;
    }

    public void setBodyPartsInfoWorkQueue(BodyPartsInfoWorkQueue bodyPartsInfoWorkQueue) {
        this.bodyPartsInfoWorkQueue = bodyPartsInfoWorkQueue;
    }

    
    public DeliveryRequestWorkQueue getDeliveryRequestWorkQueue() {
        return deliveryRequestWorkQueue;
    }

    public void setDeliveryRequestWorkQueue(DeliveryRequestWorkQueue deliveryRequestWorkQueue) {
        this.deliveryRequestWorkQueue = deliveryRequestWorkQueue;
    }

    public PrescriptionWorkQueue getPrescriptionWorkQueue() {
        return prescriptionWorkQueue;
    }

    public void setPrescriptionWorkQueue(PrescriptionWorkQueue prescriptionWorkQueue) {
        this.prescriptionWorkQueue = prescriptionWorkQueue;
    }

    public GymAddAppointmentWorkQueue getGymAddAppointmentWorkQueue() {
        return gymAddAppointmentWorkQueue;
    }

    public void setGymAddAppointmentWorkQueue(GymAddAppointmentWorkQueue gymAddAppointmentWorkQueue) {
        this.gymAddAppointmentWorkQueue = gymAddAppointmentWorkQueue;
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
public String getHash(byte[] in){
    String hash="";
    try{
        MessageDigest md=MessageDigest.getInstance("SHA-512");
        md.update(in);
        byte[] db=md.digest();
        hash=DatatypeConverter.printHexBinary(db).toLowerCase();
    }catch(Exception e){System.out.println(e);}
    return hash;
}
    public void setPassword(String password) {
        this.password = getHash(password.getBytes());
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public LabTestWorkQueue getWorkQueue() {
        return workQueue;
    }

    public AppointmentWorkQueue getAppointmentWorkQueue() {
        return appointmentWorkQueue;
    }

    public void setAppointmentWorkQueue(AppointmentWorkQueue appointmentWorkQueue) {
        this.appointmentWorkQueue = appointmentWorkQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}