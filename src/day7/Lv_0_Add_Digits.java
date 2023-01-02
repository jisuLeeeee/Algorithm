package day7;

public class Lv_0_Add_Digits {
    public int solution(int n) {
        int answer = 0;
        String n_str = Integer.toString(n);
        String[] n_arr = n_str.split("");

        for(int i=0; i<n_arr.length; i++){
            answer += Integer.parseInt(n_arr[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Add_Digits addDigits = new Lv_0_Add_Digits();
        int n = 1234;
        System.out.println(addDigits.solution(n));
    }
}
