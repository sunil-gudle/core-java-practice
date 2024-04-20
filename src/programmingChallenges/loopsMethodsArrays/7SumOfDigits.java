package src.programmingChallenges.loopsMethodsArrays;

// Write a program to calculate the sum of digits of an integer

import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        int result = sumOfDigits(num);
        System.out.println("Result: "+result);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10); // adding reminder to sum
            num = num / 10; // dividing number by 10
        }
        return sum;
    }
}
