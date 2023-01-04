package day9;

public class Lv_0_Choose_Multiple_of_n {
    public int[] solution(int n, int[] numlist) {
        int[] answer;
        int count=0, idx=0;

        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0)
                count++;
        }
        answer = new int[count];

        for(int i=0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[idx] = numlist[i];
                idx++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Choose_Multiple_of_n chooseMultipleOfN = new Lv_0_Choose_Multiple_of_n();
        int a = 3;
        int[] b = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        for(int i:chooseMultipleOfN.solution(a, b)) {
            System.out.println(i);
        }
    }
}
