package src.programmingChallenges.functionalProgramming;

// Convert an array of strings into a stream. Then, use the stream to print each string to the console.

import java.util.List;

class StringWithStream {
    public static void main(String[] args) {

        List<String> names = List.of("Sunil", "prashant", "Ramesh", "Suresh", "karan");

        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
