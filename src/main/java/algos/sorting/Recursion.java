package algos.sorting;

import java.util.Arrays;

public class Recursion {
    public static int recursion(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        } else {
            return arr[index] + recursion(arr, index + 1);
        }
    }
}
