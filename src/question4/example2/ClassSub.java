/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4.example2;

/**
 * This class extends ClassSuper
 *
 * @author Raghavendra Reddy
 */
public class ClassSub extends ClassSuper {

    public ClassSub(String name) {
        super(name);
        System.out.println("Inside sub class constructor");
    }

    @Override
    public String getName() {
        System.out.println("getName() of sub class");
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        System.out.println("toString() of sub class");
        return super.toString();
    }

}
