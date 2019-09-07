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

public class Lab1SalesTax {

    public static void main(String[] args) {
        /*-----------------------------------------------------------------------------------
        7. Sales Tax
      Write a program that will ask the user to enter the amount of a purchase. 
      The program should then compute the state and county sales tax. 
      Assume the state sales tax is 4 percent and the county sales tax is 2 percent.
      The program should display the amount of the purchase, the state sales tax, 
      the county sales tax, the total sales tax, and the total of the sale 
      (which is the sum of the amount of the purchase plus the total sales tax).
      Hint: Use the values 0.02 to represent 2 percent and 0.04 to represent 4 percent. 
    -------------------------------------------------------------------------------------*/
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Please Enter The Amount Of Purchase: $");
            float purchaseAmount = input.nextFloat();

            System.out.println("Total Amount Of Purchase: " + "$" + purchaseAmount);
            float stateSalesTax = (float) (0.04 * purchaseAmount);
            System.out.println("The State Sales Tax: " + "$" + stateSalesTax);

            float countySalesTax = (float) (0.02 * purchaseAmount);
            System.out.println("The County Sales Tax: " + "$" + countySalesTax);

            float totalSalesTax = stateSalesTax + countySalesTax;
            System.out.println("The Total Sales Tax: " + "$" + totalSalesTax);

            float totalOfTheSale = purchaseAmount + totalSalesTax;
            System.out.println("The Total Of The Sale: " + "$" + totalOfTheSale);

        } catch (Exception Ex) {
            System.out.println("The amount Should Be In Number! You Entered a Wrong Input.");
            System.exit(0);
        }

    }

}
