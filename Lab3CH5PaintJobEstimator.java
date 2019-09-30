
import java.text.DecimalFormat;
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
public class Lab3CH5PaintJobEstimator {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {

        try {

            Scanner input = new Scanner(System.in);
            System.out.print("Please Enter the number of rooms to be painted: ");
            int numberOfRoomsToBePainted = input.nextInt();
            System.out.print("Please Enter the price of the paint per gallon: $");
            double priceOfPaintPerGallon = input.nextDouble();

            if ((numberOfRoomsToBePainted > 0) && (priceOfPaintPerGallon > 0)) {

                double totalSquareFeetWallSpaceOfRooms = addRoomWallSpace(numberOfRoomsToBePainted);
                double numberOfGallonsOfPaintRequired = getNumberOfGallonsOfPaintRequired(totalSquareFeetWallSpaceOfRooms);
                System.out.println("The Number Of Gallons Of Paint Required: " + df2.format(numberOfGallonsOfPaintRequired) + " Gallons");

                double hoursOfLabourRequired = getHoursOfLabourRequired(numberOfGallonsOfPaintRequired);
                System.out.println("The Hours Of Labour Required: " + df2.format(hoursOfLabourRequired) + " Hours");

                double costOfThePaint = getCostOfThePaint(numberOfGallonsOfPaintRequired, priceOfPaintPerGallon);
                System.out.println("The Cost Of The Paint: " + "$" + df2.format(costOfThePaint));

                double labourCharge = getLabourCharge(hoursOfLabourRequired);
                System.out.println("The Labour Charges: " + "$" + df2.format(labourCharge));

                double totalCostOfPaintJob = getTotalCostOfPaintJob(costOfThePaint, labourCharge);
                System.out.println("The Total Cost Of The Paint Job: " + "$" + df2.format(totalCostOfPaintJob));

            } else {
                System.out.println("Invalid Input! Number Of Rooms And Price Of Paint Should Be Greater Than Zero.");
            }
        } catch (Exception Ex) {
            System.out.println("Invalid User Input");
        }

    }

    public static double getTotalCostOfPaintJob(double costOfThePaint, double labourCharge) {
        double totalCostOfPaintJob = (costOfThePaint + labourCharge);
        return totalCostOfPaintJob;
    }

    public static double getLabourCharge(double hoursOfLabourRequired) {
        double labourCharge = (hoursOfLabourRequired * 18);
        return labourCharge;
    }

    public static double getCostOfThePaint(double numberOfGallonsOfPaintRequired, double priceOfPaintPerGallon) {
        double costOfThePaint = (numberOfGallonsOfPaintRequired * priceOfPaintPerGallon);
        return costOfThePaint;
    }

    public static double getHoursOfLabourRequired(double numberOfGallonsOfPaintRequired) {
        double hoursOfLabourRequired = (numberOfGallonsOfPaintRequired * 8);
        return hoursOfLabourRequired;
    }

    public static double getNumberOfGallonsOfPaintRequired(double totalSquareFeetWallSpaceOfRooms) {
        double numberOfGallonsOfPaintRequired = ((totalSquareFeetWallSpaceOfRooms / 115));
        return numberOfGallonsOfPaintRequired;
    }

    public static double addRoomWallSpace(double numberOfRoomsToBePainted) {
        double squareFeetOfWallSpaceEachRooms = 0, totalSquareFeetWallSpaceOfRooms = 0;
        Scanner userInput = new Scanner(System.in);
        for (int i = 1; i <= numberOfRoomsToBePainted; i++) {

            System.out.print("Please Enter the square feet wall space of " + i + " room: ");
            squareFeetOfWallSpaceEachRooms = userInput.nextDouble();
            totalSquareFeetWallSpaceOfRooms += squareFeetOfWallSpaceEachRooms;
        }
        return totalSquareFeetWallSpaceOfRooms;
    }

}
