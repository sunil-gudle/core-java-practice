package src.programmingChallenges.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Use the Collections class to count the frequency of a particular element in an ArrayList.
class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 8, 1, 8, 9, 1, 1, 2, 2, 3, 3, 8);
        System.out.println(Collections.frequency(list, 1));
        System.out.println(Collections.frequency(list, 2));
        System.out.println(Collections.frequency(list, 8));
    }
}
