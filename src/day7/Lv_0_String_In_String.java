package day7;

public class Lv_0_String_In_String {
    public int solution(String str1, String str2) {
        int answer = 0;

        if(str1.indexOf(str2) != -1)
            answer = 1; // 문자열 있을 경우
        else
            answer = 2; // 문자열 없을 경우

        return answer;
    }
    public static void main(String[] args) {
        Lv_0_String_In_String stringInString = new Lv_0_String_In_String();
        String a = "ab6CDE443fgh22iJKlmn1o", b = "6CDE";
        System.out.println(stringInString.solution(a, b));
    }
}
