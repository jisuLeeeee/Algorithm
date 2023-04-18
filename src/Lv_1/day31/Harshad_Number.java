package Lv_1.day31;

public class Harshad_Number {
    public boolean solution(int x) {
        boolean answer = true;
        int n = x, sum = 0;

        while(n != 0){
            sum += (n % 10);
            n /= 10;
        }

        if(x % sum != 0)
            answer = false;

        return answer;
    }

    public static void main(String[] args) {
        Harshad_Number harshadNumber = new Harshad_Number();
        int a = 13;
        System.out.println(harshadNumber.solution(a));
    }
}
