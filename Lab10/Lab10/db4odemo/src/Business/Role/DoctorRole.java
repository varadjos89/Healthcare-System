/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.DoctorRole.DoctorPeformLabTestJPanel;
import javax.swing.JPanel;
import userinterface.DoctorRole.DoctorMainJPanel;

/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorMainJPanel(userProcessContainer, account, organization, enterprise, business);
    }
    
    
}
