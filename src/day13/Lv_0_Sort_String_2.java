package day13;
import java.util.Arrays;

public class Lv_0_Sort_String_2 {
    public String solution(String my_string) {
        String answer = "";
        String[] str_arr = my_string.toLowerCase().split("");

        Arrays.sort(str_arr);

        for(int i=0; i<str_arr.length; i++)
            answer += str_arr[i];

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Sort_String_2 sortString2 = new Lv_0_Sort_String_2();
        String a = "Bced";
        System.out.println(sortString2.solution(a));
    }
}
