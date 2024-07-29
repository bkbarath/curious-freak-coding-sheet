package basics;

public class GCD {

    public static int gcd(int a, int b) {
        int remainder = 1;
        int dividend, divider;
        if (a > b) {
            dividend = a;
            divider = b;
        } else {
            dividend = b;
            divider = a;
        }
        while (remainder != 0) {
            remainder = dividend % divider;
            if (remainder != 0) {
                dividend = divider;
                divider = remainder;
            }
        }
        return divider;
    }

    public static void main(String[] args) {
        System.out.println(gcd(16, 6));
    }
}
