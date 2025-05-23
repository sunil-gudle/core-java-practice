package src.java.sunil.hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// given an array of integers num and an integer target, return the indices of two numbers such that they add up to target

public class IndicesOfTwoSum {

    public static int[] toSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        System.out.println("Please enter the numbers: ");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Please enter the target: ");
        int target = scanner.nextInt();

        int[] result = toSum(nums, target);

        System.out.println(result[0] + " " + result[1]);


    }
}
