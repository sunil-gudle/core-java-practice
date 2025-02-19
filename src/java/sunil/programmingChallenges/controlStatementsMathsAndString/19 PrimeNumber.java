package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

// Create a program using for to display if a number is prime or not.

class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to prime number checker using for loop\n");
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();
        boolean isPrime = isPrime(num);

        System.out.println("You number is " +
                (isPrime(num) ? "Prime" : "not prime"));
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
