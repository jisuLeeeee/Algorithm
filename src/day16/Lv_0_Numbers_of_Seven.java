package day16;

public class Lv_0_Numbers_of_Seven {
    public int solution(int[] array) {
        int answer = 0;

        for(int i=0; i<array.length; i++){
            while(array[i] != 0){
                if(array[i] % 10 == 7){
                    answer++;
                    array[i] /= 10;
                }
                else
                    array[i] /= 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Numbers_of_Seven numbersOfSeven = new Lv_0_Numbers_of_Seven();
        int[] a = {7,77,17};
        System.out.println(numbersOfSeven.solution(a));
    }
}
