package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    public static String getHash(byte[] in){
    String hash="";
    try{
        MessageDigest md=MessageDigest.getInstance("SHA-512");
        md.update(in);
        byte[] db=md.digest();
        hash=DatatypeConverter.printHexBinary(db).toLowerCase();
    }catch(Exception e){System.out.println(e);}
    return hash;
}
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        String a="sa",b=getHash(a.getBytes());
        System.out.println(b);
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sa", "sa", employee, new SystemAdminRole());
        
        return system;
    }
    
}
