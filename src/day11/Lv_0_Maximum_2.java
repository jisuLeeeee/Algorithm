package day11;

public class Lv_0_Maximum_2 {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                if(numbers[i] * numbers[j] > answer && i != j)
                    answer = numbers[i] * numbers[j];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_Maximum_2 maximum2 = new Lv_0_Maximum_2();
        int[] a = {1, 2, -3, 4, -5};
        System.out.println(maximum2.solution(a));
    }
}
