
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

public class Lab5DisplayNumbersGreaterThanSpecificNumberInAnArray {
    public static void main(String[] args) {
        int[] arrayListNumbers = {6,4,8,3,5,7,3};
        int number = 5;
        
        int[] newNumberList = greatestNumber(arrayListNumbers, number);
        System.out.println("List of Array Of All The numbers which Are Greater Then A Particular Number: ");
        for(int index=0; index< newNumberList.length; index++){
            if(newNumberList[index]!=0)
            {
                    System.out.print(newNumberList[index] + " ");
            }
            
        }
        
    }
    
    public static int[] greatestNumber(int[] listOfArray, int number)
    {
        int[] greaterNumbersFromListOfArray = new int[listOfArray.length];
        int greaterNumbersIndex = 0;
        for(int index=0; index < listOfArray.length; index++)
        {
            if(listOfArray[index]> number){
                greaterNumbersFromListOfArray[greaterNumbersIndex] = listOfArray[index];
                greaterNumbersIndex +=1;
            }
            }
        return greaterNumbersFromListOfArray;
        }
        
    }
    
