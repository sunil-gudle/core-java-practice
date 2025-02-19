package src.java.sunil.programmingChallenges.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(1);
        numList.add(47);
        numList.add(76);
        numList.add(-36);
        numList.add(45);

        CollectionUtility.print(numList);

        Collections.sort(numList);
        CollectionUtility.print(numList);
        Collections.reverse(numList);
        CollectionUtility.print(numList);
    }
}
