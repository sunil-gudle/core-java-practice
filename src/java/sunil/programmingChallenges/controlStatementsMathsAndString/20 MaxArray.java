package src.java.sunil.programmingChallenges.controlStatementsMathsAndString;

import src.java.sunil.programmingChallenges.loopsMethodsArrays.ArrayInputUtility;

// Create a program using for-each to find the maximum value in an integer array.
class maxArray {
    public static void main(String[] args) {

        System.out.println("Welcome to finding max value of array\n");
        int[] arr = ArrayInputUtility.inputArray();

        int max = Integer.MIN_VALUE;
        for (int num : arr){
            if(max < num){
                max = num;
            }
        }
        System.out.println("Maximum number is: "+ max);
    }
}
