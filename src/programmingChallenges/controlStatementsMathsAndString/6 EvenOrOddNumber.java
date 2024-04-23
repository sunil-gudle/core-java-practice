package src.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

//  Create a program to find if the given number is even or odd.
class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to even or odd using ternary operator example\n");
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        EvenOrOddNumber obj = new EvenOrOddNumber();
        String resul1 = obj.evenOrOdd(num);
        System.out.println("Given number is: " + resul1);

    }

    public String evenOrOdd(int num) {
        return num % 2 == 0 ? "even" : "odd";
    }
}
