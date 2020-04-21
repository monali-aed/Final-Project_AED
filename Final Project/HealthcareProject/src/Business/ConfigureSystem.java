package business;

import business.Employee.Employee;
import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;

/**
 *
 * @author monal
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
            
        Employee employee = system.getEmployeeDirectory().createEmployee("MSP", 1);
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("a", "a", employee, new SystemAdminRole());
        
        return system;
    }
    
}
