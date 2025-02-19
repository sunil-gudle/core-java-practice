package src.java.sunil.programmingChallenges.arrayPrograms;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr={4,5,0,0,8,0,9,7};
        int index=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
               arr[index]=arr[i];
               index++;
            }
        }
        while (index < arr.length) {
            arr[index]=0;
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
