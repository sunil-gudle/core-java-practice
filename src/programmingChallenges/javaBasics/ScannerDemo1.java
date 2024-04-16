package src.programmingChallenges.javaBasics;

import java.util.Scanner;

// driver class
public class ScannerDemo1 {
    //main method
    public static void main(String[] args) {
        // Declare the object and initialize with predefined standard input object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the input values: ");
        // String input
        String name = scanner.nextLine();
        // Character input
        char gender = scanner.next().charAt(0);
        //integer input
        int age = scanner.nextInt();
        //long input
        long mobileNo = scanner.nextLong();
        //double type input
        double cgpa = scanner.nextDouble();

        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNo);
        System.out.println("CGPA: " + cgpa);

    }
}
