package day8;

public class Lv_0_Find_Square_Root {
    public int solution(int n) {
        int answer = 0;

        for(int i=0; i*i<=n; i++){
            if(i*i == n)
                answer = 1;
            else
                answer = 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Find_Square_Root findSquareRoot = new Lv_0_Find_Square_Root();
        int a = 144;
        System.out.println(findSquareRoot.solution(a));
    }
}
