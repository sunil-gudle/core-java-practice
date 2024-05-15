package src.orgsLevelPrograms;

// Program to find the frequency of elements in an ArrayList:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ElementsFrequency {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 1));
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer element : arrayList) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0)+1);
        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : frequencyMap.entrySet()) {
            System.out.println(integerIntegerEntry.getKey() + " occurs " + integerIntegerEntry.getValue() + " times");
        }
    }
}
