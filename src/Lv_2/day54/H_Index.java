package Lv_2.day54;

import java.util.Arrays;

public class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for(int i=0; i<citations.length; i++){
            int h = citations.length - i;

            if(citations[i] >= h){
                answer = h;
                break;

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        H_Index hIndex = new H_Index();
        int[] c = {3, 0, 1, 6, 5};
        hIndex.solution(c);
    }
}
