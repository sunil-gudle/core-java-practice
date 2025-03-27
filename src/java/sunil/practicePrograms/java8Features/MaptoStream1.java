package src.java.sunil.practicePrograms.java8Features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

// Program to convert a Map to a Stream in Java
/*
Converting complete Map<Key, Value> into Stream: This can be done with the help of Map.entrySet() method
which returns a Set view of the mappings contained in this map.
In Java 8, this returned set can be easily converted into a Stream of key-value pairs
using Set.stream() method.
 */


public class MaptoStream1 {

    public static <K, V> Stream<Map.Entry<K, V>> converMapToStream(Map<K, V> map){

        // Return the obtained Stream & Convert the Map to Set & Convert the Set to Stream
        return map.entrySet().stream();
    }

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Sunil");
        map.put(2, "Rakesh");
        map.put(3, "Shyam");
        map.put(4, "Shinoy");

        // printing the map
        System.out.println("Map: " + map);

        Stream<Map.Entry<Integer, String>> stream = converMapToStream(map);

        // Print the TreeMap
        System.out.println("Stream: "+ Arrays.toString(stream.toArray()));
    }
}
