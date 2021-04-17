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
public class Driver {

    public static void main(String[] args) {

        Person person = new Person("Edded Stark", "Winterfell", "8887654321",
                "edded.stark@gmail.com");
        Student student = new Student("A","Aryaa Stark", "Bravoos",
                "9090909090", "noone@gmail.com");
        Date dateHired = new Date(2010, 10, 15);
        Employee employee = new Employee("Castle Black", 5000, dateHired, "John Snow",
                "The wall", "8908908901", "knowsnothing@gmail.com");
        Date dateHiredFac = new Date(2005, 05, 15);
        Faculty faculty = new Faculty(8, 4, "King's Landing", 10000, dateHiredFac,
                "Tyrion Lannister", "King's Landing", "8765432109", "theimp@gmail.com");
        Staff staff = new Staff("Master of coin", "Small Council", 20000, dateHired,
                "Petyr Baelish", "King's Landing", "7890123456", "littlefinger@gmail.com");
        System.out.println("Answeer for question 5: Raghavendra Reddy");
        System.out.println(person);
        System.out.println("*********");
        System.out.println(student);
        System.out.println("*********");
        System.out.println(employee);
        System.out.println("*********");
        System.out.println(faculty);
        System.out.println("*********");
        System.out.println(staff);
    }
}
