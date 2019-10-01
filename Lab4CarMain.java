/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shabeena
 */
public class Lab4CarMain {
    public static void main(String[] args) {
        
        Lab4Car myCar = new Lab4Car(2018,"Lamborghini Urus");
        System.out.println("Current Speed Of Car After Accelerating:");
        System.out.println("___________________________________________________");
        for(int i= 1; i<=5 ;i++){
              myCar.acceletrate();
             System.out.println("The current speed of "+ myCar.getYearModel()+" " + myCar.getMake() + " is: " + myCar.getSpeed() + " km/h");
        }
        System.out.println("\n" + "Current Speed Of Car After Brake:");
        System.out.println("___________________________________________________");
        for(int i= 1; i<=5 ;i++){
              myCar.brake();
             System.out.println("The current speed of "+ myCar.getYearModel()+ " " + myCar.getMake() + " is: " + myCar.getSpeed() + " km/h");
        }
    }
    
}
