package src.programmingChallenges.arrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class MoveZerosToFront {
    public static void main(String[] args) {
        int[] arr={4,5,0,0,8,0,9,7};
        int count=0;
        int k=0;

        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                list.add(arr[i]);
            }else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i]=0;
        }

        for (int i = count; i < arr.length ; i++) {
            arr[i]=list.get(k);
            k++;
        }
        for (int num:arr){
            System.out.println(num);
        }
    }
}
