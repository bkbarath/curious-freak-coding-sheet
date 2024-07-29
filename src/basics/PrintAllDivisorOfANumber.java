package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintAllDivisorOfANumber {

    public static List<Integer> printDivisors(int n) {
        if (n == 1) {
            return Collections.singletonList(1);
        }

        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n%i==0){
                integerList.add(i);
            }
        }
        return integerList;
    }

    public static void main(String[] args) {
        System.out.println(printDivisors(20));
    }
}
