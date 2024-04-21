package src.programmingChallenges.loopsMethodsArrays;

import java.util.Scanner;

class ArrayTraversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {36, 33,66, 76, 56, 45, 64, 23, 60};

        int index = 0;
        while (index<arr.length){
            System.out.print(arr[index] + " ");
            index++;
        }


        String [] stringArr = new String[5];
         stringArr[0]= "My String";

         String[] stringArr1 = {"first", "second", "third", "four"};
        System.out.println(stringArr1.length);
    }
}
