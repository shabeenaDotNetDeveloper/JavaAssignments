
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
public class Lab2CH4BarChart {

    public static void main(String[] args) {
        /*
        Write a program that asks the user to enter today's sales for five stores. 
        The program should display a bar chart comparing each store's sales. 
        Create each bar chart in the bar chart by displaying a row of asterisks. 
        Each asterisk Should represent $100 of sales. Here is an example of the program's output:
        Enter today's sales for store 1: 1000 [Enter]
        Enter today's sales for store 2: 1200 [Enter]
        Enter today's sales for store 3: 1800 [Enter]
        Enter today's sales for store 4: 800 [Enter]
        Enter today's sales for store 5: 1900 [Enter]

        SALES BAR CHART
        Store 1: **********
        Store 2: ************
        Store 3: ******************
        Store 4: ********
        Store 5: *******************
         */

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please Enter The Below Sales, Should Be Multiple Of 100 and Not Less Than Equals To Zero.");
            System.out.print("Enter Today's Sales For Store 1: $");
            int firstStore = userInput.nextInt();
            System.out.print("Enter Today's Sales For Store 2: $");
            int secondStore = userInput.nextInt();
            System.out.print("Enter Today's Sales For Store 3: $");
            int thirdStore = userInput.nextInt();
            System.out.print("Enter Today's Sales For Store 4: $");
            int fourthStore = userInput.nextInt();
            System.out.print("Enter Today's Sales For Store 5: $");
            int fifthStore = userInput.nextInt();

            if (((firstStore > 0) && (firstStore % 100 == 0))
                    && ((secondStore > 0) && (secondStore % 100 == 0))
                    && ((thirdStore > 0) && (thirdStore % 100 == 0))
                    && ((fourthStore > 0) && (fourthStore % 100 == 0))
                    && ((fifthStore > 0) && (fifthStore % 100 == 0))) {

                System.out.println("SALES BAR CHART");
                for (int i = 1; i <= firstStore; i = +100) {
                    if (i == 1) {
                        System.out.print("Store 1: ");
                    }
                    System.out.print("*");
                }
                System.out.println();

                for (int i = 1; i <= secondStore; i += 100) {
                    if (i == 1) {
                        System.out.print("Store 2: ");
                    }

                    System.out.print("*");
                }
                System.out.println();

                for (int i = 1; i <= thirdStore; i += 100) {
                    if (i == 1) {
                        System.out.print("Store 3: ");
                    }

                    System.out.print("*");
                }
                System.out.println();

                for (int i = 1; i <= fourthStore; i += 100) {
                    if (i == 1) {
                        System.out.print("Store 4: ");
                    }

                    System.out.print("*");
                }
                System.out.println();

                for (int i = 1; i <= fifthStore; i += 100) {
                    if (i == 1) {
                        System.out.print("Store 5: ");
                    }

                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.println("Entered Number Is Either Less Than Equals To Zero Or Not A Multiple Of 100.");
            }

        } catch (Exception Ex) {
            System.out.println("Invalid User Input");
        }

    }
}
