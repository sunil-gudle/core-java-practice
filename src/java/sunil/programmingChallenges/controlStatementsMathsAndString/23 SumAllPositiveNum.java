package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

import src.java.sunil.programmingChallenges.loopsMethodsArrays.ArrayInputUtility;

// Create a program using continue to sum all positive numbers entered by the user; skip any negative numbers.

class SumAllPositiveNum {
    public static void main(String[] args) {

        int[] numArr = ArrayInputUtility.inputArray();
        int sum = 0;
        for (int num : numArr) {
            if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of all positive numbers is: " + sum);
    }
}
