/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author monal
 */
public class EquipmentEnterprise extends Enterprise{
    
    
    
        public EquipmentEnterprise(String name)
    {
        super(name, EnterpriseType.EQUIPMENT_SUPPLIERS);
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
