package src.programmingChallenges.operatorsIfElseNumberSystem;

// Write a program that shows bitwise OR of two numbers

import java.util.Scanner;

public class BitwiseOr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int second = scanner.nextInt();

        int result = first | second;
        System.out.println("Result is "+ result);
    }
}
