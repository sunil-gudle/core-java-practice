/*input: laptop mobile and desktop are not exempt
output: and are not exempt laptop mobile desktop

Problem Steament : Arrange the words in increasing order of number of characters in words.
Whenever there are multiple words with same number of characters, then they should be alphabetically sorted.
All words are small case. There will be no numbers. Words will be separated by space.*/




        package src.java.sunil.orgsLevelPrograms;

import java.util.Arrays;

public class ArrangeWordsInIncreasingOrderOfNumberOfCharactersInWords {
    public static void main(String[] args) {
        String input = "laptop mobile and desktop are not exempt";
        String output = sortWords(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    public static String sortWords(String input) {
        // Split the input into words
        String[] words = input.split(" ");

        // Sort the words based on length and then alphabetically
        Arrays.sort(words, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });

        // Join the sorted words back into a string
        return String.join(" ", words);
    }

}
