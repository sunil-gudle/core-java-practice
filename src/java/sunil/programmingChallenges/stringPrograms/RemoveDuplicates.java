package src.java.sunil.programmingChallenges.stringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "harshi";
        StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.add(ch)) {
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}

