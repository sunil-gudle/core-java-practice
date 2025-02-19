package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

// Write a program that shows bitwise compliment of a number

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        int result = ~num;
        System.out.println("Result is "+ result);
    }
}
