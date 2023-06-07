package Lv_2.day54;

public class Fibonacci_Number {
    public int solution(int n) {
        int[] F = new int[n+1];
        F[0] = 0; F[1] = 1;

        for(int i=2; i<=n; i++){
            F[i] = (F[i-1] + F[i-2]) % 1234567;
        }

        return F[n];
    }

    public static void main(String[] args) {
        Fibonacci_Number fibonacciNumber = new Fibonacci_Number();
        int a = 3;
        System.out.println(fibonacciNumber.solution(a));
    }
}
