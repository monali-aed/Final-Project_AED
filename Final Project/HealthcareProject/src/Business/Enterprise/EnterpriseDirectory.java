/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author monal
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type)
    {
        {
       Enterprise enterprise = null;
        if(null != type)
        switch (type) {
            case HOSPITAL:
                enterprise = new HospitalEnterprise(name);
                enterpriseList.add(enterprise);
                break;
       
            case SUPPLIER:
                enterprise = new SupplierEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case BLOOD_BANK:
                enterprise = new BloodBankEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            default: 
                break;
        }
        return enterprise;
    }
}
}
