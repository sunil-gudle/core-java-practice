package src.programmingChallenges.controlStatementsMathsAndString;

// Create a program using do-while to implement a number guessing game.

import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to number guessing game\n");
        int num = 5;

        int guess;
        do {
            System.out.print("Please guess the number between 0 and 10: ");
            guess = scanner.nextInt();
        }while (num!=guess);
        System.out.println("You have successfully guessed the number");
    }
}
