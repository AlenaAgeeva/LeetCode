package algos.search;

/**
 * Initialization: We start by checking if k is valid based on the length of the array. If not, we throw an exception.
 * First Window Calculation: We sum the first k elements of the array and store this sum as windowSum and maxSum.
 * Sliding the Window: We loop through the array starting from the k-th index. For each new element, we adjust
 * windowSum by adding the new element and subtracting the element that is now outside the window.
 * Max Calculation: After adjusting windowSum, we check if it's greater than maxSum and update it accordingly.
 * The function finally returns the maximum sum found.
 */
public class SlidingWindow {
    public static int maxSumSubarray(int[] arr, int k) {
        if (arr.length < k || k <= 0) {
            throw new IllegalArgumentException("Invalid input: array length less than k or k is non-positive.");
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = maxSumSubarray(arr, k);
        System.out.println("Maximum sum of a subarray of size " + k + " is: " + maxSum);
    }
}
