/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Raghavendra Reddy
 */
public class GeometryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double side1 = 0, side2 = 0, side3 = 0;
        boolean flag;
        System.out.println("Answer for question 6: Raghavendra Reddy");
        do {
            flag = true;
            System.out.print("Enter side 1 of triangle: ");
            side1 = scan.nextDouble();
            System.out.print("Enter side 2 of triangle: ");
            side2 = scan.nextDouble();
            System.out.print("Enter side 3 of triangle: ");
            side3 = scan.nextDouble();
            if (side1 >= side2 + side3 || side2 >= side1 + side3
                    || side3 >= side1 + side2) {
                System.out.println("The sum of two sides of square should be "
                        + "greater than the third side, Please enter the sides "
                        + "again");
                flag = false;
            }
        } while (flag == false);

        Triangle triangle = new Triangle(side1, side2, side3, "Red", true);
        System.out.println(triangle);
    }

}
