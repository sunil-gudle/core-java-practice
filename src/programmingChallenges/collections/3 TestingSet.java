package src.programmingChallenges.collections;

import java.util.HashSet;
import java.util.Set;

class TestingSet {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        System.out.println(set.add("Sunil")); // printing it to check whether it is adding value or not
        System.out.println(set.add("Kamlesh"));
        System.out.println(set.add("Suresh"));
        System.out.println(set.add("Ram"));
        CollectionUtility.print(set);
        System.out.println(set.add("Ram"));
        System.out.println(set.size());
    }
}
