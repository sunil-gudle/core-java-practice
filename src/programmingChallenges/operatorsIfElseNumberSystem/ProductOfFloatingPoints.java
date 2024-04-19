package src.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

// Create a program to calculate product of two floating point numbers
public class ProductOfFloatingPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first decimal number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please enter the second decimal number: ");
        double num2 = scanner.nextDouble();

        double result = num1 * num2;

        System.out.println("Product of two floating points numbers: " + result);

    }
}
