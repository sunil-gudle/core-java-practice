package src.programmingChallenges.operatorsIfElseNumberSystem;

// Write a program to calculate the grades based on marks

import java.util.Scanner;

public class GradesCalculation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the marks: ");
        int marks = scanner.nextInt();

        if(marks>=90){
            System.out.println("A Grade");
        }else if (marks>=75){
            System.out.println("B Grade");
        } else if (marks>=60) {
            System.out.println("C Grade");
        }else if(marks>=35){
            System.out.println("D Grade");
        }else {
            System.out.println("F Grade");
        }

    }
}
