/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Date;

/**
 *
 * @author Raghavendra Reddy
 */
public class Faculty extends Employee {

    private double officeHours;
    private int noOfTeaching;

    public Faculty(double officeHours, int noOfTeaching, String office,
            double salary, Date dateHired, String name, String address,
            String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.noOfTeaching = noOfTeaching;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public int getNoOfTeaching() {
        return noOfTeaching;
    }

    @Override
    public String toString() {
        return "Class: Faculty"
                + "\nName: " + getName();
    }

}
