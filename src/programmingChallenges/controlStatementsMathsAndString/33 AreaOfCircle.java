package src.programmingChallenges.controlStatementsMathsAndString;

// Calculate the area and circumference of a circle for a given radius using Math.PI

import java.util.Scanner;

class AreaOfCircle {
    double radius;

    public AreaOfCircle(double radius) {
        this.radius = radius;
    }

    double getCircumference() {
        return 2 * radius * Math.PI;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your radius: ");
        double radius = scanner.nextDouble();
        AreaOfCircle obj = new AreaOfCircle(radius);
        double area = obj.getArea();
        System.out.println("Area " + area);
        double circumfrce = obj.getCircumference();
        System.out.println("circumference " + circumfrce);
    }
}
