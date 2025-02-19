package src.java.sunil.orgsLevelPrograms;

// Program to remove duplicates from an ArrayList:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> listWithDuplicates = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 3, 5));
        Set<Integer> uniqueElements = new HashSet<>(listWithDuplicates);
        ArrayList<Integer> listWithoutDuplicates = new ArrayList<>(uniqueElements);

        System.out.println("List with duplicates: " + listWithDuplicates);
        System.out.println("List without duplicates: " + listWithoutDuplicates);
    }
}
