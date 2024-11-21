package src.programmingChallenges.arrayPrograms;

public class MinElement {
    public static void main(String[] args) {
        int[] arr={4,8,0,9,5,3};
        int min= arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
