//Java Program to Find the Largest of three Numbers

package src.programmingChallenges.javaBasics;

import java.util.Scanner;

public class LargestOfThree {
    // Function to find the biggest of three numbers
    static int largestOfThree(int x, int y, int z) {
        //return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
        return Math.max(z, (Math.max(x, y)));
    }

    // main driver function
    public static void main(String[] args) {
        // Declaring variables for 3 numbers
        int a, b, c;

        Scanner scanner = new Scanner(System.in);
        // Variable holding the largest number
        int largest;
        System.out.println("Enter the first number: ");
        a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        b = scanner.nextInt();
        System.out.println("Enter the third number: ");
        c = scanner.nextInt();
        // Calling the above function in main
        largest = largestOfThree(a, b, c);

        // Printing the largest number
        System.out.println(largest
                + " is the largest number.");
    }
}

