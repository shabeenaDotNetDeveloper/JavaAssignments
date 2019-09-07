/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shabeena
 */
import java.util.Scanner;

public class Lab1CookieCalories {

    public static void main(String[] args) {

        /*-----------------------------------------------------------------------------------
    8. Cookie Calories
    A bag of cookies holds 40 cookies. The calorie information on the bag claims that 
    there are 10 servings in the bag and that a serving equals 300 calories. 
    Write a program that lets the user enter the number of cookies he or she actually ate and 
    then reports the total number of calories consumed. 
    
    Calculation:
    40 Cookies: 10 serving , one serving= 300 Calories
    One serving = 4 Cookies = 300 Calories
    1 Cookies= 300/4 Calories = 75 Calories 
    1 Cookies = 75 Calories  
    -------------------------------------------------------------------------------------*/
        try {
            Scanner inputCookies = new Scanner(System.in);
            System.out.print("Please Enter The Number Of Cookies Ate: ");

            float numberOfCookiesAte = inputCookies.nextFloat();
            float numberOfCaloriesConsumed = (numberOfCookiesAte * 75);

            System.out.println("Total Number Of Calories Consumed: " + numberOfCaloriesConsumed);
        } catch (Exception Ex) {
            System.out.println("Invalid Input");
        }

    }
}
