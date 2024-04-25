package src.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

//Create a program to print the month of the year based on a number (1-12) input by the user.

class MonthOfTheYearUsingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to switch statement\n");
        System.out.print("Please enter the month in number: ");
        int month = scanner.nextInt();
        String result = monthOfTheYear(month);
        System.out.println("Given month is: "+ result);

    }
    public static String monthOfTheYear(int month){
        String output = switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";

        };
        return output;
    }
}
