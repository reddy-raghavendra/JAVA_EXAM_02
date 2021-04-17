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
public class ClassSuper {

    private String name;

    public ClassSuper(String name) {
        System.out.println("Super class constructor called");
        this.name = name;
    }

    public String getName() {
        System.out.println("getName() of super class");
        return name;
    }

    @Override
    public String toString() {
        System.out.println("toString() of super class");
        return "Name=" + name;
    }

}
