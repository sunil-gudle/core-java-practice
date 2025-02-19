package src.java.sunil.orgsLevelPrograms;

// Java program for below input {1,2,5,3,0,9,0,9,0} and output should be {0,0,0,1,2,5,3,9,9} with Java 8 features

public class PrintZeroesFirst {
    public static void main(String[] args) {
        int[] input = {1, 2, 5, 3, 0, 9, 0, 9, 0};
        int[] output = moveZerosToFront(input);

        // Printing the output array
        for (int i : output) {
            System.out.print(i + " ");
        }
    }
    public static int[] moveZerosToFront(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int zeroCount = 0;

        // Count the number of zeros
        for (int value : arr) {
            if (value == 0) {
                zeroCount++;
            }
        }

        // Fill the beginning of the result array with zeros
        for (int i = 0; i < zeroCount; i++) {
            result[i] = 0;
        }

        // Place the non-zero elements in the result array
        int index = zeroCount;
        for (int value : arr) {
            if (value != 0) {
                result[index++] = value;
            }
        }

        return result;
    }
}

