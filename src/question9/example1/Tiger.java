/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.example1;

/**
 * Tiger class implementing both interface Animal and Carnivorous
 * @author Raghavendra Reddy
 */
public class Tiger implements Animal, Carnivorous {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    @Override
    public int getNoOfLegs() {
        return 4;
    }

    @Override
    public void habitat() {
        Carnivorous.super.habitat();
        System.out.println("Tiger habitat on land");
    }

}
