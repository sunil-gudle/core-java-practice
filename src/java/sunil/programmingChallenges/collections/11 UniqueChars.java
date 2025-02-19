package src.java.sunil.programmingChallenges.collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Write a program that takes a string and returns the number of unique characters using a Set.

class UniqueChars {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your string: ");
        String str = scanner.next();

        for (char ch : str.toCharArray()){
            set.add(ch);
        }
        System.out.printf("Your string has %d unique characters", set.size());
    }
}
