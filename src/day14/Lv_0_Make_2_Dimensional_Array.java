package day14;

import java.util.Arrays;

public class Lv_0_Make_2_Dimensional_Array {
    public int[][] solution(int[] num_list, int n) {
        int len = num_list.length / n;
        int num = 0;
        int[][] answer = new int[len][n];

        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[i].length; j++){
                answer[i][j] = num_list[num];
                num++;
            }
        }
        return answer;
    }
}
