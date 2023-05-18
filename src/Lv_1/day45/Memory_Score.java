package Lv_1.day45;

import java.util.*;

public class Memory_Score {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                if(Arrays.asList(name).indexOf(photo[i][j]) == -1)
                    answer[i] += 0;
                else
                    answer[i] += yearning[Arrays.asList(name).indexOf(photo[i][j])];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Memory_Score memoryScore = new Memory_Score();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        for(int i : memoryScore.solution(name, yearning, photo))
            System.out.println(i);
    }
}
