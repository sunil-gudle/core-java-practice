package src.orgsLevelPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

//Find the most frequent word in a given text using stream api
public class MostFrequentWord {
    public static void main(String[] args) {
        String text = "This is a sample text. This text has some repeated words.";

        // split the text into words
        List<String> words = Arrays.asList(text.split("\\s+"));

        // Group words by frequency and find the most frequent one

        Map<String, Long> wordFrequency = words.stream()
                .collect(Collectors.groupingBy(String :: toLowerCase, Collectors.counting()));
        String mostFrequentWord = wordFrequency.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry :: getKey)
                .orElse(null);

        System.out.println("Most Frequent Word is : "+ mostFrequentWord + " with Frequency "+ wordFrequency);

    }
}
