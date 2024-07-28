package basics;

public class ReverseIntegerPower {

    static long power(int N, int R) {
        if (R == 0) {
            return 1;
        }

        long mod = (long) 1e9 + 7;
        long temp = power(N, R / 2);
        if (R % 2 == 0) {
            return (temp * temp) % mod;
        } else {
            return ((temp * temp) % mod * N) % mod;
        }
    }


    public static void main(String[] args) {
        System.out.println(power(12, 21));
    }
}
