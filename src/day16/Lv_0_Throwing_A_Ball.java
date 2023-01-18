package day16;

public class Lv_0_Throwing_A_Ball {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;

        for(int i=1; i<=k; i++){
            if(idx == numbers.length - 2){
                answer = numbers[idx];
                idx = 0;
            }
            else if(idx == numbers.length - 1){
                answer = numbers[idx];
                idx = 1;
            }
            else{
                answer = numbers[idx];
                idx += 2;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Throwing_A_Ball throwingABall = new Lv_0_Throwing_A_Ball();
        int[] a = {1, 2, 3, 4, 5, 6};
        int b = 5;
        System.out.println(throwingABall.solution(a, b));
    }
}
