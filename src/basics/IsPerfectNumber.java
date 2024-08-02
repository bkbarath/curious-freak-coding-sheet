package basics;

public class IsPerfectNumber {

    static int isPerfectNumber(long N) {

        if (N == 0 || N == 1) {
            return 1;
        }

        long sum = 0;

        if (N % 2 == 0) {
            sum = sum + 2;
        }
        if (N % 3 == 0) {
            sum = sum + 3;
        }

        if (N % 4 == 0) {
            sum = sum + 5;
        }

        for (int i = 5; i <= Math.sqrt(N); i = i + 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(2334534L));
    }
}
