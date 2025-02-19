package src.java.sunil.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

class ArraySearching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {3, 48, 34, 55, 67, 85, 57, 37, 38, 83, 92};
        System.out.print("Please enter the number: ");
        int num = scanner.nextInt();
        boolean result = isFound(arr, num);
        if (result) {
            System.out.println("Given number is present in the array.");
        } else {
            System.out.println("Given number is not present in the array.");
        }
    }
    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) {
            if (arr[index] == num) {
                return true;
            }
            index++;
        }

        return false;
    }
}
