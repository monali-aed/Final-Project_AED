/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author monal
 */
public class VaccineDirectory {
     private ArrayList<Vaccine> vaccineDirectory;

    public VaccineDirectory() {
        vaccineDirectory = new ArrayList<Vaccine>();
    }

    public ArrayList<Vaccine> getVaccineDirectory() {
        return vaccineDirectory;
    }

    
     public Vaccine addVaccine()
     {
         Vaccine vaccine=new Vaccine();
         vaccineDirectory.add(vaccine);
         return vaccine;
     }
    
}
