/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author monal
 */
public class Patient {
    private String fname;
    private String lname;
    private int age;
    private String sex;
    private String contact;
    private static int count = 1000;
    private int patientID;
    private String dateAdmitted;

    
    public Patient()
    {
        patientID = count++;
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calender = Calendar.getInstance();
        dateAdmitted = df.format(calender.getTime());

    }
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getDateAdmitted() {
        return dateAdmitted;
    }

    public void setDateAdmitted(String dateAdmitted) {
        this.dateAdmitted = dateAdmitted;
    }

    @Override
    public String toString() {
        return "Patient{" + "fname=" + fname + ", lname=" + lname + '}';
    }
    
    
    
}
