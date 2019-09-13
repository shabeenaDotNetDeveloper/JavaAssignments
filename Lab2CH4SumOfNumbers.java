
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
public class Lab2CH4SumOfNumbers {

    public static void main(String[] args) {
        /*
        1. Sum of Numbers
        Write a program that asks the user for a positive nonzero integer value. 
        The program should use a loop to get the sum of all the integers from 1 up to the number entered. For example, 
        if the user enters 50, the loop will find the sum of 1,2,3,4...50.
         */

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please Enter The Possitive NonZero Integer Value: ");
            int nonZeroIntegerValue = userInput.nextInt();

            if (nonZeroIntegerValue > 0) {
                int sumOfAllInputIntegers = 0;
                for (int i = 1; i <= nonZeroIntegerValue; i++) {
                    sumOfAllInputIntegers += i;
                }
                System.out.println("Sum Of All The Integers Entered From 1 Up To The Number Is: " + sumOfAllInputIntegers);
            } else {
                System.out.println("The Number You Entered Is Not A Possitive NonZero Integer");
            }

        }
        catch (Exception Ex) {
            System.out.println("Invalid User Input");
        }
    }

}
