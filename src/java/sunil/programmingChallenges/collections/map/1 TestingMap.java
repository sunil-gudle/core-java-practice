package src.java.sunil.programmingChallenges.collections.map;

import java.util.HashMap;
import java.util.Map;

class TestingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sunil", 91);
        map.put("Ram", 96);
        map.put("Shyam", 79);
        map.put("Ramesh", 89);
        map.put("Suresh", 67);

        System.out.println("Size of map: "+ map.size());
        System.out.println(map.get("Sunil"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Baban"));
        System.out.println(map.remove("Suresh"));
        System.out.println("Size of map: "+ map.size());

        System.out.println();
        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));

        }
    }
}
