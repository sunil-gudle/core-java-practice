package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

// Create a program using recursion to check if a string is a palindrome using recursion.

class CheckStringIsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String str = scanner.next();

        System.out.println("You string is " +
                ((isPalindrome(str) ? "Palindrome" : "Not Palindrome")));
    }
    public static boolean isPalindrome(String str) {

        if (str.length() <= 1) {
            return true;
        }
        int lastPos = str.length() - 1;
        if (str.charAt(0) != str.charAt(lastPos)) {
            return false;
        }
        String newStr = str.substring(1, lastPos);
        return isPalindrome(newStr);
    }
}
