/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Raghavendra Reddy
 */
public enum Choclate {
    MILKCHOCLATE(10), DARKCHOCLATE(9), WHITECHOCLATE(8), SEMISWEETCHOCLATE(12);

    private double price;

    private Choclate(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
