package src.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

class AddTwoMatrices {
    public static void main(String[] args) {



        int[][] numArray1 = AddTwoMatrices.inputMatrices();
        int[][] numArray2 = AddTwoMatrices.inputMatrices();

        int size = 2;

        // Add the two matrices
        int[][] result = add(numArray1, numArray2, size);


        // Printing the result
        System.out.println("Resultant Matrix after Addition:");
        printMatrix(result);

    }
    // method to take inputs from user for matrices
    public static int[][] inputMatrices() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("please enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.print("Please enter the row: " + i + 1 + ", column " + j + 1 + " : ");
                numArray[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }

    // method to print the matrix
    public static void printMatrix(int[][] numArray) {
        int rows = numArray.length;
        int cols = numArray[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Function to add the two matrices
    // and store in matrix C
    static int[][] add(int [][] a, int [][] b, int size) {
        int i, j;
        int[][] c = new int[size][size];

        for (i = 0; i < size; i++)
            for (j = 0; j < size; j++)
                c[i][j] = a[i][j] + b[i][j];

        return c;
    }
}
