package Lv_1.day32;

public class Sum_of_Two_Integers {
    public long solution(int a, int b) {
        long answer = 0;
        int min = a, max = b;

        if(a > b){
            min = b;
            max = a;
            return calc(min, max);
        }

        return calc(min, max);
    }

    public long calc(int c, int d){
        long result = 0;
        for(int i=c; i<=d; i++){
            result += i;
        }
        return result;
    }
    public static void main(String[] args) {
        Sum_of_Two_Integers sumOfTwoIntegers = new Sum_of_Two_Integers();
        int a = 5, b = 3;
        System.out.println(sumOfTwoIntegers.solution(a,b));
    }
}
