
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
public class Lab3CH5IsPrimeNumberCheck {

    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please Enter A Number : ");
            int enteredNumber = userInput.nextInt();
            if (isPrime(enteredNumber)) {
                System.out.println(enteredNumber + " is a prime number");
            } else {
                System.out.println(enteredNumber + " is not a prime number");
            }
        } catch (Exception Ex) {
            System.out.println("Invalid Input: The input you entered is either alphabet or special character or exceeded the range on integer.");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < (number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
