package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

// Write a java program that determines the number is positive, negative or zero

import java.util.Scanner;

public class NumPositiveNegative {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();

        if(num>0){
            System.out.println("Given number is positive");
        } else if (num<0) {
            System.out.println("Given number is negative");
        }else {
            System.out.println("Given number is zero");
        }
    }
}
