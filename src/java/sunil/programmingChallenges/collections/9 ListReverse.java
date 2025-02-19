package src.java.sunil.programmingChallenges.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Create a program that reverses the elements of a List and prints the reversed list.

class ListReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }

}
