/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7.example2;

/**
 *
 * @author Raghavendra Reddy
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question 7: Raghavendra Reddy");
        System.out.println("The no of players played in each sport is given "
                + "below");
        for (Players value : Players.values()) {
            System.out.println("Sport "
                    + value.name().toLowerCase() + ": " + value.getNoOfPlayers());
        }

    }

}
