package src.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

// Write a program to determine the given number is odd or even

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("Given number is even");
        }else {
            System.out.println("Given number is odd");
        }
    }
}
