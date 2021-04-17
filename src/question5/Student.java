/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Raghavendra Reddy
 */
public class Student extends Person {

    private String grade;
    private final static String CLASS_STATUS = "Graduate";

    public Student(String grade, String name,
            String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Class: Student"
                + "\nName: " + getName();
    }

}
