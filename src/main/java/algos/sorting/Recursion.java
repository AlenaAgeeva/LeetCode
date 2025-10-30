package algos.sorting;

public class Recursion {
    public static int recursion(int[] arr, int index) {
        return index == arr.length - 1
                ? arr[index]
                : arr[index] + recursion(arr, index + 1);
    }

    public static int classicRecursion(int number) {
        return number == 0
                ? 1
                : number * classicRecursion(number - 1);
    }
}
