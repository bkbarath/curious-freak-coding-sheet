package basics;

public class ReverseIntegerPower {

    static long power(int N, int R) {
        if (R == 0) {//anything power 0 is 1
            return 1;
        }

        // given mod value 10^9+7
        long mod = (long) 1e9 + 7;

        //run a recursion to find the power of the value by splitting its power by 2
        long temp = power(N, R / 2);
        if (R % 2 == 0) {// if power is even then multiply double the time and give the reminder of the mod
            return (temp * temp) % mod;
        } else {// if not then multiply double the time take mod and multiply by another one time for odd value and take reminder of the mod
            return ((temp * temp) % mod * N) % mod;
        }
    }


    public static void main(String[] args) {
        System.out.println(power(12, 21));
    }
}
