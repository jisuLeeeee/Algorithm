package Lv_1.day78;

public class Coke_Problem {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(n >= a){
            int receive_bottle = (n / a) * b;
            answer += receive_bottle; // 받은 병의 수
            n = n - (a * (n / a)) + receive_bottle; // 가지고 있는 병의 수(마트의 가져가지 않은 병의 수 + 받은 병의 수)
        }

        return answer;
    }

    public static void main(String[] args) {
        Coke_Problem cokeProblem = new Coke_Problem();
        int empty_bottle = 2, give_bottle = 1, total = 20;
        System.out.println(cokeProblem.solution(empty_bottle, give_bottle, total));
    }
}
