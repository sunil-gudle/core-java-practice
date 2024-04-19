package src.programmingChallenges.operatorsIfElseNumberSystem;

// Write a program check if a given number is even or odd using bitwise operators

import java.util.Scanner;

public class EvenOrOddUsingBitwise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        if ((num & 1)==1){
            System.out.println("The given number is odd");
        }else {
            System.out.println("The given number is even");
        }
    }
}
