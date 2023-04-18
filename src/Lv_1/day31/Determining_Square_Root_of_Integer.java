package Lv_1.day31;

public class Determining_Square_Root_of_Integer {
    public long solution(long n) {
        long answer = 0;

        double result = Math.sqrt(n);

        if((long)result*(long)result == n)
            return (long)((result + 1) * (result + 1));

        return -1;
    }

    public static void main(String[] args) {
        Determining_Square_Root_of_Integer determiningSquareRootOfInteger = new Determining_Square_Root_of_Integer();
        long a = 121;
        System.out.println(determiningSquareRootOfInteger.solution(a));
    }
}
