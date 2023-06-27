package Lv_2.day66;

public class Find_Decimal_In_K_Number {
    public int solution(int n, int k) {
        int answer = 0;
        String str = "";
        while(n > 0){
            str = (n % k) + str;
            n /= k;
        }

        String decimal = "";
        for(String s : str.split("")){
            if(s.equals("0") && !decimal.equals("")){
                answer += Decimal(Long.parseLong(decimal));
                decimal = "";
            }
            else{
                decimal += s;
            }
        }
        answer += Decimal(Long.parseLong(decimal));

        return answer;
    }
    public int Decimal(long d){
        int ans = 1;
        if(d < 2)
            return 0;
        for(int i=2; i<=Math.sqrt(d); i++){
            if((d % i) == 0){
                return 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Find_Decimal_In_K_Number findDecimalInKNumber = new Find_Decimal_In_K_Number();
        int n = 437674	, k = 3;
        System.out.println(findDecimalInKNumber.solution(n, k));
    }
}
