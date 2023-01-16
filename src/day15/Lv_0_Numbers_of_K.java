package day15;

public class Lv_0_Numbers_of_K {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int i1 = i; i1 <= j; i1++){
            int z = i1;
            while(z != 0){
                if(z % 10 == k){
                    answer++;
                    z /= 10;
                }
                else{
                    z /= 10;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Numbers_of_K numbersOfK = new Lv_0_Numbers_of_K();
        int a = 10, b = 50, c = 5;
        System.out.println(numbersOfK.solution(a, b, c));
    }
}
