package src.java.sunil.programmingChallenges.collections.listInterface;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceExample {
    public static void main(String[] args) {

        List<String>  fruits = new ArrayList<>();

        //adding elements to list
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Cherry");

        // accessing elements from list
        System.out.println("First fruit: "+ fruits.get(0));
        System.out.println("Second fruit: "+ fruits.get(1));
        System.out.println("Third fruit: "+ fruits.get(2));

        // Iterating over the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // checking if the list contains specific element
        System.out.println("List contains apple: "+ fruits.contains("Apple"));
        System.out.println("List contains Banana: "+ fruits.contains("Banana"));
        System.out.println("List contains Pineapple: "+ fruits.contains("Pineapple"));

        // removing elements from the list
        fruits.remove(1);
        fruits.remove("Cherry");
        System.out.println("List after removing the elements: "+fruits);

    }
}
