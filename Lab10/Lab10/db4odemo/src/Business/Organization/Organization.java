/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Appointment.WorkQueue.AppointmentWorkQueue;
import Business.BodyPartsInfo.WorkQueue.BodyPartsInfoWorkQueue;
import Business.DeliveryRequest.WorkQueue.DeliveryRequestWorkQueue;
import Business.Employee.EmployeeDirectory;
import Business.GymAppointment.WorkQueue.GymAddAppointmentWorkQueue;
import Business.Prescription.WorkQueue.PrescriptionWorkQueue;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.LabTest.WorkQueue.LabTestWorkQueue;
import java.util.ArrayList;
import userinterface.AdministrativeRole.ManageOrganizationJPanel;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private LabTestWorkQueue labTestWorkQueue;
    private AppointmentWorkQueue appointmentWorkQueue;
    private PrescriptionWorkQueue prescriptionWorkQueue;
    private DeliveryRequestWorkQueue deliveryRequestWorkQueue;
    private BodyPartsInfoWorkQueue bodyPartsInfoWorkQueue;
    private GymAddAppointmentWorkQueue gymAddAppointmentWorkQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Patient("Patient Organization"),
        gymnasium("Gymnasium Organization"), physiotherapist("physiotherapist Organization"), Supplier("Supplier Organization"), Delivery("Delivery Organization"); 
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        labTestWorkQueue = new LabTestWorkQueue();
        appointmentWorkQueue=new AppointmentWorkQueue();
        prescriptionWorkQueue=new PrescriptionWorkQueue();
        deliveryRequestWorkQueue=new DeliveryRequestWorkQueue();
        bodyPartsInfoWorkQueue=new BodyPartsInfoWorkQueue();
        gymAddAppointmentWorkQueue=new GymAddAppointmentWorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public GymAddAppointmentWorkQueue getGymAddAppointmentWorkQueue() {
        return gymAddAppointmentWorkQueue;
    }

    public void setGymAddAppointmentWorkQueue(GymAddAppointmentWorkQueue gymAddAppointmentWorkQueue) {
        this.gymAddAppointmentWorkQueue = gymAddAppointmentWorkQueue;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    
    public DeliveryRequestWorkQueue getDeliveryRequestWorkQueue() {
        return deliveryRequestWorkQueue;
    }

    public BodyPartsInfoWorkQueue getBodyPartsInfoWorkQueue() {
        return bodyPartsInfoWorkQueue;
    }

    public void setBodyPartsInfoWorkQueue(BodyPartsInfoWorkQueue bodyPartsInfoWorkQueue) {
        this.bodyPartsInfoWorkQueue = bodyPartsInfoWorkQueue;
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
    
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public LabTestWorkQueue getWorkQueue() {
        return labTestWorkQueue;
    }
    
    public AppointmentWorkQueue getAppointmentWorkQueue() {
        return appointmentWorkQueue;
    }

    public void setAppointmentWorkQueue(AppointmentWorkQueue appointmentWorkQueue) {
        this.appointmentWorkQueue = appointmentWorkQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(LabTestWorkQueue workQueue) {
        this.labTestWorkQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
