package src.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

// Write a program to categorize a person into different age group
public class CategorizeIntoAgeGrp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age of person: ");
        int age = scanner.nextInt();

        if(age<=13){
            System.out.println("The person is child");
        } else if (age<=20) {
            System.out.println("The person is teen");
        } else if (age<=60) {
            System.out.println("The person is Adult");
        }else {
            System.out.println("The person is Senior");
        }
    }
}
