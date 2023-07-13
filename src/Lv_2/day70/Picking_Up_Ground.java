package Lv_2.day70;

public class Picking_Up_Ground {
    int solution(int[][] land) {
        int answer = 0;

        for(int i=1; i<land.length; i++){
            land[i][0] += maxNum(land[i-1][1], land[i-1][2], land[i-1][3]);
            land[i][1] += maxNum(land[i-1][0], land[i-1][2], land[i-1][3]);
            land[i][2] += maxNum(land[i-1][0], land[i-1][1], land[i-1][3]);
            land[i][3] += maxNum(land[i-1][0], land[i-1][1], land[i-1][2]);
        }

        for(int num : land[land.length-1]){
            answer = Math.max(num, answer);
        }

        return answer;
    }

    public int maxNum(int a, int b, int c){

        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Picking_Up_Ground pickingUpGround = new Picking_Up_Ground();
        int[][] a = {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}};
        System.out.println(pickingUpGround.solution(a));
    }
}
