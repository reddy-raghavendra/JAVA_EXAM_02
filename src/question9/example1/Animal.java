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
public interface Animal {

    boolean canMove = true;

    public abstract int getNoOfLegs();

    public default void habitat() {
        System.out.println("Animals habitat both on land and in water");
    }
}
