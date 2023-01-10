package day12;

public class Lv_0_Finding_Numbers {
    public int solution(int num, int k) {
        int answer = -1;
        int len = (int)( Math.log10(num)+1 );

        for(int i=0; i<len; i++){
            if(num % 10 == k){
                answer = len - i;
            }
            num /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Finding_Numbers findingNumbers = new Lv_0_Finding_Numbers();
        int a = 254492, b = 4;
        System.out.println(findingNumbers.solution(a, b));
    }
}
