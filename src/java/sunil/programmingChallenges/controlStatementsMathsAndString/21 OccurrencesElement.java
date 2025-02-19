package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

// Create a program using for-each to the occurrences of a specific element in an array.

import src.java.sunil.programmingChallenges.loopsMethodsArrays.ArrayInputUtility;

import java.util.Scanner;

class OccurrencesElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to finding occurrences of element\n");

        int[] arr = ArrayInputUtility.inputArray();
        System.out.print("Now, enter the number you want to search: ");
        int num = scanner.nextInt();
        int occ = occurrences(arr, num);
        System.out.println("Number of occurrences for given number: "+ occ);


    }
    public static int occurrences(int[] arr, int num){
        int occ = 0;
        for (int element : arr){
            if (element==num){
                occ ++;
            }
        }
        return occ;
    }
}
