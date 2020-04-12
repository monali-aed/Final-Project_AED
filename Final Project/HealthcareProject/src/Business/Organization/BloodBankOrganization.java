/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.BloodSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author monal
 */
public class BloodBankOrganization {
     public BloodBankOrganization() {
        
    }
    
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
     //   roles.add(new BloodSupplierRole());
        return roles;
    }

    public String getType() {
    return "BloodBank Organization";
    }
}
