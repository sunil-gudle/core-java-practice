package src.orgsLevelPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInArrays {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8, 9};

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i : arr1) {
            list1.add(i);
        }

        for (int i : arr2){
            list2.add(i);
        }

        for (int i : list1){
            if (list2.contains(i)){
                result.add(i);
            }
        }
        System.out.println("result" + result);

        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++){
            resultArray[i] = result.get(i);
        }
        System.out.println("Final Result: "+ Arrays.toString(resultArray));
    }
}
