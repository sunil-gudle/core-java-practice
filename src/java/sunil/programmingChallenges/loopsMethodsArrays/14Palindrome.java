package src.java.sunil.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

// Create a program to verify if a number is a palindrome.

class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        boolean palindrome = isPalindrome(num);
        if (palindrome) {
            System.out.println("Given number is a palindrome");
        } else {
            System.out.println("Given number is not a palindrome");
        }
    }

    public static boolean isPalindrome(int num) {

        int reverse = reverseNumber(num);
        return num == reverse;
    }

    public static int reverseNumber(int num) {

        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }

}
