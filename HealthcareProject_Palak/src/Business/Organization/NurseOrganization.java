/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Inventory.BloodDirectory;
import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author monal
 */
public class NurseOrganization extends Organization{

    BloodDirectory blooddirectory;
    public NurseOrganization() {
        super(Organization.Type.Nurse.getValue());
        blooddirectory = new BloodDirectory();
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles=new ArrayList<Role>();
        roles.add(new NurseRole());
        return roles;
    }
    public String getType() {
    return "Nurse Organization";
    }

    public BloodDirectory getBlooddirectory() {
        return blooddirectory;
    }
    
}
