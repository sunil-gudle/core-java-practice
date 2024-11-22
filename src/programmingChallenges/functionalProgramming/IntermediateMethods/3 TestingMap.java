package src.programmingChallenges.functionalProgramming.IntermediateMethods;

import java.util.List;

// Create a list of strings representing numbers ("1", "2", ...).
// Convert each string to an integer, then again calculating squares of each number using the map operation and sum up the resulting integers.
class TestingMap {
    public static void main(String[] args) {
        List<String> numbers = List.of("1", "2", "3", "4", "5");

        numbers.stream() // converted to stream
                .map(str -> Integer.parseInt(str)) // converted to integers
                .map(num -> Math.pow(num, 2)) // calculated the square
                .reduce(Double::sum) // calculated the addition
                .ifPresent(System.out::println); // printed the result
    }
}
