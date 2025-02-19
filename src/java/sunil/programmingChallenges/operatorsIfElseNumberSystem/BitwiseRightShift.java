package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

// Write a program that shows bitwise right shift

public class BitwiseRightShift {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        int result = num>>1;
        System.out.println("Result is "+ result);
    }
}
