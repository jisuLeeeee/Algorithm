package day6;

public class Lv_0_Even_Odd_Numbers {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i : num_list){
            if(i % 2 == 0){
                answer[0] += 1;
            }
            else{
                answer[1] += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Even_Odd_Numbers evenOddNumbers = new Lv_0_Even_Odd_Numbers();
        int[] a = {1,2,3,4,5};
        for(int i:evenOddNumbers.solution(a)){
            System.out.println(i);
        }
    }
}
