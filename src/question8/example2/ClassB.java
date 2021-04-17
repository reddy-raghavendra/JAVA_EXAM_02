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
public class ClassB extends ClassA{

    public ClassB(){
        super();
        System.out.println("Inside class Class A");
    }
    
    @Override
    public String toString() {
        System.out.println("Inside toStirng() of sub class");
        return super.toString();              
    }

    @Override
    public void demo() {
        System.out.println("A demo method implemented in CLassB since it is an"
                + "abstract method in Class A");
    }
    
    
    
}
