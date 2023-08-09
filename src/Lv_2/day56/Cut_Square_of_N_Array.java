package Lv_2.day56;

public class Cut_Square_of_N_Array {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];

        for(int i = 0; i < answer.length; i++){
            int r = (int)((i + left) / n) + 1;
            int c = (int)((i + left) % n) + 1;
            answer[i] = Math.max(r, c);
        }

        return answer;
    }

    public static void main(String[] args) {
        Cut_Square_of_N_Array cutSquareOfNArray = new Cut_Square_of_N_Array();
        int a = 3;
        long l = 2, r = 5;
        for(int i : cutSquareOfNArray.solution(a, l, r))
            System.out.println(i);
    }
}
