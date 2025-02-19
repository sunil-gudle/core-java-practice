package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second Number: ");
        int num2 = scanner.nextInt();

        System.out.println("Addition: "+ (num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println("Multiplication: "+ (num1*num2));
        System.out.println("Division: "+(num2/num1));
        System.out.println("Modulus: "+ (num1%num2));
    }
}
