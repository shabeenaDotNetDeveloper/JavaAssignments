
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shabeena
 */

public class Lab5ArraysMultipleMethodOperations {
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    public static void main(String[] args) {
        
        double[] arrayNumbers = {3.4,4,5.6,23,2,45};
        System.out.println("List Of Array Values: {3.4,4,5.6,23,2,45}");
        System.out.println("Total Of The Values In The Array: " + getTotal(arrayNumbers) + "\n" +
                           "Average Of The Values In The Array: " + df2.format(getAverage(arrayNumbers)) + "\n" +
                           "Highest Value In The Array: " + getHighest(arrayNumbers) + "\n" +
                           "Lowest Value In The Array: " + getLowest(arrayNumbers));
    }
    
    
    public static double getTotal(double[] arrayListOfNumbers)
    {
        double totalOfArrayNumbers = 0.0;
        for(int index=0; index < arrayListOfNumbers.length; index++)
        {
           totalOfArrayNumbers = totalOfArrayNumbers + arrayListOfNumbers[index];
        }
        
        return totalOfArrayNumbers;
        
    }
    
    public static double getAverage(double[] arrayListOfNumbers)
    {
        double averageOfArrayNumbers = getTotal(arrayListOfNumbers)/ arrayListOfNumbers.length;
        return averageOfArrayNumbers;
    }

    public static double getHighest(double[] arrayListOfNumbers)
    { 
        double highestNumber = arrayListOfNumbers[0];
        for(int index = 0; index < arrayListOfNumbers.length; index++){
            if(arrayListOfNumbers[index]> highestNumber ){ 
                highestNumber = arrayListOfNumbers[index];
            }
            
        }
        return highestNumber;
    }
    
     public static double getLowest(double[] arrayListOfNumbers)
    { 
        double lowestNumber = arrayListOfNumbers[0];
        for(int index = 0; index < arrayListOfNumbers.length; index++){
            if(arrayListOfNumbers[index]< lowestNumber ){ 
                lowestNumber = arrayListOfNumbers[index];
            }
            
        }
        return lowestNumber;
    }
}
