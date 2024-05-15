package src.programmingChallenges.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Write a program that sorts a list of String objects in descending order using a custom Comparator.

class CustomComparator {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sunil", "Kamlesh", "Ramesh", "Suresh");
        System.out.println("Before sorting: "+ list);
        sortInDescending(list);
        System.out.println("After sorting: " + list);
    }
    public static void sortInDescending(List<String> strList){

//        Collections.sort(strList);
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2))
                    return 0;
                else if (o1.charAt(0)<o2.charAt(0)) {
                    return 1;
                }else
                return -1;
            }
        });
    }
}
