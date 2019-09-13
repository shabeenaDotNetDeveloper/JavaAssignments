
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
public class Lab2CH3BankCharges {

    public static void main(String[] args) {
        /*
        15. Bank Charges
        A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:
        $0.10 each for less than 20 checks
        $0.08 each for 20-39 checks
        $0.06 each for 40-59 checks
        $0.04 each for 60 or more checks
        Write a program that asks for the number of checks written for the month.
        The program should then calculate and display the banks service fees for the month. 
         */

        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please Enter The Number Of Checks For The Month: ");
            float numberOfChecksForMonth = userInput.nextFloat();

            if (numberOfChecksForMonth > 0) {
                if (numberOfChecksForMonth < 20) {
                    System.out.println("Bank Service Fees For The Month Is: $" + (10 + (numberOfChecksForMonth * 0.10)));
                } else if ((numberOfChecksForMonth >= 20) && (numberOfChecksForMonth <= 39)) {
                    System.out.println("Bank Service Fees For The Month Is: $" + (10 + (numberOfChecksForMonth * 0.08)));
                } else if ((numberOfChecksForMonth >= 40) && (numberOfChecksForMonth <= 59)) {
                    System.out.println("Bank Service Fees For The Month Is: $" + (10 + (numberOfChecksForMonth * 0.06)));
                } else {
                    System.out.println("Bank Service Fees For The Month Is: $" + (10 + (numberOfChecksForMonth * 0.04)));
                }
            } else {
                System.out.println("Checks Should Not Be Less Than Equals To Zero.");
            }

        } catch (Exception Ex) {
            System.out.println("Invalid User Input");
        }

    }

}
