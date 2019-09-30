
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Shabeena
 */
public class Lab3CH5EvenOddCounter {

    public static void main(String[] args) {
        int evenNumberCount = 0;
        int oddNumberCount = 0;

        Random randomNumber = new Random();

        for (int i = 1; i <= 100; i++) {
            if (isEven(randomNumber.nextInt(i))) {
                evenNumberCount++;
            } else {
                oddNumberCount++;
            }
        }
        System.out.println("Number of even numbers generated: " + evenNumberCount);

        System.out.println("Number of odd numbers generated: " + oddNumberCount);

    }

    public static boolean isEven(int num) {
        boolean isEvenNumber = false;
        if ((num % 2) == 0) {
            isEvenNumber = true;
        }
        return isEvenNumber;
    }

}
