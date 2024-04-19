package src.programmingChallenges.operatorsIfElseNumberSystem;

// Write a program to determine the given number is leap year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " year is a leap year.");
        } else {
            System.out.println(year + " year is not a leap year.");
        }
    }
}
