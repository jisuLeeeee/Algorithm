package day3;

public class Lv_0_Duplicate_Number {
    public int solution(int[] array, int n) {
        int answer = 0;

        for(int i:array){
            if(i == n) answer ++;
        }

        return answer;
    }
}//이번엔 for-each 구문 사용해봄 ㅎㅎ
