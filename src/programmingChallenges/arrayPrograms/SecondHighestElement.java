package src.programmingChallenges.arrayPrograms;

import java.util.Arrays;

public class SecondHighestElement {
    public static void main(String[] args) {
        int[] arr={4,8,0,9,5,3};
        Arrays.sort(arr);
        int max= arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
