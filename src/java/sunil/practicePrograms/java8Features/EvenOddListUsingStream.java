package src.java.sunil.practicePrograms.java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;


// Java stream partitioning
// given a list of numbers, partition it with even and odd numbers using stream

public class EvenOddListUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        System.out.println(numbers.stream()
                .collect(Collectors.partitioningBy(n -> n%2==0))
                .entrySet().stream()
                .collect(Collectors.toMap(
                        entry ->
                                entry.getKey() ? "even" : "odd",
                        Map.Entry::getValue

                        )
                )

        );
    }
}
