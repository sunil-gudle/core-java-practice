package src.programmingChallenges.loopsMethodsArrays;

// Write a program to calculate the LCM  of two numbers

import java.util.Scanner;

class CalculateLCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int second = scanner.nextInt();
        int result = lCM(first, second);
        System.out.println("Result: " + result);

    }

    public static int lCM(int first, int second) {
        int i = 1;
        while (i <= second) {
            int factor = first * i; // read multiplication table
            if (factor % second == 0) { // check factor is divisible by second number
                return factor; // then return the factor which is LCM which is divisible by both the numbers
            }
            i++;
        }
        return 0; // unreachable
    }
}
