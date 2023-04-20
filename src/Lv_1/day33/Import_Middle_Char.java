package Lv_1.day33;

public class Import_Middle_Char {
    public String solution(String s) {
        String answer = "";

        if(s.length() % 2 != 0){
            answer = s.substring(s.length() / 2, (s.length() / 2) + 1);
        } else{
            answer = s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Import_Middle_Char importMiddleChar = new Import_Middle_Char();
        String a = "finish";
        System.out.println(importMiddleChar.solution(a));
    }
}
