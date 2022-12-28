package day6;

public class Lv_0_Reverse_String {
    public String solution(String my_string) {
        String answer = "";
        String[] str_arr = my_string.split("");

        for(int i = 0; i < str_arr.length; i++){
            answer += str_arr[str_arr.length - i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Reverse_String reverseString = new Lv_0_Reverse_String();
        String my_string = "abcde";
        System.out.println(reverseString.solution(my_string));
    }
}
