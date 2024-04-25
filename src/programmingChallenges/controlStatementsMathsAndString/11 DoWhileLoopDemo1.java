package src.programmingChallenges.controlStatementsMathsAndString;

import java.util.Scanner;

class DoWhileLoopDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // using while loop
//        System.out.print("Please enter the age: ");
//        int age = scanner.nextInt();
//        while (age < 0 || age > 100) {
//            System.out.print("Please enter the age: ");
//            age = scanner.nextInt();
//        }
//        System.out.println("Your age is: " + age);

        // using do while loop
        int age;
        do {
            System.out.print("Please enter your age: ");
            age = scanner.nextInt();
        } while (age < 0 || age > 100);
        System.out.println("Your age is: " + age);
    }
}
