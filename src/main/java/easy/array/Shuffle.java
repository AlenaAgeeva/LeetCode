package easy.array;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

    public static int[] shuffle(int[] arr) {
        Random random = new Random();
        int[] shuffled = arr.clone();
        for (int i = 0; i < shuffled.length - 1; i++) {
            int j = random.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Shuffle.shuffle(new int[]{1, 78, 46, 68, 2, 3, 4, 5, 6, 7, 8, 9})));
    }
}
