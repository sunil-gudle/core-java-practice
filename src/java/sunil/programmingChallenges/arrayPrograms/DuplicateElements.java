package src.java.sunil.programmingChallenges.arrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr={4,8,5,2,2,7,8};

        List<Integer> list= new ArrayList<>();
        for (int i=0;i<= arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]==arr[j]){
                    list.add(arr[i]);
                    }
                }
            }

        for (int num:list){
            System.out.println("duplicate element: " +num);
        }
        }
    }

