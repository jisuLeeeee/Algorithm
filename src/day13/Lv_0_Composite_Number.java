package day13;

public class Lv_0_Composite_Number {
    public int solution(int n) {
        int answer = 0;
        int count = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if(i % j == 0)
                    count++;
            }
            if(count >= 3)
                answer++;
            count = 0;

        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Composite_Number compositeNumber = new Lv_0_Composite_Number();
        int a = 10;
        System.out.println(compositeNumber.solution(a));
    }
}
