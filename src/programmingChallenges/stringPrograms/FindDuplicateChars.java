package src.programmingChallenges.stringPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateChars {
    public static void main(String[] args) {
        String str="harshi";
        char[] arr=str.toCharArray();
        List<String> list=new ArrayList<>();

        for (int i=0;i< str.length();i++){
            for (int j=i+1;j< str.length();j++){
                if (arr[i]==arr[j]){
                    list.add(String.valueOf(arr[i]));
                }
            }
        }
        for (String s:list)
        System.out.println(s);
    }
}
