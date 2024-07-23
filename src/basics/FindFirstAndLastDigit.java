package basics;

import java.math.BigInteger;

//12-July-2024
public class FindFirstAndLastDigit {
    static int getLastDigit(String a, String b) {
        if(b.equals("0")) return 1;//anything power 0 is equals to 1
        BigInteger aValue =new BigInteger(a);
        BigInteger bValue =new BigInteger(b);

        BigInteger exponent = bValue.mod(BigInteger.valueOf(4)).add(BigInteger.valueOf(4));
        return aValue.modPow(exponent,BigInteger.TEN).intValue();
    }

    static long firstDigitWithLoop(long n) {
        while (n > 10)//get un till only one digit
            n /= 10;//divided by 10
        return n;//rerun the remaining one digit
    }

    static long firstDigitWithoutLoop(long n) {
        long digits = (long) Math.log10(n);//get digits of the number length -1
        n = (long) (n / Math.pow(10, digits));//get the first digit
        return n;
    }

    static long firstDigitByStringOperation(long n) {
        String value = Long.toString(n);//convert the number to string
        return value.charAt(0) - '0';//get first index of the number
    }

    static long lastDigit(long n) {
        n = n % 10;//number divided by 10 basic method
        return n;//return remaining
    }

    static long lastDigitByStringOperation(long n) {
        String value = Long.toString(n);//convert long to string
        return value.charAt(value.length() - 1) - '0';//return last index of the string
    }

    public static void main(String[] args) {
        System.out.println(getLastDigit("267346343", "16320"));
        System.out.println(firstDigitWithLoop(97324124122433232L));
        System.out.println(firstDigitByStringOperation(97324124122433232L));
        System.out.println(firstDigitWithoutLoop(97324124122433232L));
        System.out.println(lastDigit(412418757586559752L));
        System.out.println(lastDigitByStringOperation(412418757586559752L));
    }
}
