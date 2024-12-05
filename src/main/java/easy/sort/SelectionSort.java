package easy.sort;

import java.util.Arrays;

/**
 * Алгоритм сортировки выбором (Selection sort)` работает следующим образом:
 * Находим минимальный элемент в массиве.
 * Меняем его местами с первым элементом.
 * Повторяем шаги 1 и 2 для оставшейся части массива, начиная со второго элемента и до конца.
 */

public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(BubleSort.bubbleSort(new int[]{2, 7, 4, 5, 9, 0, 3})));
    }
}
