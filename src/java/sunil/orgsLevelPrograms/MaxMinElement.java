package src.java.sunil.orgsLevelPrograms;

// Program to find the maximum and minimum element in an ArrayList:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 6, 2, 8, 4));
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
