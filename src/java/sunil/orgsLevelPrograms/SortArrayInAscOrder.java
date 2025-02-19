/*In java Given an array of size N containing only 0s, 1s, and 2s; Sort the array in ascending order.
Example 1:
Input: N = 5 arr[]= {0 2 1 2 0}
Output: 00122
Explanation: Os 1s and 2s are segregated into ascending order.
Example 2:
Input: N = 3 arr[] = {0 1 0}
Output: 001
Explanation: Os 1s and 2s are segregated into ascending order*/


package src.java.sunil.orgsLevelPrograms;

public class SortArrayInAscOrder {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 1, 2, 0};
        sort012(arr1);
        printArray(arr1);

        int[] arr2 = {0, 1, 0};
        sort012(arr2);
        printArray(arr2);
    }

    private static void sort012(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num);
        }
        System.out.println();
    }
}
