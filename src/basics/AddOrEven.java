package basics;

public class AddOrEven {
    static String oddEvenTernary(long n) {
        return n % 2 == 0 ? "even" : "odd";
    }

    static String oddOrEvenIfElse(long n) {
        //find odd or even in single line of code.
        if (n % 2 == 0) {
            //the same get remaining value after divided by 2
            return "even";
            //the remaining is equals to 0 then it become even
        } else {
            //or it returns odd
            return "odd";
        }
    }


    public static void main(String[] args) {
        System.out.println("Add Or even ternary " + oddEvenTernary(1352363463235324245L));
        System.out.println("Add Or even if else " + oddOrEvenIfElse(1352363463235324245L));
    }
}
