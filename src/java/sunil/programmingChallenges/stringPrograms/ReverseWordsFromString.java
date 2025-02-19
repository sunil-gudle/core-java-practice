package src.java.sunil.programmingChallenges.stringPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordsFromString {
    public static void main(String[] args) {
        String str="harshi is a good girl";
        System.out.println("given string:   " +str);
        String[] words= str.split(" ");
        List<String> list= new ArrayList<>();

        for (String word:words){
            list.add(word);
        }
        Collections.reverse(list);

        System.out.println("ReverseWordsFromString:  " +String.join(" ",list));
    }
}
