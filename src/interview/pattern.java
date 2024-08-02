package interview;

public class pattern {

    static void diamondPattern(int count) {
        // for Pyramid patten single for
        for (int i = 1; i <= count; i++) {
            for (int j = i; j < count; j++) {
                System.out.print(" ");//make based on the condition
            }
            for (int k = 1; k <= (2 * i - 1); k++) {//create stars based on the conditions
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //for the downwards Pyramid pattern
        for (int i = count; i >= 1; i--) {
            for (int j = i; j < count; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pyramid(int count) {
        // for Pyramid patten single for
        for (int i = 1; i <= count; i++) {
            for (int j = i; j < count; j++) {
                System.out.print(" ");//make based on the condition
            }
            for (int k = 1; k <= (2 * i - 1); k++) {//create stars based on the conditions
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void invertedPyramid(int count) {
        //for the downwards Pyramid pattern
        for (int i = count; i >= 1; i--) {
            for (int j = i; j < count; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void numberPyramid(int count) {
        //for the downwards Pyramid pattern
        for (int i = 1; i <= count; i++) {
            for (int j = i; j < count; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println(" ");
        }
    }

    static void floydPatter(int count) {
        //for the downwards Pyramid pattern
        int num = 1;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                System.out.print(" ");
                num++;
            }
            System.out.println(" ");
        }

        //output
        //    1
        //    2 3
        //    4 5 6
        //    7 8 9 10
        //    11 12 13 14 15

    }

    static void pascalsPattern(int count) {
        //for the downwards Pyramid pattern
        int num = 1;
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                System.out.print(" ");
                num++;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        floydPatter(8);
//        diamondPattern(100);
//        startPattern(150);
    }
}
