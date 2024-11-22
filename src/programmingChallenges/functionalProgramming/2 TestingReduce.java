package src.programmingChallenges.functionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(numbers.size());

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("printing sum normally: " + sum);

        int newSum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.printf("\nSum using reduce: %d", newSum);

        int newSum2 = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.printf("\nSum using reduce and Lambda: %d", newSum2);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.printf("\nMax using reduce: %d", max);

        int min = numbers.stream()
                .reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.printf("\nMin using reduce: %d", min);
    }
}
