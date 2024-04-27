package src.programmingChallenges.encapsulationAndInheritance.example1.utils;

import src.programmingChallenges.encapsulationAndInheritance.example1.geometry.Circle;
import src.programmingChallenges.encapsulationAndInheritance.example1.geometry.Rectangle;

// Create a simple application with at least two packages: com.example.geometry and com.example.utils. In the geometry package,
// define classes like Circle and Rectangle. In the utils package, create a Calculator class that can compute areas of these shapes.
public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rec = new Rectangle(12, 8);

        double areaOfCircle = Math.PI * Math.pow(circle.radius, 2);
        double recArea = rec.breadth * rec.length;

        System.out.printf("Area of circle is %f, Area of rectangle is %f", areaOfCircle, recArea);
    }
}
