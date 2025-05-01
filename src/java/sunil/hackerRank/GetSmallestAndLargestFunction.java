package src.java.sunil.hackerRank;

import java.util.Scanner;

/*
Given a string, s, and an integer, k, complete the function so that
it finds the lexicographically smallest and largest substrings of length k.
Complete the getSmallestAndLargest function
 */

public class GetSmallestAndLargestFunction {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next(); // welcometojava
        int k = scan.nextInt(); // 3
        scan.close();

        System.out.println(getSmallestAndLargest(s,k));

    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }

            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }

}
