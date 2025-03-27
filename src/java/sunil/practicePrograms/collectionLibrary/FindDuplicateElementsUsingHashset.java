package src.java.sunil.practicePrograms.collectionLibrary;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementsUsingHashset {

    public static void findDuplicates(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int num : arr){
            if(!set.add(num)){
                System.out.println("Duplicates: "+ num);
            }
        }
    }

    public static void main(String[] args) {
        findDuplicates(new int[]{1,1,2,3,4,5, 5,6,6,7,8,9});
    }
}
