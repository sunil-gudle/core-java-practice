package src.orgsLevelPrograms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Java program for below input {1,2,5,3,0,9,0,9,0} and output should be {0,0,0,1,2,5,3,9,9} with Java 8 features

public class MoveZeros {
    public static void main(String[] args) {
        Integer[] inputArray = {1, 2, 5, 3, 0, 9, 0, 9, 0};

        List<Integer> sortedList = Stream.concat(
                Arrays.stream(inputArray).filter(num -> num == 0),
                Arrays.stream(inputArray).filter(num -> num != 0)
        ).collect(Collectors.toList());

        Integer[] resultArray = sortedList.toArray(new Integer[0]);

        System.out.println(Arrays.toString(resultArray));
    }
}

