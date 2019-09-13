
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
public class Lab2CH3TestScoresGrade {

    public static void main(String[] args) {

        /*
        4. Test Scores and Grade
        Write a program that has variables to hold three test scores. 
        The program should ask the user to enter three test scores and assign the values entered to the variables.
        The program should display the average of the test scores and the letter grade that is assigned for the test score average.
        Use the grading scheme below:
        90-100 = A
        80-89 = B
        70-79=C
        60-69=D
        Below 60=F
         */
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please Enter The First Test Score: ");
            float firstTestScore = userInput.nextFloat();
            System.out.print("Please Enter The Second Test Score: ");
            float secondTestScore = userInput.nextFloat();
            System.out.print("Please Enter The Third Test Score: ");
            float thirdTestScore = userInput.nextFloat();

            if ((firstTestScore >= 0) && (secondTestScore >= 0) && (thirdTestScore >= 0)) {
                float averageTestScoressWithoutRoundOff = ((firstTestScore + secondTestScore + thirdTestScore) / 3);
                float averageTestScoresUpToTwoDecimal = Float.valueOf(String.format("%.2f", averageTestScoressWithoutRoundOff));
                System.out.println("Your Average Test Score Is: " + averageTestScoresUpToTwoDecimal);

                if ((averageTestScoresUpToTwoDecimal <= 100) && (averageTestScoresUpToTwoDecimal >= 90)) {
                    System.out.println("Letter Grade: A");
                } else if ((averageTestScoresUpToTwoDecimal <= 89) && (averageTestScoresUpToTwoDecimal >= 80)) {
                    System.out.println("Letter Grade: B");
                } else if ((averageTestScoresUpToTwoDecimal <= 79) && (averageTestScoresUpToTwoDecimal >= 70)) {
                    System.out.println("Letter Grade: C");
                } else if ((averageTestScoresUpToTwoDecimal <= 69) && (averageTestScoresUpToTwoDecimal >= 60)) {
                    System.out.println("Letter Grade: D");
                } else {
                    System.out.println("Letter Grade: F");
                }

            } else {

                System.out.println("Either All Inputs Or One Of The Input You Entered Is Not A Possitive NonZero Number.");
            }
        } catch (Exception Ex) {
            System.out.println("Invalid User Input");
        }

    }

}
