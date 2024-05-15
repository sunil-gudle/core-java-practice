package src.programmingChallenges.collections;

import java.util.Arrays;
import java.util.List;

// Write a method that swaps two elements in an ArrayList, given their indices.

class ArrayListSwapping {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Before swapping: "+ list);
        swapList(list, 2, 7);
        System.out.println("After swapping: "+ list);
    }
    public static void swapList(List<Integer> list, int x, int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y, swap);
    }
}
