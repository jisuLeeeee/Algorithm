package day30;

public class Lv_1_Add_The_Number_Of_Digits {
    public int solution(int n) {
        int answer = 0;
        String[] arr = String.valueOf(n).split("");

        for(int i=0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_1_Add_The_Number_Of_Digits addTheNumberOfDigits = new Lv_1_Add_The_Number_Of_Digits();
        int a = 987;
        System.out.println(addTheNumberOfDigits.solution(a));
    }
}
