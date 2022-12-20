package day5;

public class Lv_0_Maximum_1 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;
        int idx = 0;

        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
                idx = i;
            }
        }
        for(int i = 0; i < numbers.length; i++){
            if(i != idx && answer < max * numbers[i]){
                answer = max * numbers[i];
            }
        }
        return answer;
    }
}
