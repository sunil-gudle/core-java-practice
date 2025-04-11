package src.java.sunil.hackerRank;

import java.util.List;

public class PrintNamesFromList {
    public static void main(String[] args) {
        List<String> names = List.of("Sunil", "Shyam", "Ram", "Karan", "Arjun");

        System.out.println(names);

        // iterate through list
        names.forEach(System.out::println);
    }
}
