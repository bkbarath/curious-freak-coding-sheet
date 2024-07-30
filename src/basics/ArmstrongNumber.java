package basics;

public class ArmstrongNumber {
    static String armstrongNumber(int n) {
        // code here
        int temp = 0;
        int originalValue = n;

        while (n > 0) {
            int digit = n % 10;
            temp = temp + (int) Math.pow(digit, 3);
            n /= 10;
        }
        return originalValue == temp ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(armstrongNumber(327));
    }
}
