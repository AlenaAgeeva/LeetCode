package easy.array;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            return target <= nums[0] ? 0 : 1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (target <= nums[0]) {
                return i;
            } else if (target == nums[i]) {
                return i;
            } else if (target >= nums[i] && target <= nums[i + 1]) {
                return i + 1;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        System.out.println(SearchInsertPosition.searchInsert(new int[]{1, 3}, 3));
    }
}
