package Lv_1.day48;

public class Lotto_Highest_Lowest_Rankings {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7, 7};
        int cnt = 0, diff = 0;

        for (int lotto : lottos) {
            if (lotto == 0) {
                answer[0]--;
                continue;
            }
            for (int winNum : win_nums) {
                if (lotto == winNum) {//최저순위
                    cnt++;
                    answer[0]--;
                    answer[1]--;
                } else
                    diff++;
            }
        }

        if(cnt == 0) { // 모두 0일때 최저순위
            answer[1]--;
            if(diff == 36) // 모든 답이 틀릴 때 최고순위
                answer[0]--;
        }


        return answer;
    }

    public static void main(String[] args) {
        Lotto_Highest_Lowest_Rankings lottoHighestLowestRankings = new Lotto_Highest_Lowest_Rankings();
        int[] a = {44, 1, 0, 0, 31, 25} , b = {31, 10, 45, 1, 6, 19};
        for(int i : lottoHighestLowestRankings.solution(a, b))
            System.out.println(i); // 3, 5
    }
}
