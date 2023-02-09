package day19;

public class Lv_0_Addition_of_Fractions {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer_sum = 0, denom_sum = 0;

        numer_sum = (numer1 * denom2) + (numer2 * denom1);
        denom_sum = denom1 * denom2;

        answer[0] = numer_sum;
        answer[1] = denom_sum;

        for(int i=1; i<=numer_sum && i<=denom_sum; i++){
            if(numer_sum % i == 0 && denom_sum % i == 0){
                answer[0] = numer_sum / i;
                answer[1] = denom_sum / i;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Addition_of_Fractions additionOfFractions = new Lv_0_Addition_of_Fractions();
        int a = 1, b = 2, c = 3, d = 4;
        for(int i : additionOfFractions.solution(a, b, c, d))
            System.out.println(i);
    }
}
