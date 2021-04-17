/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Raghavendra Reddy
 */
public class ListDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> list = new ArrayList<>();

        Loan loan = new Loan(10000, 44, 8.5);
        Circle circle = new Circle(5.5);
        circle.calculateArea();
        circle.calculateCircumference();
        
        String s1 = "John Wick";
        Date date = new Date();

        list.add(loan);
        list.add(circle);
        list.add(s1);
        list.add(date);
        System.out.println("Answer for question 3: Raghavendra Reddy");
        for (Object object : list) {
            System.out.println("****************");
            System.out.println(object);
            
        }

    }

}
