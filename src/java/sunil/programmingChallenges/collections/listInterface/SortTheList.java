package src.java.sunil.programmingChallenges.collections.listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTheList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(30);
        numbers.add(90);
        numbers.add(10);
        numbers.add(65);
        numbers.add(99);
        numbers.add(19);
        numbers.add(49);

        System.out.println("Before sorting: "+numbers);

        // sorting the list
        Collections.sort(numbers);
        System.out.println("After sorting: "+numbers);

        // reverse the list
        Collections.reverse(numbers);
        System.out.println("After reversing: "+ numbers);

    }
}
