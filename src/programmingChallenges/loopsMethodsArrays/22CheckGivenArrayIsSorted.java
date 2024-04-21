package src.programmingChallenges.loopsMethodsArrays;

//Create a program to check if the given array is sorted.

class CheckGivenArrayIsSorted {
    public static void main(String[] args) {

        System.out.println("Welcome to array sorting checkpost\n");
        int[] numArray = ArrayInputUtility.inputArray();

        boolean isInc = isIncreasing(numArray);
        boolean isDec = isDecreasing(numArray);
        if (isInc || isDec) {
            System.out.println("Your array is sorted");
        } else {
            System.out.println("your array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] numArray) {
        int i = 1; // started with first element
        while (i < numArray.length) { // will  go till last element
            if (numArray[i] < numArray[i - 1]) { // checking that whether next element is less than previous one, if yes then false
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArray) {
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] > numArray[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}

