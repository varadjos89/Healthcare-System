/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.studentRole;
import java.util.ArrayList;

/**
 *
 * @author varad
 */
public class StudentOrganization extends Organization{

    public StudentOrganization() {
        super(Organization.Type.Patient.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new studentRole());
        return roles;
    }
     
}
