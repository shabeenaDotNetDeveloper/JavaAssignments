
import java.text.DecimalFormat;
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
public class Lab4CircleMain {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter The Radius: ");
            double radius = userInput.nextDouble();
            if(radius>0){
                Lab4Circle circle = new Lab4Circle();
            circle.setRadius(radius);

            System.out.println("The Area Of The Circle Is: " + df2.format(circle.getArea()));
            System.out.println("The Diameter Of The Circle Is: " + df2.format(circle.getDiameter()));
            System.out.println("The Circumference Of The Circle Is: " + df2.format(circle.getCircumference()));
            }
            else { 
                System.out.println("Radius Should Be Possitive.");
            }
            
        } catch (Exception Ex) {
            System.out.println("Invalid Input!");
        }
    }

}
