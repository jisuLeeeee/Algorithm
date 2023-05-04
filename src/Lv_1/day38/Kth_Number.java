package Lv_1.day38;

import java.util.Arrays;

public class Kth_Number {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int j = 0;

        for(int i=0; i<commands.length; i++){
            int[] arr = Arrays.copyOfRange(array, commands[i][j] - 1, commands[i][j+1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][j+2] - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Kth_Number kthNumber = new Kth_Number();
        int[] a = {1, 5, 2, 6, 3, 7, 4};
        int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(kthNumber.solution(a, b)));
    }
}
