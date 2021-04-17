/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9.example2;

/**
 *
 * @author Raghavendra Reddy
 */
public interface Interface01 {
    
    public abstract void demo();
    
    public default void goo(){
        System.out.println("Default method goo() in Interface01");
    }
}
