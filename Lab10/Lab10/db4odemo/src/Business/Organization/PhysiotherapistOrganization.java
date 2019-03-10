/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DoctorRole;
import Business.Role.PhysiotherapistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author varad
 */
public class PhysiotherapistOrganization extends Organization{

    public PhysiotherapistOrganization() {
        super(Organization.Type.physiotherapist.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PhysiotherapistRole());
        return roles;
    }
     
}
