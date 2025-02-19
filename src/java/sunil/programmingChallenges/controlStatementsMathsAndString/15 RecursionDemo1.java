package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

class RecursionDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to factorial by using recursive method\n");
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        long fact = factorial(num);
        System.out.println("Factorial of given number: "+ fact);
    }
    // using recursive method
    public static long factorial(int num){
        if(num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }

    // using for loop
//    public static long factorialIterative(int num){
//        long result = 1;
//        for (int i=1; i<=num; i++){
//            result *=i;
//        }
//        return result;
//    }
}
