package src.programmingChallenges.controlStatementsMathsAndString;

//  Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like
//  addition, subtraction, multiplication, and division.

import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to simple calculator\n");
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Now, enter the operation: ");
        String operation = scanner.next();

        int result = switch (operation){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            case "%" -> num1%num2;
            default -> -1;
        };
        System.out.println(result);
    }
}
