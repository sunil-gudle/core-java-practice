package src.java.sunil.programmingChallenges.javaBasics;

import java.util.Scanner;

//How to Read and Print an Integer value in Java
public class ReadAndPrint {
    public static void main(String[] args) {

        int num;
        System.out.println("Enter the integer number: ");

        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        System.out.println("Entered integer number is: " + num);

    }
}
