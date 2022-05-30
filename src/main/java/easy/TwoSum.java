package easy;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * @author Alena Ageeva
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        loop:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i, j};
                    break loop;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        System.out.println(Arrays.toString(two.twoSum(new int[]{1, 3, 10, 23, 54, 77, 3, 4, 5}, 7)));
    }
}
