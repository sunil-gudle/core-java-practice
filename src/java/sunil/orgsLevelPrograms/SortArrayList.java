package src.java.sunil.orgsLevelPrograms;

// Program to sort elements in ArrayList:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 7, -1));
        Collections.sort(list);
        System.out.println("Sorted arrayList: "+ list);
    }
}
