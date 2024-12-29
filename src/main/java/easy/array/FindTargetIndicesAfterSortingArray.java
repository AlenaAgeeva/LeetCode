package easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 2089. Find Target Indices After Sorting Array
 * You are given a 0-indexed integer array nums and a target element target.
 * A target index is an index i such that nums[i] == target.
 * Return a list of the target indices of nums after sorting nums in non-decreasing order.
 * If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
 * Example 1:
 * Input: nums = [1,2,5,2,3], target = 2
 * Output: [1,2]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The indices where nums[i] == 2 are 1 and 2.
 * Example 2:
 * Input: nums = [1,2,5,2,3], target = 3
 * Output: [3]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 3 is 3.
 * Example 3:
 * Input: nums = [1,2,5,2,3], target = 5
 * Output: [4]
 * Explanation: After sorting, nums is [1,2,2,3,5].
 * The index where nums[i] == 5 is 4.
 */
public class FindTargetIndicesAfterSortingArray {
    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (nums[middle] == target) {
                while (middle > 0 && nums[middle - 1] == target) {
                    middle--;
                }
                while (middle < nums.length && nums[middle] == target) {
                    list.add(middle++);
                }
                break;
            } else if (nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(FindTargetIndicesAfterSortingArray
                .targetIndices(new int[]{1, 5, 7, 6, 2, 3, 7, 0, 1, 8, 5, 7, 8, 9, 1, 1, 1, 1, 3, 5}, 1));
    }
}
