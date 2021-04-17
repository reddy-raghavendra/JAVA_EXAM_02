/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4.example2;

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
        System.out.println("Answer for question 4: Raghavendra Reddy");
        ClassSub sub = new ClassSub("Java Exam02");
        System.out.println(sub);
        System.out.println("**************");
//        Plymorbhic Substitution
        ClassSuper sup = new ClassSub("Inheritance");
//Late binding
        System.out.println(sup);

    }

}

