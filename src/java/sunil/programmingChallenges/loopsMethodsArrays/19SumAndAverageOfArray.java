package src.java.sunil.programmingChallenges.loopsMethodsArrays;

// Create a program to find the sum and average of all elements in an array.

class SumAndAverageOfArray {
    public static void main(String[] args) {

        int[] numArray = ArrayInputUtility.inputArray();

        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + avg);
    }

    public static long sum(int[] numArray) {

        long sum = 0;
        int i = 0;
        while (i < numArray.length) {

            sum = sum + numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return  (sum / numArray.length);
    }
}
