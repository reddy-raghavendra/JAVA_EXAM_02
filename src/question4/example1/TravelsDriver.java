/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4.example1;

/**
 *
 * @author Raghavendra Reddy
 */
public class TravelsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Travels travel = new Travels("Hatchback", 4, 20);
        travel.calculatePrice();

        PrimeTravels prime = new PrimeTravels("Sedan", 5, 30);
        prime.calculatePrice();

        PremiumTravels premium = new PremiumTravels("SUV", 6, 50);
        premium.calculatePrice();

//      Polymorphic substitution  
        Travels t1 = new PremiumTravels("MUV", 7, 100);
//      This is Late binding since the method call is determined at run time
        t1.calculatePrice();

        System.out.println("Answer for question 3: Raghavendra Reddy");

        System.out.println(travel);
        System.out.println(prime);
        System.out.println(premium);
//      Late binding
        System.out.println(t1);

    }

}
