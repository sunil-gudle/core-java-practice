package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

// Write the program to determine the greatest of three number

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println("The first number " + a + " is the greatest number");
        } else if (b >= a && b >= c) {
            System.out.println("The second number " + b + " is the greatest number");
        } else {
            System.out.println("The third number " + c + " is the greatest number");
        }

    }
}
