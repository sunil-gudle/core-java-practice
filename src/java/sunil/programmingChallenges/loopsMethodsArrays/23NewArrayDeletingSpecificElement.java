package src.java.sunil.programmingChallenges.loopsMethodsArrays;

//Create a program to return a new array deleting a specific element.

import java.util.Scanner;

class NewArrayDeletingSpecificElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArray = ArrayInputUtility.inputArray();
        System.out.print("Please enter the element to be deleted: ");
        int num = scanner.nextInt();

        int[] newArr = newArray(numArray, num);
        System.out.println("Here is your new array");
        ArrayInputUtility.displayArray(newArr);
    }

    public static int[] newArray(int[] numArray, int num) {
        int occ = occurrence(numArray, num); // took the number of occurrence of given number in the array
        if (occ==0){ // if it's occurrence is 0 then will return that array itself
            return numArray;
        }
        int newSize = numArray.length-occ; // got the new size of array by removing occurrence count
        int[] newArr = new int[newSize]; // new array with new size

        int i =0, j=0;
        while (i<numArray.length){
            if (numArray[i]!=num){  // if i th number is not equal to given number then add to new array, or else skip
                newArr[j] = numArray[i]; // added elements in new array
                j++;
            }
            i++;
        }
        return newArr;
    }

    // will find out the occurrence of the given number
    public static int occurrence(int[] numArray, int num) {
        int occ = 0;
        int i = 0;
        while (i < numArray.length) {
            if (numArray[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
