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
public class ClassA implements Interface01 {

    @Override
    public void demo() {
        System.out.println("demo() method implemented in ClassA");
    }

    @Override
    public String toString() {
        return "toString in ClassA";
    }
    

}
