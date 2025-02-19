package src.java.sunil.programmingChallenges.loopsMethodsArrays;

// Write a program to print the multiplication table of given number

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
       multiplicationTable(num);

    }

    public static void multiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
