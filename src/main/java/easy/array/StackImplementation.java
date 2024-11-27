package easy.array;

import java.util.Arrays;

public class StackImplementation {
    private int[] arr = new int[0];

    public int pop() {
        checkLength();
        int rst = arr[arr.length - 1];
        int[] reducedArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, reducedArray, 0, arr.length - 1);
        arr = reducedArray;
        return rst;
    }

    private void checkLength() {
        if (arr.length == 0) {
            throw new RuntimeException("Stack is empty.");
        }
    }

    public int peek() {
        checkLength();
        return arr[arr.length - 1];
    }

    public void push(int t) {
        int[] copyArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, copyArray, 0, arr.length);
        copyArray[arr.length] = t;
        arr = copyArray;
    }

    public int[] getArr() {
        return arr;
    }

    public static void main(String[] args) {
        StackImplementation test = new StackImplementation();
        test.push(1);
        test.push(22);
        test.push(333);
        test.push(4444);
        System.out.println(Arrays.toString(test.getArr()));
        System.out.println(test.peek());
        System.out.println(test.pop());
        System.out.println(test.pop());
        test.push(4444);
        test.push(4444);
        test.push(4444);
        System.out.println(Arrays.toString(test.getArr()));
    }
}
