package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

// Write a program to calculate the compound interest

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principle amount in rs: ");
        float p = scanner.nextFloat();
        System.out.print("Enter the rate in rs: ");
        float r = scanner.nextFloat();
        System.out.print("Enter the time duration in years: ");
        float t = scanner.nextFloat();

        double compI = p * Math.pow((1 + r / 100), t);
        System.out.println("Compound Interest: " + compI);


    }
}
