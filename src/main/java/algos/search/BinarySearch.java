package algos.search;

public class BinarySearch {
    public static int getCount(int[] arr, int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (arr[middle] == num) {
                return middle;
            } else if (num < arr[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static int getCount(String[] arr, String name) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (name.equals(arr[middle])) {
                return middle;
            }
            if (name.codePointAt(0) < arr[middle].codePointAt(0)) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(BinarySearch.getCount(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3));
        System.out.println(BinarySearch.getCount(new String[]{"Abby", "Bob", "Grey", "Simon", "Tanuya", "Yan"}, "Yan"));
    }
}
