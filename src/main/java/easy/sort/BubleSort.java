package easy.sort;

import java.util.Arrays;

/**
 * Здесь мы используем два вложенных цикла for, чтобы перебрать все элементы массива и сравнить их между собой.
 * Если элементы стоят в неправильном порядке, то мы меняем их местами с помощью временной переменной temp
 */
public class BubleSort {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(BubleSort.bubbleSort(new int[]{2, 7, 4, 5, 9, 0, 3})));
    }

}
