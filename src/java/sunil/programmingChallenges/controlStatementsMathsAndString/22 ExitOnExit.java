package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

// Create a program using break to read inputs from the user in a loop and break the loop if a specific keyword (like "exit") is entered.

import java.util.Scanner;

class ExitOnExit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter your command: ");
            String command = scanner.next();
            if (command.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You have successfully exited.");
    }
}
