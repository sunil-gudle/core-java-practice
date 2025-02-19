package src.java.sunil.orgsLevelPrograms;

// Given a list of strings, create a new list containing the length of each string using stream api.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfStringLength {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("hello", "world", "java", "stream", "api");

        List<Integer> length = stringList.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(length);
    }
}
