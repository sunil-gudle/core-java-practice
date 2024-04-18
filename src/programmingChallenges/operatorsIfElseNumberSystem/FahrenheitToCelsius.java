package src.programmingChallenges.operatorsIfElseNumberSystem;

//Write the program to convert Fahrenheit to Celsius

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your temperature in Fahrenheit:  ");
        float f = scanner.nextFloat();
        float c = (f - 32) * 5 / 9;

        System.out.println("Temperature in Celsius: " + c);
    }
}
