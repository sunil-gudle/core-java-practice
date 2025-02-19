package src.java.sunil.programmingChallenges.loopsMethodsArrays;

// Create a program to check if a number is an Armstrong number.

import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();
        boolean result = isArmstrong(num);
        if (result) {
            System.out.println("your number is armstrong.");
        } else {
            System.out.println("Your number is not a armstrong.");
        }
    }

    public static boolean isArmstrong(int num) {

        int noOfDigits = numberOfDigits(num);
        System.out.println("Num of digits: " + noOfDigits);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += powerOfNum(lastDigit, noOfDigits);
        }
        System.out.println("Final Number " + finalNumber);
        return finalNumber == numCopy;
    }

    public static int powerOfNum(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }

        System.out.println("Power of " + num1 + " is " + result);
        return result;

    }

    public static int numberOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }

        return digits;
    }
}
