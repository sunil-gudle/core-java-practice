package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

// Write a program that shows bitwise AND of two numbers
public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int second = scanner.nextInt();

        int result = first & second;
        System.out.println("Result is : " + result);
    }
}
