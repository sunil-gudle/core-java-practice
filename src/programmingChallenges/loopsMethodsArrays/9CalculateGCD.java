package src.programmingChallenges.loopsMethodsArrays;

// Create a program to find the Greatest Common Divisor (GCD) of two integers.

import java.util.Scanner;

class CalculateGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int second = scanner.nextInt();
        int result = gCD(first, second);
        System.out.println("Result: " + result);

    }

    public static int gCD(int first, int second) {
        int gcd = 1;

        int i = 2;
        int least = least(first, second);
        while (i <= least) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
}
