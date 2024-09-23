package src.orgsLevelPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// define the list of numbers, and you have find out the second-highest number using stream API

public class SecondHighestNumFromList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 46, 73, 98, 60, 87, 92, 9, 19);

       Optional<Integer> optional = numbers.stream().distinct().sorted((a, b) -> b-a).skip(1).findFirst();
       int secondHighest = optional.get();
        System.out.println(secondHighest);
    }
}
