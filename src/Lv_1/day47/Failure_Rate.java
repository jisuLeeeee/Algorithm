package Lv_1.day47;

public class Failure_Rate {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] user = new int[N]; // 스테이지에 머물러 있는(도달하지 못한) 사용자 수
        double[] failure_rate = new double[N]; // 실패율 저장을 위한 변수

        for(int stage : stages){
            if(stage <= N)
                user[stage-1]++;
        }

        int players = stages.length;
        for(int i=0; i<N; i++){
            failure_rate[i] = (double)user[i] / players;
            players -= user[i];
            answer[i] = i+1; // 스테이지 번호 저장
        }


        for(int i=0; i<N; i++){
            for(int j=1; j<N-i; j++){
                if(failure_rate[j-1] < failure_rate[j]){ // 내림차순이므로 작은 수부터 정렬
                    double tmp = failure_rate[j-1];
                    failure_rate[j-1] = failure_rate[j];
                    failure_rate[j] = tmp;

                    int a_tmp = answer[j-1]; // 스테이지 번호도 같이 정렬
                    answer[j-1] = answer[j];
                    answer[j] = a_tmp;

                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Failure_Rate failureRate = new Failure_Rate();
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        for(int i : failureRate.solution(N, stages))
            System.out.print(i + ", ");
    }
}
