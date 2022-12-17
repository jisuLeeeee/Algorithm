package day3;

public class Lv_0_Taller_Than {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i =0; i < array.length; i++){
            if(array[i] > height)
                answer ++;
        }
        return answer;
    }
}
