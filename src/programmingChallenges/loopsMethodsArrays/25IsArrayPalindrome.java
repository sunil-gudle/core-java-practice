package src.programmingChallenges.loopsMethodsArrays;

//Create a program to check is the array is palindrome or not.

class IsArrayPalindrome {
    public static void main(String[] args) {

        System.out.println("Welcome to palindrome checker\n");
        int[] numArray = ArrayInputUtility.inputArray();
        boolean isPalin = isPalindrome(numArray);
        if (isPalin) {
            System.out.println("Your array is palindrome");
        }else {
            System.out.println("Your array is not a palindrome");
        }
    }
    public static boolean isPalindrome(int[] numArray){

        int i = 0;
        while (i< (numArray.length-1)){
            if(numArray[i]!= numArray[(numArray.length-1)-i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
