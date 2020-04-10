/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MedicineVaccineSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author monal
 */
public class MedicineVaccineSupplierOrganization extends Organization{

    public MedicineVaccineSupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MedicineVaccineSupplierRole());
        return roles;
    }
    
     public String getType() {
    return "Medicine Vaccine Supplier Organization";
    }
    
}
