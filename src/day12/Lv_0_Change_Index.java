package day12;

public class Lv_0_Change_Index {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str_arr = my_string.split("");
        String str1 = str_arr[num1];

        str_arr[num1] = str_arr[num2];
        str_arr[num2] = str1;

        for(int i=0; i<str_arr.length; i++)
            answer += str_arr[i];

        return answer;
    }

    public static void main(String[] args) {
        Lv_0_Change_Index changeIndex = new Lv_0_Change_Index();
        String a = "hello";
        int b = 1, c = 2;
        System.out.println(changeIndex.solution(a, b, c));
    }
}
