/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shabeena
 */
public class Lab4Car {

    private int yearModel;
    private String make;
    private int speed;

    public void setYearModel(int inYearModel) {
        this.yearModel = inYearModel;
    }

    public void setMake(String inMake) {
        this.make = inMake;
    }

    public void setSpeed(int inSpeed) {
        this.speed = inSpeed;
    }

    public int getYearModel() {
        return this.yearModel;
    }

    public String getMake() {
        return this.make;
    }

    public int getSpeed() {
        return this.speed;
    }

    public Lab4Car(int inYearModel, String inMake) {
        this.yearModel = inYearModel;
        this.make = inMake;
        this.speed = 0;
    }

    public void acceletrate() {
        this.speed += 5;
    }

    public void brake() {
        this.speed -= 5;
    }

}
