package src.programmingChallenges.functionalProgramming.functionalInterface1;

// Write two versions of a program that calculates the factorial of a number:
// one using structural (procedural) programming, and the other using functional programming.

import java.util.Scanner;
import java.util.stream.IntStream;

class TestingFactorial {
    public static void main(String[] args) {

        System.out.println("Factorial using two ways: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the input number: ");
        int num = scanner.nextInt();
        System.out.println(factorial(num));

        IntStream.rangeClosed(2, num)
                .reduce((a, b)-> a*b)
                .ifPresent(System.out::println);
    }

    public static long factorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <=num ; i++) {
            fact *= i;
        }
        return fact;
    }
}
