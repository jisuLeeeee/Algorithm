package day18;

public class Lv_0_Paper_Cutting {
    public int solution(int M, int N) {
        int answer = M * N - 1;
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Paper_Cutting paperCutting = new Lv_0_Paper_Cutting();
        int a = 2, b = 5;
        System.out.println(paperCutting.solution(a, b));
    }
}
