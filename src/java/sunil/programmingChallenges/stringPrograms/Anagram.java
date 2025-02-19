package src.java.sunil.programmingChallenges.stringPrograms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="listen";
        String str2="silent";

        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (str1.length()==str2.length()){
            if (Arrays.equals(arr1,arr2)){
                System.out.println("both strings are same");
            }
            else {
                System.out.println("both string are not same");
            }
        }else {
            System.out.println("both strings are not of same length");
        }
    }
}
