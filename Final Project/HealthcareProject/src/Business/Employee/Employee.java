/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Employee;

/**
 *
 * @author monal
 */
public class Employee {
    
    private String name;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
