package src.java.sunil.programmingChallenges.arrayPrograms;



public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int [] arr = {0,0,0,1};
        int index = 0;

        for (int i = 0; i <arr.length; i++){
            if (arr[i]!= 0){
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < arr.length){
            arr[index]= 0;
            index++;
        }
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
