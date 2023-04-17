package day30;

public class Lv_1_Reverse_Natural_Number_to_Array {
    public int[] solution(long n) {
        String[] arr = String.valueOf(n).split("");
        int[] answer = new int[arr.length];

        for(int i=1; i<=arr.length; i++){
            answer[i - 1] = Integer.parseInt(arr[arr.length - i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Lv_1_Reverse_Natural_Number_to_Array reverseNaturalNumberToArray = new Lv_1_Reverse_Natural_Number_to_Array();
        long a = 12345;
        for(int i : reverseNaturalNumberToArray.solution(a))
            System.out.println(i);
    }
}
