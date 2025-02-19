package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

// Write a program to calculate the simple interest
//  SI = (principle * time * rate)/100;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the principle amount in rs: ");
        double p = scanner.nextDouble();
        System.out.print("Please enter the rate of interest in rs: ");
        double r = scanner.nextDouble();
        System.out.print("Please enter the time duration in years: ");
        double t = scanner.nextDouble();

        double simpleInterest = (p * r * t) / 100;

        System.out.println("Simple interest: " + simpleInterest);

    }
}
