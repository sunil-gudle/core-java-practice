/*In java Given an array arr[] and an integer K where K is smaller than size of array,
the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.Example 1:
Input: N = 6 arr[] = 7 10 4 3 20 15 K = 3 Output: 7 Explanation : 3rd smallest element in the given array is 7.
Example 2:
Input: N = 5 arr[] = 7 10 4 20 15 K = 4 Output: 15 Explanation : 4th smallest element in the given array is 15.*/

package src;

import java.util.Arrays;

public class NegativeElementAtEndOfArr {
    public static void main(String[] args) {

        int[] arr1 = {7, 10, 4, 3, 20, 15};
        int k1 = 3;

        int result1 = kthSmallest(arr1, k1);
        System.out.println("Output for Example 1: " + result1);

        int[] arr2 = {7, 10, 4, 20, 15};
        int k2 = 4;

        int result2 = kthSmallest(arr2, k2);
        System.out.println("Output for Example 2: " + result2);
    }

    private static int kthSmallest(int[] arr, int k) {
        // Sorting the array
        Arrays.sort(arr);

        // Returning the Kth smallest element
        return arr[k - 1];
    }
}
