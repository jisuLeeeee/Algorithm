package day18;

import java.util.Arrays;

public class Lv_0_Width_of_Rectangle {
    public int solution(int[][] dots) {
        int answer = 0;
        int[] x = new int[4];
        int[] y = new int[4];

        for(int i=0; i<dots.length; i++){
            for(int j=0; j<1; j++){
                x[i] = dots[i][0];
                y[i] = dots[i][1];
            }
        }

        Arrays.sort(x);
        Arrays.sort(y);

        answer = (x[3] - x[0]) * (y[3] - y[0]);
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Width_of_Rectangle widthOfRectangle = new Lv_0_Width_of_Rectangle();
        int[][] a = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        System.out.println(widthOfRectangle.solution(a));
    }
}
