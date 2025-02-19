package src.java.sunil.programmingChallenges.arrayPrograms;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr={4,8,0,9,5,3};
        int max= arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
