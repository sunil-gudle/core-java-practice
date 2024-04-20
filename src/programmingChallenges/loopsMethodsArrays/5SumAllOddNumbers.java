package src.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

//Write a program to print sum of all odd numbers from 1 to a specified number N
class SumAllOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to odd sum");
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();
        int sum = oddSum(num);
        System.out.println("Odd Sum till " + num + " is: " + sum);
    }

    public static int oddSum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum = sum + i;
            i += 2;
        }

        return sum;
    }

}
