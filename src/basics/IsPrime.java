package basics;

public class IsPrime {
    static int isPrime(int N) {
        if (N == 1) {
            return 0;
        }
        if (N == 2 || N == 3) {
            return 1;
        }
        if (N % 2 == 0 || N % 3 == 0) {
            return 0;
        }
        for (int i = 5; i <= Math.sqrt(N); i = i + 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return 0;
            }
        }
        return 1;
        // code here
    }

    public static void main(String[] args) {
        System.out.println(isPrime(77));
    }
}
