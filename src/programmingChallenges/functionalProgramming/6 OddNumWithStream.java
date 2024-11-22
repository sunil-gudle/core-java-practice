package src.programmingChallenges.functionalProgramming;

// Given a list of integers, use stream operations to filter odd numbers and print them.

import java.util.List;

class OddNumWithStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(22, 23, 43, 65, 67, 99, 12);
        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));
    }
}
