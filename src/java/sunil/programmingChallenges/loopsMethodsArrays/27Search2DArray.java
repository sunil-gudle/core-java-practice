package src.java.sunil.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

// Create a program to search an element in a 2-D array.
class Search2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome 2D search\n");
        int[][] numArray = ArrayInputUtility.input2DArray();
        System.out.print("Please enter the number you want to search: ");
        int num = scanner.nextInt();
        boolean isFound = searchElement(numArray, num);
        if (isFound) {
            System.out.println("Your number is found.");
        } else {
            System.out.println("your number is not found");
        }
    }

    public static boolean searchElement(int[][] numArray, int num) {

        int i = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                if (numArray[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
