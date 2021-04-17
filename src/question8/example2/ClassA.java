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
public abstract class ClassA {

    public ClassA() {
        System.out.println("Constructor of abstract class");
    }
    
    public abstract void demo();
    @Override
    public String toString() {
        System.out.println("toString() of abstract class");
        return "Return statement from abstract class toString()";
    }

}
