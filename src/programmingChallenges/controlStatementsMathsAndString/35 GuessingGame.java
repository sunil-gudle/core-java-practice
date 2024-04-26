package src.programmingChallenges.controlStatementsMathsAndString;

// Create a number guessing game where the program selects a random number, and the user has to guess it.

import java.util.Scanner;

class GuessingGame {
    int random;
    public GuessingGame() {
        random = (int) Math.ceil(Math.random() * 100);
    }

    /**
     * @param guessNumber the number that player has guessed
     * @return - negative if the guessed the number is smaller
     * - 0 if the guessed number is correct
     * - positive if the guessed number is higher
     */
    int guess(int guessNumber) {

        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to number guessing game\n");
        GuessingGame game = new GuessingGame();

        int guess;
        int result;
        do {
            System.out.print("Please enter the number to be guessed: ");
            guess = scanner.nextInt();
            result = game.guess(guess);
            if (result == 0) {
                System.out.println("congrats, your guess is correct");
            } else if (result < 0) {
                System.out.println("Please guess higher");
            } else {
                System.out.println("Please guess lower");
            }
        } while (result != 0);
    }
}
