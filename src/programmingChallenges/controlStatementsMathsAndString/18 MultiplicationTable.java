package src.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

// Create a program using for loop multiplication table for a number.

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number for multiplication table: ");
        int num = scanner.nextInt();

        for (int i =1; i<=10 ; i++){
            System.out.println(num + " * "+ i + " = "+(num*i));
        }
    }
}
