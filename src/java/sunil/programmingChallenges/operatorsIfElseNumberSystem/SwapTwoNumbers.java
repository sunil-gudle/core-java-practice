package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 =scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Swapping of two number without using third variable
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("After swapping: \n"+ "Num1: "+num1 + "\nNum2: "+num2);
    }
}
