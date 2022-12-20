package day4;

public class Lv_0_Reverse_Array {

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i = num_list.length - 1, j=0; i >= 0; i--, j++){
            answer[j] = num_list[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Reverse_Array s = new Lv_0_Reverse_Array();
        int[] a = {5, 9, 7, 10};
        for(int i:s.solution(a)){
            System.out.println(i);
        }
    }
}
