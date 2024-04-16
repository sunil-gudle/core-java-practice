/*In java Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.
        Example 1:
Input: n = 6 arr[] = {1,2,3,4,5,6}
Output: 615243
Explanation: Max element = 6, min = 1, second max = 5, second min = 2, and so on... Modified array is: 615243.
Example 2:
Input: n = 11 arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60*/

package src.orgsLevelPrograms;

public class RearrangeArrayAlternatively {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        rearrangeArray(arr1);
        printArray(arr1);

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        rearrangeArray(arr2);
        printArray(arr2);
    }

    private static void rearrangeArray(int[] arr) {
        int n = arr.length;

        // Find the maximum and minimum elements in the array
        int maxIndex = n - 1;
        int minIndex = 0;
        int maxElement = arr[n - 1] + 1;

        for (int i = 0; i < n; i++) {
            // Even indices store maximum elements
            if (i % 2 == 0) {
                arr[i] += (arr[maxIndex] % maxElement) * maxElement;
                maxIndex--;
            }
            // Odd indices store minimum elements
            else {
                arr[i] += (arr[minIndex] % maxElement) * maxElement;
                minIndex++;
            }
        }

        // Restore the original values and update the array
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / maxElement;
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
