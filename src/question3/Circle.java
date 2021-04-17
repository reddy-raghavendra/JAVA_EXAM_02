/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Raghavendra Reddy
 */
public class Circle {

    private double radius;
    private double area;
    private double circumference;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double getCircumference() {
        return circumference;
    }

    public double calculateArea() {
        this.area = Math.round(Math.PI * Math.pow(radius, 2) * 100) / 100.0;
        return this.area;
    }

    public double calculateCircumference() {
        this.circumference = Math.round(2 * Math.PI * this.radius * 100) / 100.0;
        return this.circumference;
    }

    @Override
    public String toString() {
        return "Circle:" + "\nRadius: " + radius + "\nArea:" + area
                + "\nCircumference: " + circumference;
    }

}
