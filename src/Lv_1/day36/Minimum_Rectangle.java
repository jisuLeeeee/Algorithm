package Lv_1.day36;

import java.util.Arrays;

public class Minimum_Rectangle {
    public int solution(int[][] sizes) {
        int[][] sortArr = new int[2][sizes.length];
        int idx = 0;

        for(int i=0; i<sizes.length; i++){
            sortArr[idx][i] = Math.max(sizes[i][0], sizes[i][1]);
            sortArr[idx+1][i] = Math.min(sizes[i][0], sizes[i][1]);
        }
        Arrays.sort(sortArr[0]);
        Arrays.sort(sortArr[1]);

        return sortArr[0][sortArr[0].length - 1] * sortArr[1][sortArr[1].length - 1];
    }

    public static void main(String[] args) {
        Minimum_Rectangle minimumRectangle = new Minimum_Rectangle();
        int[][] a = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(minimumRectangle.solution(a));
    }
}
