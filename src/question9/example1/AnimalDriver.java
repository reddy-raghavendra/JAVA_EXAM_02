/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.example1;

/**
 *
 * @author Raghavendra Reddy
 */
public class AnimalDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tiger t1 = new Tiger();
        System.out.println("Answer for the question 9: Raghavendra Reddy");       
        System.out.println("No of legs: "+t1.getNoOfLegs());
        System.out.println("Can move: "+ t1.canMove);
        t1.habitat();

    }

}
