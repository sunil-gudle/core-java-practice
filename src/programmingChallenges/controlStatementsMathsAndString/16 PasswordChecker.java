package src.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

// Create a program using do-while to find password checker until a valid password is entered.

class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to set your password\n");
        boolean isValid;
        String password;
        do {
            System.out.print("Please enter your password: ");
            password = scanner.next();
        }while (!isValidPassword(password));
        System.out.println("Thanks for entering the valid Password");
    }
    public static boolean isValidPassword(String password){
        return password.length()>=8;
    }
}
