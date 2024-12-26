package easy.array;

/**
 * 2529. Maximum Count of Positive Integer and Negative Integer
 * Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers
 * and the number of negative integers.
 * In other words, if the number of positive integers in nums is pos and the number of negative integers is neg,
 * then return the maximum of pos and neg.
 * Note that 0 is neither positive nor negative.
 * Example 1:
 * Input: nums = [-2,-1,-1,1,2,3]
 * Output: 3
 * Explanation: There are 3 positive integers and 3 negative integers. The maximum count among them is 3.
 * Example 2:
 * Input: nums = [-3,-2,-1,0,0,1,2]
 * Output: 3
 * Explanation: There are 2 positive integers and 3 negative integers. The maximum count among them is 3.
 * Example 3:
 * Input: nums = [5,20,66,1314]
 * Output: 4
 * Explanation: There are 4 positive integers and 0 negative integers. The maximum count among them is 4.
 */
public class MaximumCountOfPositiveIntegerAndNegativeInteger {
    public static int maximumCount(int[] nums) {
        int length = nums.length;
        if (nums[0] == 0 && nums[length - 1] == 0) {
            return 0;
        }
        if (nums[0] > 0 || nums[nums.length - 1] < 0) {
            return nums.length;
        }
        int startZero = 0;
        int end = length - 1;
        while (startZero <= end) {
            int middle = startZero + (end - startZero) / 2;
            if (nums[middle] < 0) {
                startZero = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        int startPos = startZero;
        int endZero = length - 1;
        while (startPos <= endZero) {
            int middle = startPos + (endZero - startPos) / 2;
            if (nums[middle] == 0) {
                startPos = middle + 1;
            } else {
                endZero = middle - 1;
            }
        }
        return Math.max(startZero, length - startPos);
    }

    public static void main(String[] args) {
        System.out.println(MaximumCountOfPositiveIntegerAndNegativeInteger
                .maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
    }
}
