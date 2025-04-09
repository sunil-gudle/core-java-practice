package src.java.sunil.practicePrograms.java8Features;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/*
Program to convert a Map to a Stream in Java.
Converting only the Keyset of the Map<Key, Value> into Stream:
This can be done with the help of Map.keySet() method which returns a Set view of the keys contained in this map.
In Java 8, this returned set can be easily converted into a Stream of key-value pairs using Set.stream() method.
 */
public class MaptoStream2 {

    // Generic function to convert List of
    // String to List of Integer
    public static <K, V> Stream<K>
    convertMapToStream(Map<K, V> map)
    {
        // Return the obtained Stream
        return map
                // Convert the Map to Set<Key>
                .keySet()
                // Convert the Set to Stream
                .stream();
    }

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Sunil");
        map.put(2, "Rakesh");
        map.put(3, "Shyam");

        // Print the Map
        System.out.println("Map: " + map);

        // Convert the Map to Stream
        Stream<Integer> stream = convertMapToStream(map);

        // Print the TreeMap
        System.out.println("Stream: " + Arrays.toString(stream.toArray()));
    }
}
