package src;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChars {
    public static void main(String[] args) {
        String input = "Sunil";
        // Convert the string to lowercase for case-insensitive comparison
        String lowerCaseInput = input.toLowerCase();

        // Use a LinkedHashMap to preserve the insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Populate the map with character counts
        for (char c : lowerCaseInput.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (char c : lowerCaseInput.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                System.out.println("First non-repeated character: " + c);
                return;
            }
        }

        // If no non-repeated character is found
        System.out.println("No non-repeated character found.");

    }

}
