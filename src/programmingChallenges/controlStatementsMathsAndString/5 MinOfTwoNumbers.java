package src.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

// Create a program to find the minimum of two numbers.
class MinOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to minimum of two numbers\n");
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        MinOfTwoNumbers ternary = new MinOfTwoNumbers();
        int minNumber = ternary.min(num1, num2);
        System.out.println(minNumber + " is the minimum number");
    }
    public int min(int num1, int num2){
        int minOfTwoNumbers = num1 <num2 ? num1 : num2;
        return minOfTwoNumbers;

        // same thing can be done with  if-else statement
//        if(num1<num2){
//            return num1;
//        }else {
//           return num2;
//        }
    }
}
