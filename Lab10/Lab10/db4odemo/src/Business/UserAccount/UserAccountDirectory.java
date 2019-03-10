/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.security.MessageDigest;
import java.util.ArrayList;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author raunak
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
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
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (getHash(password.getBytes()).equals(ua.getPassword()) && ua.getUsername().equals(username)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
