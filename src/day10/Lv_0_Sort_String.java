package day10;

import java.util.Arrays;

public class Lv_0_Sort_String {
    public int[] solution(String my_string) {
    int[] answer;

    String[] str_arr = my_string.replaceAll("[^0-9]", "").split("");
    answer = new int[str_arr.length];
    for(int i=0; i<str_arr.length; i++){
        answer[i] = Integer.parseInt(str_arr[i]);
    }
    Arrays.sort(answer);

    return answer;
}
    public static void main(String[] args) {
        Lv_0_Sort_String sortString = new Lv_0_Sort_String();
        String a = "hi12392";
        for(int i:sortString.solution(a))
            System.out.println(i);
    }
}
