/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4.example1;

import question4.example1.Travels;

/**
 * This is a sub class of super class Travels
 *
 * @author Raghavendra Reddy
 */
public class PrimeTravels extends Travels {

    public PrimeTravels(String vehicleType, int capacity, double distance) {
        super(vehicleType, capacity, distance);
    }

    @Override
    public double calculatePrice() {
        return super.getDistance() * 8;
    }

    @Override
    public String getType() {
        return "Prime Travels"; 
    }
    
    
    
    @Override
    public String toString() {
        return super.toString();
    }

}
