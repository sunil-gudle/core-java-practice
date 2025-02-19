package src.java.sunil.programmingChallenges.loopsMethodsArrays;

// Create a program to reverse an array.

class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to reversing of array\n");
        int[] numArray = ArrayInputUtility.inputArray();

        reverse(numArray);
        System.out.print("Your reversed array is: ");
        ArrayInputUtility.displayArray(numArray);
    }
    public static void reverse(int[] numArray){
        int i =0;
        while (i< (numArray.length/2)){
            int swap = numArray[i]; // stored the first number
            numArray[i]=numArray[(numArray.length -1) -i];  // stored last number
            numArray[(numArray.length - 1)-i] = swap; // stored the first number
            i++;
        }
    }
}
