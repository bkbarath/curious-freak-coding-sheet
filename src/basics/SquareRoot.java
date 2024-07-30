package basics;

public class SquareRoot {
    static long floorSqrt(long x) {
        //0 and 1 square same so return x
        if (x == 0 || x == 1) {
            return x;
        }

        // assign start as 1, end and half of the value, and ans
        long start = 1, end = x / 2, ans = 0;

        // run the loop until the start less or equals to end
        while (start <= end) {
            long mid = (start + end) / 2;//find mid value

            //if mid-value production is same as given x then the mid is the perfect root
            if (mid * mid == x) {
                return mid;
            }
            //else if mid-value production  is greater than given value then set end as mid - 1
            if (mid * mid > x) {
                end = mid - 1;
            } else {
                //else if mid-value production  is less than given value then set start as mid + 1
                start = mid + 1;
                ans = mid;
            }
        }
        return ans;//not a perfect root then return the ans
    }

    public static void main(String[] args) {
        System.out.println(floorSqrt(100));
    }
}
