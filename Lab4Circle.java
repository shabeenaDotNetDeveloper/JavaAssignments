/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shabeena
 */
public class Lab4Circle {

    private double radius;
    private final double PI = 3.14159;

    public void setRadius(double inRadius) {
        this.radius = inRadius;
    }

    public double getRadius(double inRadius) {
        return this.radius;
    }

    public Lab4Circle(double inRadius) {
        this.radius = inRadius;
    }

    public Lab4Circle() {
        this.radius = 0.0;
    }

    public double getArea() {
        return (PI * this.radius * this.radius);
    }

    public double getDiameter() {
        return (this.radius * 2);
    }

    public double getCircumference() {
        return (2 * PI * this.radius);

    }
}
