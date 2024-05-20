package src.programmingChallenges.functionalProgramming.IntermediateMethods;

import java.util.List;
import java.util.stream.Collectors;

// Given an array of integers, create a stream, use the distinct operation to remove duplicates, and collect the result into a new list.

class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5, 6, 7, 3, 4, 5);

        List<Integer> distinctNum = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(distinctNum);

    }
}
