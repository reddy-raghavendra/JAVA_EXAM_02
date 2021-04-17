/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8.example2;

/**
 *
 * @author Raghavendra Reddy
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 8: Raghavendra Reddy");
//        Polymorphic substitution
        ClassA a = new ClassB();
        a.demo();
        System.out.println(a);
    }
    
}
