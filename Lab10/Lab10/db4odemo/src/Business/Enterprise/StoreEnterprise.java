/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author varad
 */
public class StoreEnterprise extends Enterprise {
    
    public StoreEnterprise(String name){
        super(name,EnterpriseType.Store);
    } 
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    @Override
    public ArrayList<Organization.Type> getSupportedOrganizations() {
        ArrayList<Type> arrayList = new ArrayList<Organization.Type>();
        arrayList.add(Type.Supplier);
        arrayList.add(Type.Delivery);
        return arrayList;
    }
    
}
