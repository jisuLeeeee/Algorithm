package Lv_2.day45;

public class Expected_Match_List {
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        while(Math.abs(a-b) != 1 || Math.max(a, b) % 2 != 0){
            a = (a % 2 == 0) ? a / 2 : (a + 1) / 2;
            b = (b % 2 == 0) ? b / 2 : (b + 1) / 2;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Expected_Match_List expectedMatchList = new Expected_Match_List();
        int N = 8, A = 4, B = 5;
        System.out.println(expectedMatchList.solution(N, A, B));
    }
}
