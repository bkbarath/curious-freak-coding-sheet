package basics;

public class ReverseIntegerPower {

    static long power(int N, int M){
        long power = 1L;

        for(int i =0; i<M;i++ ){
            power =power*N;
        }
        return power;
    }


    public static void main(String[] args){
        System.out.println(power(12,21));
    }
}
