package src.programmingChallenges.arrayPrograms;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(5);
        list1.add(4);
        System.out.println(list1);

        LinkedList<Integer> list2 = new LinkedList<>();

        list2.add(1);
        list2.add(3);
        list2.add(2);
        list2.add(5);
        list2.add(4);
        System.out.println(list2);
    }
}
