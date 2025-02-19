package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

// Create a program to calculate the area of triangle
// Area of triangle = (base*height)/2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Please enter the height of triangle: ");
        double height = scanner.nextDouble();

        double area = (base * height) / 2;
        System.out.println("Area of triangle: " + area);

    }
}
