package src.java.sunil.practicePrograms.collectionLibrary;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharUsingHashmap {
    public static char firstUniqueChar(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+ 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return '_';
    }

    public static void main(String[] args) {
        System.out.println("First unique char: "+ firstUniqueChar("ssuunil"));
    }
}
