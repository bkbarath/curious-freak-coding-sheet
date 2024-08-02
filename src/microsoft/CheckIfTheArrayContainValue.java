//Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal to the given value.
package microsoft;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheArrayContainValue {

    static boolean twoSum(int[] arr, int val) {
        Set<Object> value = new HashSet<>();

        for (int a : arr) {
            if (value.contains(val + a)) {
                return true;
            } else {
                value.add(a);
            }
        }
        return false;
    }

    public static void main (String[]args)
    {
        int[] test = new int[]{ 5, 7, 1, 2, 8, 10, 4, 3 };
        int[] value = new int[]{ 3, 25, 1, 2, 7 };

        for (int j : value) {
            boolean output = twoSum(test, j);
            System.out.println("Value(" + j + ") = " + (output ? "true" : "false"));
        }
    }
}
