/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Scanner;

/**
 *
 * @author Raghavendra Reddy
 */
public class CheckIdenticalq2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m1[][] = new int[3][3];
        int m2[][] = new int[3][3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Answer for question2: Raghavendra Reddy");
        System.out.print("Enter list1: ");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                m1[j][k] = scan.nextInt();
            }
        }
        System.out.print("\nEnter list2: ");
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                m2[j][k] = scan.nextInt();
            }
        }
        if (equals(m1, m2)) {
            System.out.println("\nThe two arrays are strictly identical");
        } else {
            System.out.println("\nThe two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
