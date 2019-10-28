
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

public class Lab5MainTestScoreDemonstration {
    public static void main(String[] args) {
        
        try
        {
		double[] testScores ={6,45,23,1,6};
                System.out.println("Given Array {6,45,23,1,6}");
		TestScores validTestScores = new TestScores(testScores);
                
                double[] havingNegativeAndGreaterThenHunderedTestScores = {6,-45,23,105,6};
                System.out.println("Given Array {6,-45,23,105,6}");
		TestScores inValidTestScoresHavingNegativeNumbers = new TestScores(havingNegativeAndGreaterThenHunderedTestScores);
                
            }
            catch(IllegalArgumentException Ex){
                System.out.println("Invalid Input Test Scores! The test score in the array is negative or greater than 100.");
            }
}
}
