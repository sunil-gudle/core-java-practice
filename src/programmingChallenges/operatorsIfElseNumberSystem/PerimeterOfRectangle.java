package src.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

// Write a program to calculate the perimeter of the rectangle
// Perimeter = a+b+c+d;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter all side in cms: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();

        double perimeter = a+b+c+d;

        System.out.println("Perimeter of the rectangle: " + perimeter + " cms");
    }
}
