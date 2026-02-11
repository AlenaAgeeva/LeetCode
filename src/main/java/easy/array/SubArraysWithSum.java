package easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Дан массив целых чисел: int[] nums
 * и число: int target
 * Нужно найти все подмассивы, сумма которых равна target.
 * Подмассив — это непрерывная последовательность элементов.
 */
public class SubArraysWithSum {
    public static List<int[]> findSubArraysWithSumPositive(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return List.of();
        }
        List<int[]> result = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == target) {
                result.add(Arrays.copyOfRange(nums, i, i + 1));
                sum = 0;
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target) {
                    result.add(Arrays.copyOfRange(nums, i, ++j));
                    sum = 0;
                    break;
                } else if (sum > target) {
                    sum = 0;
                    break;
                }
            }
        }
        return result;
    }

    public static List<int[]> findSubArraysWithSumNegative(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return List.of();
        }
        List<int[]> result = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == target) {
                result.add(Arrays.copyOfRange(nums, i, i + 1));
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == target) {
                    result.add(Arrays.copyOfRange(nums, i, ++j));
                }
            }
            sum = 0;
        }
        return result;
    }
}
