package basics;

import java.util.Arrays;

public class CountDigitsInNumber {
    static int countNumberThroughLoop(Long number) {
        String length = String.valueOf(number);
        return length.length();
    }

    static int evenlyDivides(int N) {
        int count = 0;
        int realN = N;

        while (N > 0) {
            int digit = N % 10;
            if (digit != 0 && realN % digit == 0) {
                ++count;
            }
            N /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberThroughLoop(213412123123L));
        System.out.println(evenlyDivides(24406));
    }
}
