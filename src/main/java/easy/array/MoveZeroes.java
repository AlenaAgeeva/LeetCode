package easy.array;

import java.util.Arrays;

public class MoveZeroes {
    public static int[] putZerosToEnd(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays
                .toString(MoveZeroes.putZerosToEnd(new int[]{0, 0, 0, 1, 3, 0, 2, 3, 0, 9, 0, 12, 0, 23, 45, 0, 122, 0, 87, 0})));
    }
}
