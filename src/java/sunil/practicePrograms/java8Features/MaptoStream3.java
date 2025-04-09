package src.java.sunil.practicePrograms.java8Features;

/*
Program to convert a Map to a Stream in Java
Converting only the Value of the Map<Key, Value> into Stream: This can be done with the help of Map.values() method
which returns a Set view of the values contained in this map.
In Java 8, this returned set can be easily converted into a Stream of key-value pairs using Set.stream() method
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MaptoStream3 {

    public static <K, V>Stream<V> convertMapToStream(Map<K, V> map){
        return map.values().stream();
    }
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Sunil");
        map.put(2, "Rakesh");
        map.put(3, "Shyam");

        System.out.println("Map: "+ map);

        Stream<String> stream = convertMapToStream(map);

        System.out.println("Stream: "+ Arrays.toString(stream.toArray()));

    }
}
