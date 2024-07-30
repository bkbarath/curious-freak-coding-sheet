package basics;

public class IsPalindrome {

    public static String isPalindrome(int n) {
        int originalValue = n;//store original value
        int reversed = 0;//store reversed value

        // run the loop until the given number turns 0
        while (n > 0) {
            // get the last digit
            int digits = n % 10;
            // stored in the reversed value
            reversed = reversed * 10 + digits;
            n /= 10;
        }
        //if original value and the reversed value is same then return Yes or return No
        return originalValue == reversed ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1231));
    }
}
