package src.java.sunil.programmingChallenges.collections.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ListStreamExample {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("apple");
        items.add("banana");
        items.add("mango");
        items.add("Dates");
        items.add("cherry");
        items.add("abcd");


        // Filtering the list using stream
        List<String> filteredList = items.stream().filter(item -> item.startsWith("a"))
                .toList();
        System.out.println("Filtered list: "+ filteredList);

        // Mapping the list
        List<String> upperCaseList = items.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase list: "+ upperCaseList);

        // counting elements in the list
        long count = items.stream().count();
        System.out.println("Count of items: "+ count);
    }
}
