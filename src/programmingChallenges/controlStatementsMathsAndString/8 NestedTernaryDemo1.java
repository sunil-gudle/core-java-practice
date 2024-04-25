package src.programmingChallenges.controlStatementsMathsAndString;

// Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator (e.g., High for scores > 80, Moderate for 50-80, Low for < 50).

import java.util.Scanner;

class NestedTernaryDemo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to nested ternary operator\n");
        System.out.print("Please enter the score of student: ");
        int score = scanner.nextInt();

        String category = score > 80 ? "High" : (score > 50 ? "Moderate" : "Low");
        System.out.println("Your category is " + category);

    }
}
