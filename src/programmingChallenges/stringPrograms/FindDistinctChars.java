package src.programmingChallenges.stringPrograms;

import java.util.HashSet;

public class FindDistinctChars {
    public static void main(String[] args) {
        String str="harshi";
        char[] arr=str.toCharArray();
        HashSet set =new HashSet<>();

        for (int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println("string length: " +str+" "+str.length());
        System.out.println("distinct chars size: " +set.size());

        for (Object s:set)
        System.out.println(s);
    }
}
