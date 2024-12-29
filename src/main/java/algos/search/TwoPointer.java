package algos.search;

/**
 * Edge Case Handling: If the input array is empty, we return 0.
 * Initialization: We initialize uniqueIndex to 0. This will keep track of the position where the next unique
 * element should be placed.
 * Loop through the Array: We start a loop from the second element (index 1). For each element:
 * We check if it is different from the element at uniqueIndex.
 * If it is different, we increment uniqueIndex and set nums[uniqueIndex] to the current element, which
 * effectively keeps the unique elements at the start of the array.
 * Return the Length: After the loop, we return uniqueIndex + 1 because uniqueIndex is zero-based and
 * represents the last unique element's index.
 */
public class TwoPointer {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int length = removeDuplicates(nums);
        System.out.println("New length: " + length);
        System.out.print("Modified array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
