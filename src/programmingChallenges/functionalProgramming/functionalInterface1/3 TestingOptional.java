package src.programmingChallenges.functionalProgramming.functionalInterface1;

// Write a function that accepts a string and returns an Optional<String>.
// If the string is empty or null, return an empty Optional, otherwise, return an Optional containing the uppercase version of the string.

import java.util.Optional;

class TestingOptional {
    public static void main(String[] args) {
        System.out.println(toOptionalString(null));
        System.out.println(toOptionalString(""));
        System.out.println(toOptionalString("java"));

    }

    public static Optional<String> toOptionalString(String str){
        if (str == null || str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
