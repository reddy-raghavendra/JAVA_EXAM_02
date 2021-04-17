/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4.example1;

import question4.example1.PrimeTravels;

/**
 * This is a sub class of PrimeTravels
 *
 * @author Raghavendra Reddy
 */
public class PremiumTravels extends PrimeTravels {

    public PremiumTravels(String vehicleType, int capacity, double distance) {
        super(vehicleType, capacity, distance);
    }

    @Override
    public String getType() {
        return "Premium Travels";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calculatePrice() {
        return super.getDistance() * 10;
    }

}
