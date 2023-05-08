package Lv_2.day40;

public class Create_JadenCase_String {
    public String solution(String s) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            if(i == 0)
                answer += String.valueOf(s.charAt(i)).toUpperCase();
            else if(s.charAt(i) == ' '){
                if(i == s.length()-1)
                    return answer += ' ';
                else if(s.charAt(i+1) == ' ')
                    answer += ' ';
                else{
                    answer += ' ' + String.valueOf(s.charAt(i+1)).toUpperCase();
                    i += 1;
                }
            }
            else
                answer += String.valueOf(s.charAt(i)).toLowerCase();
        }
        return answer;
    }

    public static void main(String[] args) {
        Create_JadenCase_String createJadenCaseString = new Create_JadenCase_String();
        String a = "3people unFollowed me"; // "for the last week"
        System.out.println(createJadenCaseString.solution(a));
    }
}
