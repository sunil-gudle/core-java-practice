package src.java.sunil.programmingChallenges.arrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1={4,8,5,2,2,7,8};
        int[] arr2={4,5,10,2,71,8};

        List<Integer> list1= new ArrayList<>();
        List<Integer> list2= new ArrayList<>();

        for (int num:arr1) {
            list1.add(num);
        }

        for (int num:arr2){
        if (list1.contains(num)){
            list2.add(num);
        }
        }
        System.out.println("common element: " +list2);
        }
    }

