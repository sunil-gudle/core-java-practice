package src.programmingChallenges.loopsMethodsArrays;

//Create a program to check whether a given number is prime.

import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        boolean result = isPrime(num);
        if (result) {
            System.out.println("Your number is a prime.");
        } else {
            System.out.println("Your number is not a prime.");
        }
    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
