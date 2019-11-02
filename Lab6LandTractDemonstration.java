
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shabeena
 */
public class Lab6LandTractDemonstration {

    public static void main(String[] args) {
        try {

            Scanner userInput = new Scanner(System.in);
            System.out.println("Enter The Dimensions of First Tract");
            System.out.print("Length Of Tract: ");
            double lengthOfFirstTract = userInput.nextDouble();
            

            System.out.print("Width Of Tract: ");
            double widthOfFirstTract = userInput.nextDouble();

            System.out.println("Enter The Dimensions of Second Tract");
            System.out.print("Length Of Tract: ");
            double lengthOfSecondTract = userInput.nextDouble();
            System.out.print("Width Of Tract: ");
            double widthOfSecondTract = userInput.nextDouble();

            if ((lengthOfFirstTract > 0 && widthOfFirstTract > 0 && lengthOfSecondTract > 0 && widthOfSecondTract > 0)) {

                Lab6LandTract firstLandTract = new Lab6LandTract(lengthOfFirstTract, widthOfFirstTract);
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("Area Of First Tract Of Land: " + firstLandTract.tractArea() + " Square Units.");
                System.out.println("To String Method For First Tract Land: " + firstLandTract.toString());

                Lab6LandTract secondLandTract = new Lab6LandTract(lengthOfSecondTract, widthOfSecondTract);
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("Area Of Second Tract Of Land: " + secondLandTract.tractArea() + " Square Units.");
                System.out.println("To String Method For Second Tract Land: " + secondLandTract.toString());
                
                System.out.println("-----------------------------------------------------------------------------------");
                if(firstLandTract.equals(secondLandTract)){
                  System.out.println("The Tracts Are Of Equal Size.");  
                }
                else {
                    System.out.println("The Tracts Size Are Not Equal."); 
                    
                }
                

            } else {
                System.out.println("Length Or Width Can not be Negative or Zero");
            }
        } catch (Exception Ex) {
            System.out.println("Invalid Input!");

        } finally {
            System.out.println("Program Ends!");
        }

    }

}
