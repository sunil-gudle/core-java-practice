package src.java.sunil.programmingChallenges.javaBasics;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter the first numbers: ");
        int a = scanner.nextInt();
        System.out.println("Please enter the second number: ");
        int b = scanner.nextInt();
        int c = a + b;

        System.out.println("Hi, "+name + " welcome to daily coding.");
        System.out.println("Sum of given two numbers: "+c);
    }
}
