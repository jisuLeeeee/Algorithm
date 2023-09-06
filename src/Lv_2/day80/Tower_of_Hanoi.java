package Lv_2.day80;

public class Tower_of_Hanoi {
    private int idx = 0;

    public int[][] solution(int n) {
        int[][] answer = new int[(int)Math.pow(2, n) - 1][2];

        hanoi(1, 2, 3, n, answer);

        return answer;
    }

    public void hanoi(int start, int middle, int end, int n, int[][] answer){
        if(n == 1){
            answer[idx++] = new int[]{start, end};
        }
        else{
            hanoi(start, end, middle, n-1, answer);
            answer[idx++] = new int[]{start, end};
            hanoi(middle, start, end, n-1, answer);
        }
    }

    public static void main(String[] args) {
        Tower_of_Hanoi towerOfHanoi = new Tower_of_Hanoi();
        for(int[] i : towerOfHanoi.solution(3)){
            System.out.print("[" + i[0] + ", " + i[1] + "]" + ", ");
        }
    }
}
