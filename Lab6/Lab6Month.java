/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shabeena
 */
public class Lab6Month {

    private int monthNumber;
    private String monthName;

    public int getMonthNumber() {
        return this.monthNumber;
    }

    public void setMonthNumber(int inMonthNumber) {
        if (inMonthNumber < 1 || inMonthNumber > 12) {
            inMonthNumber = 1;
        } else {
            this.monthNumber = inMonthNumber;
        }

    }

    public String getMonthName() {
        switch (this.monthNumber) {
            case 1:
                return "Janaury";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "January";
        }
    }


    public Lab6Month() {

        this.monthNumber = 1;

    }

    public Lab6Month(int inMonthNumber) {
        if (inMonthNumber < 1 || inMonthNumber > 12) {
            inMonthNumber = 1;
        } else {
            this.monthNumber = inMonthNumber;
        }
    }

    public Lab6Month(String monthName) {
        if (monthName.equalsIgnoreCase("January")) {
            this.monthNumber = 1;
        } else if (monthName.equalsIgnoreCase("February")) {
            this.monthNumber = 2;
        } else if (monthName.equalsIgnoreCase("March")) {
            this.monthNumber = 3;
        } else if (monthName.equalsIgnoreCase("April")) {
            this.monthNumber = 4;
        } else if (monthName.equalsIgnoreCase("May")) {
            this.monthNumber = 5;
        } else if (monthName.equalsIgnoreCase("June")) {
            this.monthNumber = 6;
        } else if (monthName.equalsIgnoreCase("July")) {
            this.monthNumber = 7;
        } else if (monthName.equalsIgnoreCase("August")) {
            this.monthNumber = 8;
        } else if (monthName.equalsIgnoreCase("September")) {
            this.monthNumber = 9;
        } else if (monthName.equalsIgnoreCase("October")) {
            this.monthNumber = 10;
        } else if (monthName.equalsIgnoreCase("November")) {
            this.monthNumber = 11;
        } else if (monthName.equalsIgnoreCase("December")) {
            this.monthNumber = 12;
        }
    }

    @Override
    public String toString() {
        return getMonthName();
    }

    public boolean equals(Lab6Month month) {
        if(this.getMonthNumber() == month.getMonthNumber()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean greaterThan(Lab6Month month) {
        if(this.monthNumber > month.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }
    
     public boolean lessThan(Lab6Month month) {
        if(this.monthNumber < month.getMonthNumber()) {
            return true;
        } else {
            return false;
        }
    }

}
