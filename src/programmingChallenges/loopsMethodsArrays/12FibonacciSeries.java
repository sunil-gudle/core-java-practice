package src.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

// Create a program to print the Fibonacci series up to a certain number.
class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number up to which series has to be printed: ");
        int num = scanner.nextInt();
        System.out.println("Here is the fibonacci series: ");

        printFibonacci(num);
    }

    public static void printFibonacci(int num) {

        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }


    }
}
