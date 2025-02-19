package src.java.sunil.programmingChallenges.javaBasics;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input value: ");
        n = scanner.nextInt();

        if(n % 2 == 0){
            System.out.println(n + " the given number is even");
        }
        else {
            System.out.println(n + " the given number is odd");
        }
    }
}
