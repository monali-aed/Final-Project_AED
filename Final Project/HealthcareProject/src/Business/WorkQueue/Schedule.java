/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;

/**
 *
 * @author monal
 */
public class Schedule {
    private Date date;
    private String time;
    private String location;
    private int availHours;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAvailHours() {
        return availHours;
    }

    public void setAvailHours(int availHours) {
        this.availHours = availHours;
    }

    @Override
    public String toString() {
        return location;
    }
    
}
