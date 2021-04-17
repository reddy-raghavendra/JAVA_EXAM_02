/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Raghavendra Reddy
 */
public class ChoclateDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer for question 7: Raghavendra Reddy");

        System.out.println("1.MILKCHOCLATE");
        System.out.println("2.DARKCHOCLATE");
        System.out.println("3.WHITECHOCLATE");
        System.out.println("4.SEMISWEETCHOCLATE");
        System.out.print("Enter the type of choclate from the above list"
                + " to know the price: ");

        String choclateName = scan.next().toUpperCase();
        while (!choclateName.equalsIgnoreCase("milkchoclate")
                && !choclateName.equalsIgnoreCase("darkchoclate")
                && !choclateName.equalsIgnoreCase("whitechoclate")
                && !choclateName.equalsIgnoreCase("semisweetchoclate")) {
            System.out.println("Please enter the type from the given list");
            choclateName = scan.next().toUpperCase();
        }

        System.out.println("********************************");
//        Illustration of valueOf method
        System.out.println("The price of the choclate " + choclateName.toLowerCase()
                + " is: " + Choclate.valueOf(choclateName).getPrice());
        System.out.println("********************************");
        System.out.println("Prices of all the choclates: ");
//        illustration of values method
        for (Choclate value : Choclate.values()) {
            System.out.println(value.name().toLowerCase() + ": "
                    + value.getPrice());
        }

    }

}
