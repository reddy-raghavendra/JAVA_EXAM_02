/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4.example1;

/**
 * This is a super class
 *
 * @author Raghavendra Reddy
 */
public class Travels {

    private String vehicleType;
    private int capacity;
    private double ridePrice;
    private double distance;

    public Travels(String vehicleType, int capacity, double distance) {
        this.vehicleType = vehicleType;
        this.capacity = capacity;
        this.distance = distance;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getRidePrice() {
        return ridePrice;
    }

    public double getDistance() {
        return distance;
    }

    public double calculatePrice() {
        return this.ridePrice * 5;
    }

    public String getType() {
        return "Travels";
    }

    @Override
    public String toString() {
        return getType() + ": "
                + "\nVehicleType: " + vehicleType
                + "\nCapacity: " + capacity
                + "\nRidePrice: $" + calculatePrice()
                + "\nDistance: " + distance
                + "\n***************************************";
    }

}
