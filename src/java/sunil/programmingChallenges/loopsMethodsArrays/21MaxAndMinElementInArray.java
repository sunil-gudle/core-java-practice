package src.java.sunil.programmingChallenges.loopsMethodsArrays;

// Create a program to find the maximum and minimum element in an array.

class MaxAndMinElementInArray {
    public static void main(String[] args) {
        int[] numArray = ArrayInputUtility.inputArray();
        int max = maxValue(numArray);
        int min = minValue(numArray);
        System.out.println("Max of the array is: " + max);
        System.out.println("Min of the array is: " + min);

    }

    public static int maxValue(int[] numArray) {

        if (numArray.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = numArray[0];
        int i = 1;
        while (i < numArray.length) {
            if (max < numArray[i]) {
                max = numArray[i];
            }
            i++;
        }
        return max;
    }

    public static int minValue(int[] numArray) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArray.length) {
            if (min > numArray[i]) {
                min = numArray[i];
            }
            i++;
        }
        return min;
    }
}
