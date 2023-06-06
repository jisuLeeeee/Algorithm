package Lv_1.day53;

import java.util.Arrays;
public class Desktop_Cleanup {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int minY = wallpaper.length;
        int minX = wallpaper[0].length();
        int maxY = 0;
        int maxX = 0;

        for(int i=0; i<wallpaper.length; i++){
            if(wallpaper[i].contains("#")){
                for(int j=0; j<wallpaper[i].length(); j++){
                    if(wallpaper[i].charAt(j) == '#'){
                        if(minY > i){
                            minY = i;
                        }
                        if(minX > j){
                            minX = j;
                        }
                        if(maxY < i){
                            maxY = i;
                        }
                        if(maxX < j){
                            maxX = j;
                        }

                    }
                }
            }
        }

        answer[0] = minY;
        answer[1] = minX;
        answer[2] = maxY + 1;
        answer[3] = maxX + 1;

        return answer;
    }

    public static void main(String[] args) {
        Desktop_Cleanup desktopCleanup = new Desktop_Cleanup();
        String[] a = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        System.out.println(Arrays.toString(desktopCleanup.solution(a)));
    }
}
