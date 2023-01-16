package day15;

public class Lv_0_Close_Number {
    public int solution(int[] array, int n) {
        int answer = Integer.MAX_VALUE, answer2 = Integer.MAX_VALUE;
        int min =  Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int idx = 0;

        for(int i=0; i<array.length; i++){
            if(Math.abs(answer - n) > Math.abs(array[i] - n)){
                min = Math.abs(array[i] - n);
                answer = array[i];
                idx = i;
            }
        }
        for(int i=0; i<array.length; i++){
            if(idx != i && Math.abs(answer2 - n) > Math.abs(array[i] - n)){
                min2 = Math.abs(array[i] - n);
                answer2 = array[i];
            }
        }
        if(min == min2)
            if(answer > answer2)
                return answer2;
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Close_Number closeNumber = new Lv_0_Close_Number();
        int[] a = {3, 10, 28};
        int b = 20;
        System.out.println(closeNumber.solution(a, b));

    }
}
