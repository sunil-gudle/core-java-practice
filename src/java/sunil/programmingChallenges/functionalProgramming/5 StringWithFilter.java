package src.java.sunil.programmingChallenges.functionalProgramming;

// Given a list of strings, use stream operations to filter out strings that have length of 10 or more and then concatenate the remaining strings.

import java.util.List;

class StringWithFilter {
    public static void main(String[] args) {
        List<String> stringList = List.of("Java", "Sikh", "raha", "hoon", "Prashant Jain", "is teaching java", "On KG coding", "youtube channel", "aur ekdam sahi se padhaya hai", "Badhiya", "sahi");

        String result = stringList.stream()
                .filter(list -> list.length() > 10)
                .reduce("", (a, b) -> a + " " + b);

        System.out.println("Output String: " + result);

    }
}
