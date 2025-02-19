package src.java.sunil.programmingChallenges.operatorsIfElseNumberSystem;

import java.util.Scanner;

public class SwapTwoNumberUsingThirdVar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second value: ");
        int y = scanner.nextInt();

        int z = x;
        x = y;
        y = z;

        System.out.println("After swapping: \n"+ "The value of x: "+ x + "\nThe value of y: "+ y);

    }
}
