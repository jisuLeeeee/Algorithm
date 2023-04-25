package Lv_1.day34;

public class String_Handling {
    public boolean solution(String s) {
        boolean answer = true;

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i)) && (s.length() == 4 || s.length() == 6))
                continue;
            else
                return false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String_Handling stringHandling = new String_Handling();
        String a = "1234";
        System.out.println(stringHandling.solution(a));
    }
}
