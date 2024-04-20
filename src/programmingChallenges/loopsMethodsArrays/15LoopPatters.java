package src.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

class LoopPatters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = scanner.nextInt();
        printRightHalfPyramid(rows);
        System.out.println();
        printReverseRightHalfPyramid(rows);
        System.out.println();
        printLeftHalfPyramid(rows);

    }

    public static void printRightHalfPyramid(int maxRows) {
        System.out.println("\nRight Half Pyramid");
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void printReverseRightHalfPyramid(int maxRows) {
        System.out.println("\nReverse Right Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {

            int i = 0;
            while (i < rows) {
                System.out.print("* ");
                i++;
            }

            System.out.println();
            rows--;
        }
    }

    public static void printLeftHalfPyramid(int maxRows) {
        System.out.println("\nLeft Half Pyramid");
        int rows = maxRows;
        while (rows > 0) {

            int j = 0;
            while (j < rows - 1) {
                System.out.print("  ");
                j++;
            }

            int i = 0;
            while (i <= (maxRows - rows)) {
                System.out.print("* ");
                i++;
            }

            System.out.println();
            rows--;
        }
    }
}
