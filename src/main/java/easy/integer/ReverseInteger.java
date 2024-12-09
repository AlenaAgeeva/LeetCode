package easy.integer;

public class ReverseInteger {
    public static int reverse(int num) {
        int rsl = 0;
        while (num != 0) {
            rsl = rsl * 10 + num % 10;
            num = num / 10;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(ReverseInteger.reverse(123));
    }
}
