package src.java.sunil.hackerRank;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the string: ");
        String str = scanner.nextLine();

        if (isPalindrome(str)){
            System.out.println("Given string is palindrome: "+ str);
        }else {
            System.out.println("Given string is not a palindrome: "+ str);
        }


    }

    public static boolean isPalindrome(String str){
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length()-1;

        while (left < right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
