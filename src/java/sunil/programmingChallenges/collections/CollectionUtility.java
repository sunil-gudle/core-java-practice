package src.java.sunil.programmingChallenges.collections;

import java.util.Collection;

public class CollectionUtility {
    public static <E> void print(Collection<E> collection){
        System.out.print("Collection is: ");
        for (E coll : collection) {
            System.out.printf("%s ", coll);
        }
        System.out.println();
    }
}
