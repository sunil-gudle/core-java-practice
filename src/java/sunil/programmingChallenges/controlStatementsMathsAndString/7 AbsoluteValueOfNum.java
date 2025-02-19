package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

// Create a program to calculate the absolute value of a given integer.
class AbsoluteValueOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to absolute value\n");
        System.out.print("please enter the number: ");
        int num = scanner.nextInt();

        int result = num >= 0 ? num : -num;
        System.out.println("The absolute value of given number is: " + result);
    }
}
