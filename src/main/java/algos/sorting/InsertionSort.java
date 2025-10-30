package algos.sorting;

/**
 * Insertion Sort is a simple and intuitive sorting algorithm that builds a sorted array (or list) one
 * element at a time. It is much less efficient on large lists than more advanced algorithms like quicksort
 * or mergesort. However, it has the advantage of being simple to implement and is efficient for small data
 * sets or nearly sorted data.
 */
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 0};
        InsertionSort.insertionSort(arr);
    }
}
