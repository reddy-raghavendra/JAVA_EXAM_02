/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raghavendra Reddy
 */
public class RemoveDuplicateq1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> values = new ArrayList<>();
        System.out.println("Answer for question 1: Raghavendra Reddy");
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            values.add(scan.nextInt());
        }
        removeDuplicate(values);
    }
    
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer value : list) {
            if (!unique.contains(value)) {
                unique.add(value);
            }
        }
        System.out.print("The distinct integers are ");
        for (Integer integer : unique) {
            System.out.print(integer + " ");
        }
    }
    
}
