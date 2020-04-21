/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author monal
 */
public class EquipmentSupplierEnterprise extends Enterprise{
   
        public EquipmentSupplierEnterprise(String name)
    {
        super(name, EnterpriseType.EQUIPMENT_SUPPLIERS);
    }
        public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
