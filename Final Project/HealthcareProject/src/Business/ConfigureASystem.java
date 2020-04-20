package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author monal
 */
public class ConfigureASystem {
    
   public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("AKA", 1);
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("a", "a", employee, new SystemAdminRole());
        
        return system;
    }
    
}
