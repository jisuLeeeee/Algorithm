package Lv_1.day49;

import java.util.Arrays;

public class Gym_Clothes {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌 체육복을 가져온 학색이 도난 당했을 때
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 도난당한 학생에게 체육복을 빌려줄 때
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(reserve[j]-1 == lost[i] || reserve[j]+1 == lost[i]){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Gym_Clothes gymClothes = new Gym_Clothes();
        int n = 5;
        int[] lost = {2,4}, reserve = {1,3,5};
        System.out.println(gymClothes.solution(n, lost, reserve));
    }
}
