package basics;

public class ReverseInteger {
    static long reverseInteger(long n) {
        long reverse = 0;
        while (n > 0) {
            long remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(7458465965756L));
    }
}
