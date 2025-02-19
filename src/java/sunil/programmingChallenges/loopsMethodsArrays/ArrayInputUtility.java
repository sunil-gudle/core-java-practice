package src.java.sunil.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

public class ArrayInputUtility {
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter the element number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }

    // Traversing of array
    public static void displayArray(int[] numArray){
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i]+ " ");
            i++;
        }
        System.out.println();
    }

    // taking input for two-dimensional array
    public static int[][] input2DArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Please enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i<rows){
            int j = 0;
            while (j<columns){
                System.out.print("Please enter the row: "+ i+1 + ", column: "+ j+1 + " :");
                numArray[i][j]= scanner.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
}
