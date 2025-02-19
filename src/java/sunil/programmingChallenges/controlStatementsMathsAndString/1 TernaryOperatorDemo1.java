package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;


import java.util.Scanner;

class TernaryOperatorDemo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        // datatype variableName = expression ? if true (result1) : if false (result2);
        int greaterNum = num1 > num2 ? num1 : num2;
        System.out.println(greaterNum + " is the greatest number.");

    }
}
