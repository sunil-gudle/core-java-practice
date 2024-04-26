package src.programmingChallenges.controlStatementsMathsAndString;

// Create a program using recursion to display the Fibonacci series up to a certain number.

import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements to be printed: ");
        int count = scanner.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int position) {
        if (position == 1) {
            return 0;
        }
        if (position == 2) {
            return 1;
        }
        return fibonacci(position - 1) +
                fibonacci(position - 2);
    }
}
