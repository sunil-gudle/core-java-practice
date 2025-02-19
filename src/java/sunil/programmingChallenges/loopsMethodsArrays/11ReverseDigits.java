package src.java.sunil.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

//Create a program to reverse the digits of a number.
class ReverseDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();
        int result = reverseTheDigits(num);
        System.out.println("Result: " + result);
    }

    public static int reverseTheDigits(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
