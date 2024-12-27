package algos.sorting;

import java.util.Arrays;

/**
 * Проходим по массиву с начала до конца, и при нахождении элемента,
 * который меньше предыдущего элемента, меняем их местами.
 * Затем проходим от конца массива к началу и при нахождении элемента,
 * который больше предыдущего элемента, меняем их местами.
 * Это повторяется до тех пор, пока массив не будет полностью отсортирован
 */
public class ShuttleSort {
    public static int[] shuttleSort(int[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length - 1;
        while (swapped) {
            swapped = false;
            for (int i = start; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ShuttleSort.shuttleSort(new int[]{2, 7, 4, 5, 9, 0, 3})));
    }
}
