package easy.array;

import java.util.ArrayList;

/**
 * 1539. Kth Missing Positive Number
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 * Return the kth positive integer that is missing from this array.
 * Example 1:
 * Input: arr = [2,3,4,7,11], k = 5
 * Output: 9
 * Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
 * Example 2:
 * Input: arr = [1,2,3,4], k = 2
 * Output: 6
 * Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 */
public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {
        int index = 0;
        int missingCount = 0;
        int currentPositive = 1;
        while (missingCount < k) {
            if (index < arr.length && arr[index] == currentPositive) {
                index++;
            } else {
                missingCount++;
            }
            currentPositive++;
        }
        return currentPositive - 1;
    }

    public static void main(String[] args) {
        System.out.println(KthMissingPositiveNumber.findKthPositive(new int[]{1, 3, 5, 7}, 3));
    }
}
