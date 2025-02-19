package src.java.sunil.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;


// Create a program to find number of occurrences of an element in an array.

class NumberOfOccurrencesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to array occurrences ");
        int[] numArray = ArrayInputUtility.inputArray();
        System.out.print("Now enter the number you want to find: ");
        int num = scanner.nextInt();

        int occurrences = numberOfOccurrences(numArray, num);
        System.out.println("Your element found " + occurrences + " times in the array.");
    }

    public static int numberOfOccurrences(int[] numArray, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
